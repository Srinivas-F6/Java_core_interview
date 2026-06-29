abstract class Bank{
    abstract void deposit(long amount);
    abstract long withdraw(long amount);
    abstract long checkbalance();
    abstract void accountDetails();
}

class SBI extends Bank{
   private long balance;

   final private String accountNumber;
   final private String accountHolder;
   final private String branch;
   final private String ifsc;

   public SBI(String accountNumber, String accountHolder, String branch, String ifsc){
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.branch = branch;
        this.ifsc = ifsc;
   }

   @Override
   public void deposit(long amount){
     if(amount > 0){
        balance +=  amount;
     }
   }

   @Override
   public long withdraw(long amount){
       if(amount > 0 && amount <= balance){
          balance -= amount;
          return amount;
       }
       return 0;
        
   }

   @Override
   public long checkbalance(){
    return balance;
   }

   @Override
   public void accountDetails(){
      System.out.println(accountHolder+" "+accountNumber+" "+branch+" "+ifsc);
   }

}

public class Project1 {
    public static void main(String[] args) {
        Bank b = new SBI("30405568365","srinivas","SBI","SBIN0005689");
        b.deposit(3000);
        b.withdraw(-500);
       System.out.println(b.checkbalance());
         b.accountDetails();
    }
}
