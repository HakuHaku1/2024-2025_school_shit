import java.util.Random;
import java.util.Scanner;

public class RPS_Game {
        
    Random Game_Randomization = new Random();

    String[] Game_Decision = {"Rock", "Paper", "Scissor"};


    int final_RPS = Game_Randomization.nextInt(Game_Decision.length);


    }

 class RPS_Process {
    public static void main(String[] args) {

        Scanner RPS_Input = new Scanner(System.in);
        RPS_Game output = new RPS_Game();
        RPS_Guide intruction_guide_RPS = new RPS_Guide();
        String RPS_Answer = output.Game_Decision[output.final_RPS];

        while (true) {
            intruction_guide_RPS.Instruction_RPS();
            System.out.println("plesse choose wisely");
            String change = RPS_Input.next();

            if(change.equalsIgnoreCase("rock") == RPS_Answer.equalsIgnoreCase("rock") ){
                System.out.println("It's a tie");

                
            }
            else if(change.equalsIgnoreCase("rock") == RPS_Answer.equalsIgnoreCase("paper")){
                System.out.println("you lose!");

            }
            else if(change.equalsIgnoreCase("rock") == RPS_Answer.equalsIgnoreCase("scissor")){
                
                System.out.println("you win!");


            }

        }
        
        
    }

}
 


 




