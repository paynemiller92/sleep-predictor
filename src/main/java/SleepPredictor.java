import engine.SleepExerciseAnalyzer;
import engine.SleepPredictorEngine;
import model.PerformanceMeasure;
import model.Response;
import org.apache.spark.SparkConf;
import org.apache.spark.api.java.JavaSparkContext;
import reader.QuestionnaireReader;

import java.io.File;
import java.net.URL;
import java.util.List;

public class SleepPredictor {
  private static final String FILE_NAME = "questionnaire.csv";

  public static void main(String[] args) {
    List<Response> responses = loadResponses();
    runAnalyticalCalculations(responses);
    runPredictiveCalculations(responses);
  }

  private static List<Response> loadResponses() {
    URL fileLocation = ClassLoader.getSystemClassLoader().getResource(FILE_NAME);
    File file = new File(fileLocation.getFile());
    return new QuestionnaireReader().readFile(file);
  }

  private static void runAnalyticalCalculations(List<Response> responses) {
    SleepExerciseAnalyzer analyzer = new SleepExerciseAnalyzer();
    PerformanceMeasure trainingSetPerformanceMeasures = analyzer.calculatePerformance(responses.subList(0, 100));
    PerformanceMeasure testSetPerformanceMeasures = analyzer.calculatePerformance(responses);

    System.out.println("Training Set " + trainingSetPerformanceMeasures);
    System.out.println("Test Set " + testSetPerformanceMeasures);
  }

  private static void runPredictiveCalculations(List<Response> responses) {
    SparkConf sparkConf = new SparkConf().setAppName("JavaDirectKafkaWordCount").setMaster("local");
    JavaSparkContext javaSparkContext = new JavaSparkContext(sparkConf);
    SleepPredictorEngine engine = SleepPredictorEngine.withContext(javaSparkContext);
    double trainingCorrelation = calculateCorrelation(engine, responses.subList(0, 100));
    double testCorrelation = calculateCorrelation(engine, responses);

    System.out.println("Training Set Pearson correlation: " + trainingCorrelation);
    System.out.println("Test Set Pearson correlation: " + testCorrelation);

//    double testPrediction = calculateRegression(engine, responses);
//
//    System.out.println("Test Set r2 value: " + testPrediction);
  }

  private static double calculateCorrelation(SleepPredictorEngine engine, List<Response> responses) {
    return engine.correlateExerciseToSleep(responses);
  }

  private static double calculateRegression(SleepPredictorEngine engine, List<Response> response) {
    return engine.predictSleep(response);
  }
}
