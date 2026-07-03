class Calculator{
    public int add(int a, int b){
        return a+b;
    }
    public int sub(int a, int b){
        return a-b;
    }
}

class AdvCalculator extends Calculator{
    public int mul(int a, int b){
        return a*b;
    }
    public int div(int c, int d){
        return c/d;
    }
}

public class Single{
    public static void main(String[] args) {
        AdvCalculator c = new AdvCalculator();
        System.out.println(c.add(5,7));
        System.out.println(c.mul(5,7));

    }
}
