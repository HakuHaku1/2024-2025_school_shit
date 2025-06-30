import java.util.Scanner;
import java.util.regex.*;
public class RhymeChecker {

    public void DisplayCode(){
        Scanner input = new Scanner(System.in);
        System.out.print("please enter the 1st word: ");
        String Word_1 = input.nextLine();
        System.out.print("please enter the 2nd word: ");
        String Word_2 =  input.nextLine();

        String sub = Word_1.substring(Word_1.length() - 2 );
        String patternstr = "^[A-Za-z]{1,2}" + sub + "$";
        Pattern P = Pattern.compile(patternstr);
        Matcher Match = P.matcher(Word_2);

        
        if(Match.matches()){
            System.out.println(Word_1 + " and " + Word_2 + " rhymes!");
        }
        else{
            System.out.println(Word_1 + " and " + Word_2 + " does not rhyme!");
        }

        
        input.close();
   
        }
        
    public static void main(String[] args) {
        RhymeChecker display = new RhymeChecker();

        display.DisplayCode();


         
    }

}
