package reader;

import model.Response;
import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * This class reads in the Questionnaire responses that are recorded
 * in the questionnaire.csv file found under the resources directory.
 * Using {@link CSVRecord} from Apache, wew convert each row into a
 * {@link Response} object.
 */
public class QuestionnaireReader {
  public List<Response> readFile(File file) {
    List<Response> responses = new ArrayList<>();
    try {
      Reader in = new FileReader(file.getPath());
      Iterable<CSVRecord> records = CSVFormat.EXCEL.RFC4180.withFirstRecordAsHeader().parse(in);
      for (CSVRecord record : records) {
        responses.add(Response.fromCsvRecord(record));
      }
    } catch (IOException e) {
      e.printStackTrace();
      System.out.println("An error occurred opening the questionnaire!");
    }
    return responses;
  }
}
