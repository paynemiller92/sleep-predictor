package engine;

import model.PerformanceMeasure;
import model.Response;

import java.util.List;

public class SleepExerciseAnalyzer {

  public PerformanceMeasure calculatePerformance(List<Response> questionnaireResponses) {
  Double numberOfTruePositives = 0.0;
  Double numberOfFalsePositives = 0.0;
  Double numberOfTrueNegatives = 0.0;
  Double numberOfFalseNegatives = 0.0;

    for (Response response : questionnaireResponses) {
      boolean isExercising = response.getAverageHoursOfModerateExercisePerWeekday() > 10.0;
      boolean isSleepingMoreThanAverage = response.getAverageHoursOfSleepPerWeekday() > 7.0;
      if (isExercising) {
        if (isSleepingMoreThanAverage) {
          numberOfTruePositives += 1.0;
        } else {
          numberOfFalseNegatives += 1.0;
        }
      } else {
        if (isSleepingMoreThanAverage) {
          numberOfFalsePositives += 1.0;
        } else {
          numberOfTrueNegatives += 1.0;
        }
      }
    }

    Double accuracy = (numberOfTruePositives + numberOfTrueNegatives) / questionnaireResponses.size();
    Double precision = numberOfTruePositives / (numberOfTruePositives + numberOfFalsePositives);

    return PerformanceMeasure.withAccuracyAndPrecision(accuracy, precision);
  }
}
