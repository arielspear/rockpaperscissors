import java.util.List;
import java.util.Arrays;
import static spark.Spark.*;
import java.util.ArrayList;
import java.util.Random;

public class App {

  public static void main(String[] args) {

    Random randomGenerator = new Random();
    Integer randomNum = new Random();
    ArrayList<String> computerOptions = ["rock", "paper", "scissors"];
    //random number between 0 and 2
    Integer computerRandomInt = randomGenerator.nextInt(3);
    //array of moves: move name, beaten by
    String computerChoice = computerOptions[computerRandomInt];
    String [][] moves = {
      { "rock", "paper", },
      { "scissors", "rock", },
      { "paper", "scissors", },
    };


    }

  public Boolean checkWinner(String input1, String input2) {
    
    return false;


    }
}
