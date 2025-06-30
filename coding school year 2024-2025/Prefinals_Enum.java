public class Prefinals_Enum {

    public static class Name{
        public enum name {
            Hakuryu, Joshua, Miki, Misa, Justine 

        }
    }
    public static class Occupation{
        public enum occupation{
            Student, Senior_Analyst, Cook, PWD

        }
    }
    
    public static class data{
        private Name.name n;
        private Occupation.occupation employment;
        private int age;

        public data(int yrs, Name.name N, Occupation.occupation Employement){
            n = N;
            employment = Employement;
            age = yrs;

        }
        public void displayinfo(){
            System.out.println("name of the family member: " + n);
            System.out.println("age: " + age);
            System.out.println("occupation: " + employment);

        }

        


    }
    public static void main(String[] args) {
        data person = new data(28,Name.name.Hakuryu, Occupation.occupation.Student);
        person.displayinfo();
        
    }

}
        

    


