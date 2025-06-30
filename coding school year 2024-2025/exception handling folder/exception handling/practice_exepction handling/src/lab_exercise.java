
public class lab_exercise {

    public static void main(String[] args){
        try{
            int[] index = {1,2,3,4};
            int x = 9;
            int y = 0;
            int z = x/y;
            System.out.println("the number you entered is " + index[8]);
            System.out.println(z);


        }
        catch(ArithmeticException arithmeticException){
            System.out.println("Exception occurred: " + arithmeticException);
        }
        catch(ArrayIndexOutOfBoundsException index_Exception){
            System.out.println("Exception occured: " + index_Exception);
        }

        finally{
            System.out.println("exception handling exercise completed! ");
        }        try{
            throw new RuntimeException("new exception");
        }
        catch( RuntimeException Runtime_exception){
            System.out.println("Exception occured" + Runtime_exception );
        }
    }
}