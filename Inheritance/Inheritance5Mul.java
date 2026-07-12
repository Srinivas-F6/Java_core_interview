interface Veg{
  public void panner();

   public void mushromm();
}

interface NonVeg{
   void mutton();
   void chicken();
}

abstract class Foodie implements Veg, NonVeg{
 
    @Override
    public void panner(){
        System.out.println("panner curry");
    }

    @Override
    public void mushromm(){
        System.out.println("Mushroom curry");
    }

    public void mutton(){
        System.out.println("iie");
    }
}

class Person extends Foodie{
   @Override
   public void chicken(){
    System.out.println("cc");
   }

   public void mutton(){
    System.out.println("mm");
   }
}

public class Inheritance5Mul{
    public static void main(String[] args){
        Person f = new Person();
        f.panner();
        f.mushromm();
        f.chicken();
        f.mutton();
    }
}