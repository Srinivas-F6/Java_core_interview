public class Calculator{
    int a,b;

    private static Calculator obj;

    private Calculator(){
        System.out.println("Instance Created");
    }

    public static Calculator getInstance(){
        if(obj == null){
            synchronized (Calculator.class) {
                if(obj == null){
                    obj = new Calculator();
                }
            }
        }
        return obj;
    }
    public int sum(){
        return this.a+this.b;
    }
}