class Animal{
  
    public void eating(){
        System.out.println("Animal is eating");
    }

    public void walk(){
        System.out.println("Animal is walking");
    }
}

class Dog extends Animal{
    @Override
    public void eating(){
        System.out.println("Dog is eating");
    }
}

class Puppy extends Dog{
   public void sound(){
      System.out.println("Dog sounds baawwwwww");
   }
}

public class Inheritance4Types {

    // multilevel inheritance
    public static void main(String[] args) {
        Puppy p = new Puppy();
        p.eating();
        p.walk();
        p.sound();
    }
}
