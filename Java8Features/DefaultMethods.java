
interface Car{
    
    String model = "www";

    default void start(){
        System.out.println("car is starting");
    }

    static void model(){
        System.out.println(model);
    }


    void sound();
}

class Porsche implements Car{

    @Override 
    public void sound(){
        System.out.println("bbbbbbbbmmmmmmmmmmmm");
    }

}


public class DefaultMethods {
    public static void main(String[] args) {
        Car c = new Porsche();
        c.sound();
        c.start();
        Car.model();      // c.model() doesn't works because the static method only belongs to the Car interface, not child classes
    }
}












//  we should use default keyword for defining the default methods.
// Before default method, we need to implement the new method in all the implementing classes. After Java 8 features, we simply declare 
// inside the interface.

// Java 8 allowed static and default methods inside interfaces
// static methods only belongs to the declared classes, it is not possible to call using child references. static methods should have body

