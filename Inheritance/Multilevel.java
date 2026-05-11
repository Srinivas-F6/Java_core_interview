

class CustomerDetails{
  public void details(String AcNo, String name){
     System.out.println(AcNo);
     System.out.println(name);
  }
}
class BankAcc extends CustomerDetails{
    private String AcNo,name;
    public BankAcc(String AcNo, String name){
        this.AcNo = AcNo;
        this.name = name;
    }
    public void show(){
        details(AcNo,name);
    }  
}
class BasicDet extends BankAcc{
    public BasicDet(String AcNo, String name){
        super(AcNo,name);
    }
}
public class Multilevel {
    public static void main(String[] args) {
        BasicDet b = new BasicDet("12345678","Srinivas");
        b.show();
    }
}
