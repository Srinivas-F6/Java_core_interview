
@FunctionalInterface
interface MyInterface{
    public void method1();   // Here can only declare one abstract and multiple default and static methods.
    default void method2(){

    }
    static void method3(){

    }
}

class Child implements MyInterface{
    public void method1(){
        System.out.println("eeeeeee");
    }
}

public class FunctionalInterfacee {
    public static void main(String[] args) {
        
    }
}











/* 
 Functional Interface  is an interface that contains exactly one Abstract(unimplemented) method making it suitable for use with
 Lambda Expressions and Method References.

 A interface will be considered as a functional interface:

  1. It should have only one abstract(unimplemented) method.
  2. It can have multiple static and default methods.
  3. It is optional to mention @FunctionalInterface on top of it.

  @FunctionalInterface is an annotation that indicates an interface is intended to be a functional interface.
  It ensures at compile time that the interface contains exactly one abstract method.
  After declaring annotation, we declare more than one abstract method it throws an error at compile-time.



  1.predicate<Integer> is a functional Interface in which the input is Integer and always output is boolean. 
  2.Function<Integer,String> is a functional Interface in which the input is Integer and output is String.
  



*/

