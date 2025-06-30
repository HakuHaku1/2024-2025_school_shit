import java.io.File;
import java.nio.file.Files;
import java.nio.file.attribute.BasicFileAttributes;
import java.io.IOException;


public class File_absolutepath {

    public static void main(String[] args) {
        File file_Path = new File("SUDENT.txt");
        System.out.println("Absolute Path: " + file_Path.getAbsolutePath());

        if(file_Path.exists()){
            System.out.println("it exists");
            System.out.println(file_Path.getAbsolutePath());
            System.out.println(file_Path.isFile());

            try {
                BasicFileAttributes attributes = Files.readAttributes(file_Path.toPath(), BasicFileAttributes.class);
                System.out.println("Creation Time: " + attributes.creationTime());
                System.out.println("Last Modified Time: " + attributes.lastModifiedTime());
                 {   
                };
                
            } catch (IOException e) {
                
                System.out.println("file fialed");
            }
        }
        else{
            System.out.println("file doesnt exist");            
        }
 
    
    }
}
    

