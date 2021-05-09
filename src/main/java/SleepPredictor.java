import engine.SleepExerciseAnalyzer;
import engine.SleepPredictorEngine;
import model.PerformanceMeasure;
import model.Response;
import org.apache.spark.SparkConf;
import org.apache.spark.api.java.JavaSparkContext;
import reader.QuestionnaireReader;

import java.io.File;
import java.util.List;
import java.util.Scanner;

public class SleepPredictor {
  public static void main(String[] args) {
    List<Response> responses = loadResponses();
    runAnalyticalCalculations(responses);
    runPredictiveCalculations(responses);
  }

  private static List<Response> loadResponses() {
    Scanner keyboard = new Scanner(System.in);
    System.out.println("Please enter the path to your questionnaire file! (.csv)");
    String pathToQuestionnaire = keyboard.nextLine();
    File file = new File(pathToQuestionnaire);
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

    calculateExerciseToSleepCorrelation(engine, responses);
    calculateNaptimeToSleepCorrelation(engine, responses);
  }

  private static void calculateExerciseToSleepCorrelation(SleepPredictorEngine engine, List<Response> responses) {
    double trainingCorrelation = engine.correlateExerciseToSleep(responses.subList(0, 100));
    double testCorrelation = engine.correlateExerciseToSleep(responses);

    System.out.println("Training Set Pearson correlation: " + trainingCorrelation);
    System.out.println("Test Set Pearson correlation: " + testCorrelation);
  }

  private static void calculateNaptimeToSleepCorrelation(SleepPredictorEngine engine, List<Response> responses) {
    double trainingCorrelation = engine.correlateNapsToSleep(responses.subList(0, 100));
    double testCorrelation = engine.correlateNapsToSleep(responses);

    System.out.println("Training Set Nap-to-Sleep Pearson correlation: " + trainingCorrelation);
    System.out.println("Test Set Nap-to-Sleep Pearson correlation: " + testCorrelation);
  }
}
