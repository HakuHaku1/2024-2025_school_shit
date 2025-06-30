import java.io.*;
public class reader {
    public static void main(String[] args) {
        try {
            BufferedReader BR = new BufferedReader(new FileReader("C:\\Users\\acost\\OneDrive\\Desktop\\file_input_output\\list_of_name\\japan.txt"));
            String read;

            while((read = BR.readLine()) != null){
                System.out.println(read);
            }
        } catch (Exception e) {
            System.out.println("an exception occured");
        }
    }

}
