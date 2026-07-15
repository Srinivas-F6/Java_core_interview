class Banking{
    String name;
    public Banking(){
        System.out.println("Bank Constructor");
    }
}

class SBI  extends Banking{
    SBI(){
        System.out.println("SBI constructor");
    }
    public void bankName(String name){
        this.name = name;
    }
    public String bankName(){
        return name;
    }
}
public class Inheritance1Demo {
    public static void main(String[] args) {
        SBI sb = new SBI();
        sb.bankName("sbi");
        System.out.println(sb.bankName());
    }   
}
-