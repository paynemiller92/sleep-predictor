package engine;

import model.Response;
import org.apache.spark.api.java.JavaRDD;
import org.apache.spark.api.java.JavaSparkContext;
import org.apache.spark.mllib.stat.Statistics;

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

  public double correlateScreentimeToSleep(List<Response> questionnaireResponses) {
    List screenTime = questionnaireResponses.stream()
            .map(response -> (double) response.getMinutesOfComputerTime())
            .collect(Collectors.toList());

    List sleepHours = getSleepHours(questionnaireResponses);

    JavaRDD<Double> xSeries = spark.parallelize(screenTime);
    JavaRDD<Double> ySeries = spark.parallelize(sleepHours);

    double correlation = Statistics.corr(xSeries, ySeries, "pearson");
    return correlation;
  }

  private List getSleepHours(List<Response> questionnaireResponses) {
    return questionnaireResponses.stream()
            .map(response -> (double) response.getAverageHoursOfSleepPerWeekday())
            .collect(Collectors.toList());
  }
}
