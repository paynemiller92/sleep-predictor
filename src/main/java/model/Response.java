package model;


import lombok.Getter;
import lombok.Setter;
import org.apache.commons.csv.CSVRecord;

public class Response {
  @Getter
  @Setter
  private int age;

  public static Response fromCsvRecord(CSVRecord record) {
    Response response = new Response();
    response.setAge(readAge(record));
    return response;
  }

  private static int readAge(CSVRecord record) {
    String ageString = record.get(Field.AGE);
    Integer age = DefaultValue.AGE;
    try {
      age = Integer.valueOf(ageString.trim());
    } catch (NumberFormatException e) {
      System.out.println("Invalid age detected: ".concat(ageString));
    }
    return age;
  }

  private static class Field {
    static String AGE = "age";
  }

  private static class DefaultValue {
    static int AGE = 0;
  }
}
