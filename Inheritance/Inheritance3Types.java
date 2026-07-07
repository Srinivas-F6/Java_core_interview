class Animal{
  
    public void sleep(){
        System.out.println("Animal is sleeping");
    }

    public void walk(){
        System.out.println("Animal is Walking");
    }

    public void sound(){
        System.out.println("Animal is Making sound");
    }

}

class Dog extends Animal{
    
    @Override
    public void sound(){
        System.out.println("Dog sounds Bowwwww");
    }

}


class Cat extends Animal{

    @Override
    public void sound(){
        System.out.println("Cat sounds Meowwwwwwwww");
    }

    @Override
    public void walk(){
        System.out.println("Cat is walking");
    }
}


class Lion extends Animal{
    @Override
    public void sound(){
       System.out.println("Lion roars");
    }
}





public class Inheritance3Types {
    public static void main(String[] args) {

        // Hierarchical inheritance
        // single inheritance
        Dog d = new Dog();
        d.walk();
        d.sleep();
        d.sound();

        Cat c = new Cat();
        c.sound();
        c.walk();
        

        Lion l = new Lion();
        l.sound();
    }
}
