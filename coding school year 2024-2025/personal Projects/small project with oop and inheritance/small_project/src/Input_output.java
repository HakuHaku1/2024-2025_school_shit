import java.util.Scanner;
public class Input_output {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        Scanner Choices = new Scanner(System.in);

        System.out.print("Hello to my application!, please enter your name!");
        String User_name = input.nextLine(); 


        while(User_name.isEmpty()){

            if (User_name == ""){
                System.out.print("please enter your name: ");
                User_name = input.nextLine(); 
            } 
        }

        System.out.println(" ");
        System.out.println("hello " + User_name + " please enter these feature of the application");

        System.out.print("""
            
                Genre randomization = GR
                Theme randomization = TR
                Rock Paper Scissor game = RPS
                End
                
                Enter: """);
        String Users_Choices = Choices.nextLine();
        
        
         
    }

}


