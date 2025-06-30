import java.util.regex.*;

import java.util.*;
public class Prefinals_Regex {
        private Scanner scan = new Scanner(System.in);

        public void Patternized(){
            System.out.print("please enter your Worker ID letter: ");
            String letter_id = scan.nextLine();
            System.out.print("please enter your Worker ID number: ");
            String number_id = scan.nextLine();

            Pattern p = Pattern.compile("worker [abc]$");
            Matcher match_letter = p.matcher( letter_id);
            Pattern q = Pattern.compile("worker [0-9]{0,3}|1000$");
            Matcher match_number = q.matcher(number_id);

            if(match_letter.matches() && match_number.matches()){
                System.out.println("welcome worker "  );
            }
            else{
                System.out.println("worker not found");
            }
        }
        public static void main(String[] args) {
            Prefinals_Regex pattern = new Prefinals_Regex();
            pattern.Patternized();
        }
}







        
        
    


