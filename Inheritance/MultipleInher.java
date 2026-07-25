
interface Father{
    public void property();
}

interface GrandFather{
    public void property();
    public void surname();
}

class Child implements Father,GrandFather{
     @Override
      public void property(){
         System.out.println("property");
      }

      @Override
      public void surname(){
        System.out.print("surname");
      }
}

public class MultipleInher {
    public static void main(String[] args) {
        Child c = new Child();
        c.property();
        c.surname();
    }
}
