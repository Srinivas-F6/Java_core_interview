

interface Calculator{
    int sum(int a, int b);
    // int sum(int a, int b, int c);
}

class Basic implements Calculator{
    @Override 
    public int sum(int a, int b){
        return a+b;
    }

    public int sum(int a, int b, int c){
        return a+b+c;
    }
}

public class MethodReference {
    public static void main(String[] args) {
        Basic basic = new Basic();
        Calculator c = (a,b) -> basic.sum( a,b);   // This is lambda Expression....
        System.out.println(c.sum(10,30));

        Calculator c1 = basic::sum;    // This is method Reference....
        System.out.println(c1.sum(990,10));

        Calculator d = (a,b) ->basic.sum(a,b);
        System.out.println(d.sum(19,20));

        System.out.println(basic.sum(10,2392,92));
    }
}






/*
 Method Reference
 Method reference is an even shorter & cleaner way to refer a method without executing it.
 It is used in place of a lambda expression when the lambda simply calls an existing method.

 Syntax: className::method name   ----> For a static method of a class.

 Syntax: object::method name ---> For an instance method of an object.  

 
 
Instance method
    ↓
object::method


Static method
    ↓
ClassName::method



The functional interface defines the method signature; the lambda or method reference provides the implementation;
 the values are supplied when the functional-interface method is called.


*/
