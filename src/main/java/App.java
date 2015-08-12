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
    String computerChoice = computerStringOptions[computerRandom];
    String [][] moves = {
      { "rock", "paper", },
      { "scissors", "rock", },
      { "paper", "scissors", },
    };
    System.out.println(computerChoice);

    }

  public Boolean checkWinner(String input1, String input2) {

    return false;

    }
}
