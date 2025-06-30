import java.io.*;
public class writer {
    public static void main(String[] args) {
        try {
            BufferedWriter BF = new BufferedWriter(
                new FileWriter("C:\\Users\\acost\\OneDrive\\Desktop\\file_input_output\\list_of_name\\japan.txt"));

                BF.write("japan is cool as fuck!");
                BF.close();
        } catch (Exception e) {
            System.out.println("something went wrong");
        } 
        
    }


    
}
