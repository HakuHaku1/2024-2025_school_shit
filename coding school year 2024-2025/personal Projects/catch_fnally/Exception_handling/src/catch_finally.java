import java.util.Scanner;
public class catch_finally {
  public static void main(String[] args ){
    Scanner input = new Scanner(System.in);

    while(true ){
        try {
            System.out.print("Enter a positive number: ");
            int number = input.nextInt();

            if (number > 0) {
                System.out.println("number is correcto");
                break;  // Skips the remaining code and restarts the loop
            }
            else{
                System.out.println("number should be always postive");
                continue;
            }
        }
        catch(Exception e){
            System.out.println("an exception occured: ");
            String reset = input.nextLine();

        }


    }
  }  
}
