import java.util.List;
import java.util.Arrays;
import static spark.Spark.*;
import java.util.ArrayList;
import java.util.Random;
import java.io.Console;
import spark.template.velocity.VelocityTemplateEngine;
import java.util.Map;
import java.util.HashMap;
import spark.ModelAndView;


public class App {

  public static void main(String[] args) {
    String layout = "templates/layout.vtl";

    get("/", (request, response) -> {
            Map<String, Object> model = new HashMap<String, Object>();
            model.put("template", "templates/home.vtl");
            return new ModelAndView(model, layout);
        }, new VelocityTemplateEngine());


        get("/detector", (request, response) -> {
          Map<String, Object> model = new HashMap<String, Object>();
          model.put("template", "templates/detector.vtl");

          //word variable userInputtedWord
          // grab which word is entered in the form
          // String userInputtedWord = request.queryParams("word");
          // Integer wordScore = getWordScore(userInputtedWord);
          // model.put("wordScore", wordScore);
          // model.put("word", userInputtedWord);
          return new ModelAndView(model, layout);
          }, new VelocityTemplateEngine());

    Console myConsole = System.console();
    Random randomGenerator = new Random();
    // Random randomNum = new Random();
    ArrayList<String> computerOptions = new ArrayList<String>(); {{
      computerOptions.add("rock");
      computerOptions.add("paper");
      computerOptions.add("scissors");
    }};
    //double brace initialization

    String computerStringOptions[] = new String[computerOptions.size()];
    String array[] = new String[computerOptions.size()];
      for(int i =0;i<computerOptions.size();i++){
        array[i] = computerOptions.get(i);
      }

    //random number between 0 and 2
    int computerRandom = randomGenerator.nextInt(3);
    //array of moves: move name, beaten by
    String computerInput = computerStringOptions[computerRandom];
    String [][] moves = {
      { "rock", "paper", },
      { "scissors", "rock", },
      { "paper", "scissors", },
    };
    System.out.println(computerInput);

    }

  public Boolean checkWinner(String userInput, String computerInput) {

    return false;

    }
}
