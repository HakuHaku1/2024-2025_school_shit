import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class exception_handling {
    public static void main(String[] args)  {
        Scanner input = new Scanner(System.in);

        try{
            System.out.println("please enter the number you want to divide: ");
            int x = input.nextInt();
            System.out.println("please enter the number that you want to divide by : ");
            int y = input.nextInt();
            int final_sum = x / y;

            
            System.out.println(final_sum);;
        }

        catch(ArithmeticException Arthmetic_exception){
            System.out.println("Exception occured: " + Arthmetic_exception);
        
        }
            
        catch(InputMismatchException Input_Mismatch){
            System.out.println("Exception occurred: " + Input_Mismatch);
        
        }

        catch(NoSuchElementException Element_Exception){
            System.out.println("Exception occured" +  Element_Exception );
        
        }
        try{
            throw new RuntimeException("new exception");
        }
        catch( RuntimeException Runtime_exception){
            System.out.println("Exception occured" + Runtime_exception );
        
             
        }
        try{
            int[] index = {1,2,3,4}; 
            System.out.println("the number you entered is " + index[8]);
        }
        catch(ArrayIndexOutOfBoundsException index_Exception){
            System.out.println("Exception occured: " + index_Exception);
        }

        input.close();
    }
}
