package engine;

import model.Response;
import org.apache.spark.api.java.JavaRDD;
import org.apache.spark.api.java.JavaSparkContext;
import org.apache.spark.ml.regression.LinearRegression;
import org.apache.spark.ml.regression.LinearRegressionModel;
import org.apache.spark.mllib.stat.Statistics;
import org.apache.spark.sql.Dataset;
import org.apache.spark.sql.Encoders;
import org.apache.spark.sql.SQLContext;

import java.util.List;
import java.util.stream.Collectors;

public class SleepPredictorEngine {
  private JavaSparkContext spark;

  private SleepPredictorEngine(JavaSparkContext spark) {
    this.spark = spark;
  }

  public static SleepPredictorEngine withContext(JavaSparkContext context) {
    return new SleepPredictorEngine(context);
  }

  public double correlateExerciseToSleep(List<Response> questionnaireResponses) {
    List exerciseHours = questionnaireResponses.stream()
            .map(response -> (double) response.getAverageHoursOfModerateExercisePerWeekday())
            .collect(Collectors.toList());

    List sleepHours = getSleepHours(questionnaireResponses);

    JavaRDD<Double> xSeries = spark.parallelize(exerciseHours);
    JavaRDD<Double> ySeries = spark.parallelize(sleepHours);

    double correlation = Statistics.corr(xSeries, ySeries, "pearson");
    return correlation;
  }

  public double correlateNapsToSleep(List<Response> questionnaireResponses) {
    List napTime = questionnaireResponses.stream()
            .map(response -> (double) response.getAverageWeekdayNapInMinutes())
            .collect(Collectors.toList());

    List sleepHours = getSleepHours(questionnaireResponses);

    JavaRDD<Double> xSeries = spark.parallelize(napTime);
    JavaRDD<Double> ySeries = spark.parallelize(sleepHours);

    double correlation = Statistics.corr(xSeries, ySeries, "pearson");
    return correlation;
  }

  private List getSleepHours(List<Response> questionnaireResponses) {
    return questionnaireResponses.stream()
            .map(response -> (double) response.getAverageHoursOfSleepPerWeekday())
            .collect(Collectors.toList());
  }

  public double predictSleep(List<Response> questionnaireResponses) {
    List<String> data = questionnaireResponses.stream()
            .map(response -> response.getAverageHoursOfSleepPerWeekday() + "," + response.getAverageHoursOfModerateExercisePerWeekday())
            .collect(Collectors.toList());

    SQLContext sqc = new SQLContext(spark);


    Dataset<String> training = sqc.createDataset(data, Encoders.STRING());

    LinearRegression linearRegression = new LinearRegression()
            .setMaxIter(10)
            .setRegParam(0.3)
            .setElasticNetParam(0.8);

    LinearRegressionModel model = linearRegression.fit(training);

    return model.summary().r2();
  }
}
