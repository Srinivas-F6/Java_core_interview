interface Laptop{

   public void copy();
   public void paste();
   public void cut();
   public void keyboard();

   default void security(){
    System.out.println("Security");
   }
//    If anyone wants this feature they can override and use it.

}

//From Java 8 onwards, we got default and static methods in interfaces.

// we should implements the method which we are mentioned in Interface.
class Lenovo implements Laptop{
    @Override
    public void copy(){
        System.out.println("Lenovo Copy");
    }

    @Override
    public void paste() {
        System.out.println("Lenovo Paste");
    }

    @Override
    public void cut() {
        System.out.println("Lenovo cut");
    }
    @Override
    public void keyboard() {
        System.out.println("Lenovo keyboard");
    }

    public void camera(){
        System.out.println("Lenovo Camera");
    }
}


class Asus implements Laptop{

    @Override
    public void copy(){
        System.out.println("Asus Copy");
    }

    @Override
    public void paste() {
        System.out.println("Asus Paste");
    }

    @Override
    public void cut() {
        System.out.println("Asus cut");
    }
    @Override
    public void keyboard() {
        System.out.println("Asus keyboard");
    }

    public void camera(){
        System.out.println("Asus Camera");
    }

    @Override
    public void security(){
        System.out.println("Asus Security");
    }

}



public class abstractt {
    public static void main(String[] args) {
        Lenovo l = new Lenovo();
        l.camera();
        l.copy();
        Asus a = new Asus();
        a.camera();
        a.cut();
        a.security();
    }
}
