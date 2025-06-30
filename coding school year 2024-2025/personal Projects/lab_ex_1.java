

public class lab_ex_1 {

    public static class Color{
        public enum Colortype{
            RED, BLUE, GREEN, BLACK , WHITE, BROWN
        }
    }

    public static class Model{
        public enum Modeltype{
            SEDAN, SUV, CONVERTIBLE,  HATCHBACK
        }
    }

    public static class Car{
        private int year;
        private Model.Modeltype model;
        private Color.Colortype color;

        public Car(int yrs, Model.Modeltype m, Color.Colortype c){
            year = yrs;
            model = m;
            color = c;

        }
        public void displayinfo(){
            System.out.println("Year: " + year );
            System.out.println("Model: " + model);
            System.out.println("Color: " + color);
            System.out.println("");

        }


        
    }
    public class Cardemo{
        public static void main(String[] args) {
            Car car1 = new Car(2020, Model.Modeltype.CONVERTIBLE, Color.Colortype.RED);
            Car car2 = new Car(1999, Model.Modeltype.SEDAN, Color.Colortype.BLACK);
            car1.displayinfo();
            car2.displayinfo();
        }
    }


}


