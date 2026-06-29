abstract class Payment{
    void pay(){
        System.out.println("Payment is completed");
    }
    abstract int amount(int money);
    abstract int balance();

}

class UPI extends Payment{
    private int balanceMoney;
    @Override
    public int amount(int money){
       balanceMoney += money;
       return money;
    }

    @Override
    public int balance(){
        return balanceMoney;
    }
}

class Bankings extends Payment{
    private int balanceMoney;
    @Override
    public int amount(int money){
        balanceMoney += money;
        return money;
    }
    @Override
    public int balance(){
        return balanceMoney;
    }
}

public class Abstract3 {
    public static void main(String[] args) {
        Payment p = new UPI();
        p.amount(1000);
        p.pay();
        int b = p.balance();
       System.out.println(b);

        p = new Bankings();
        p.pay();
        p.amount(100000);
        System.out.println(p.balance());
    }
}
