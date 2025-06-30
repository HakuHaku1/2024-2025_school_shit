class Hakuryu { // Superclass (parent)
  
  public void name() {
    System.out.println("I am great at video games!");
  
  }
  public void song(){
    System.out.println("my favorite genre song is Punk rock!");
  
  }
  
}

class firstname extends Hakuryu { // Subclass (child)
  public void name() {
    super.name(); // Call the superclass method
    System.out.println("I am 5'7ft/170cm ");    
  
  }
}

 class Main{    
        public static void main(String[] args){
            firstname superclass = new firstname();
            superclass.name();

            superclass.song(); 
        }
    }
