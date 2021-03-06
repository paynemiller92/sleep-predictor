import model.Response;
import reader.QuestionnaireReader;

import java.io.File;
import java.net.URL;
import java.util.List;

public class Runner {
  private static final String FILE_NAME = "questionnaire.csv";

  public static void main(String[] args) {
    URL fileLocation = ClassLoader.getSystemClassLoader().getResource(FILE_NAME);
    File file = new File(fileLocation.getFile());
    List<Response> responses = new QuestionnaireReader().readFile(file);
    responses.get(0);
  }
}
