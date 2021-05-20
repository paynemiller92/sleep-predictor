package model;

/**
 * This class is a data encapsulation class
 * that represents a performance measure created
 * by {@link engine.SleepExerciseAnalyzer}. It holds
 * two properties: accuracy and precision.
 */
public class PerformanceMeasure {
  private Double accuracy;
  private Double precision;

  private PerformanceMeasure(Double accuracy, Double precision) {
    this.accuracy = accuracy;
    this.precision = precision;
  }

  public static PerformanceMeasure withAccuracyAndPrecision(Double accuracy, Double precision) {
    return new PerformanceMeasure(accuracy, precision);
  }

  @Override
  public String toString() {
    return "Performance Measures \n" +
            "Accuracy: " + accuracy + "\n" +
            "Precision: " + precision + "\n";
  }
}
