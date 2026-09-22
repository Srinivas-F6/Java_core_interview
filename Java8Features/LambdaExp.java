
@FunctionalInterface 
interface Vehicle{
    void start();
}

@FunctionalInterface 
interface Calculator{
    int mul(int a, int b, int c);
}

class Bike implements Vehicle{
    @Override 
    public void start(){
        System.out.println("Bike is starting");
    }
}

class Car implements Vehicle{
    @Override 
    public void start(){
        System.out.println("Car is starting");
    }
}


public class LambdaExp {
    public static void main(String[] args) {
        // Vehicle v = new Vehicle(){
        //     @Override 
        //     public void start(){
        //         System.out.println("Vehicle is starting");
        //     }
        // };                This is how we call start method without lambda expressions.

        Vehicle v = ()->{
            System.out.println("Vehicle is Starting");
        };
        v.start();


        Calculator c = (int a,int b,int d) ->{
            return a*b*d;
        };
        System.out.println(c.mul(3,4,2));

    }
}





/*
 Lambda Expressions are a concise way to represent the implementation of a functional interface using a short, readable syntax.
 They are designed to reduce a lot of boilerplate code.

*/