import java.util.Scanner;
public class databarbershop{
    public static void main(String[] args)  {
           Scanner input = new Scanner(System.in);
           CreateBarbershopServices haircut = new CreateBarbershopServices();
           CreateBarbershopServices color_hair = new CreateBarbershopServices();
           haircut.setPrice(19.9);
           color_hair.setPrice(799.9);

           System.out.print("please enter the service you want to know about: ");
           String inputer = input.nextLine();

           if(inputer.equalsIgnoreCase("haircut")){
            System.out.println("the price of the haircut is: " + haircut.getPrice());
            
            
           }

           else if(inputer.equalsIgnoreCase("haircolor")){
            System.out.println("the price of the haircut is:  " + color_hair.getPrice());
           }


           input.close();
             }
    }

    