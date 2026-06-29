interface Payment{
    void pay();
    int amount(int money);
}

class UPI implements Payment{
    @Override
    public void pay(){
       System.out.println("Upi Payment completed");
    }

    @Override
    public int amount(int money){
       return money;
    }
}

class Qr implements Payment{
    @Override
    public void pay(){
       System.out.println("QR payment Completed");
    }

    @Override
    public int amount(int money){
        return money;
    }
}
 
public class abstract2_pay {
    public static void main(String[] args) {
        Payment p = new UPI();
        p.pay();
        System.out.println(p.amount(100));
        
        // QR
        p = new Qr();
        p.pay();
        System.out.println(p.amount(10000));
    }
}
