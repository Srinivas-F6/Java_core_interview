class AccountDetails{
   private String accountHolder;
   private String accountNumber;
   private String aadhar;
   private String pan;
   private String email;
   private Long balance;

   public AccountDetails(String accountHolder, String accountNumber, String aadhar, String pan, String email, Long balance){
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.aadhar = aadhar;
        this.pan = pan;
        this.email = email;
        this.balance = balance;
   }

   public void setAccountHolder(String accountHolder){
      this.accountHolder = accountHolder;
   }
   public void setAccountNumber(String accountNumber){
      this.accountNumber = accountNumber;
   }
   public void setAadhar(String aadhar){
      this.aadhar = aadhar;
   }
   public void setPan(String pan){
      this.pan = pan;
   }
   public void setEmail(String email){
      this.email = email;
   }
   public void setBalance(long balance){
      this.balance = balance;
   }

   public String getAccountHolder(){
      return accountHolder;
   }
   public String getAccountNumber(){
      return accountNumber;
   }
   public String getAadhar(){
      return aadhar;
   }
   public String getPan(){
      return pan;
   }
   public String getEmail(){
      return email;
   }
   public Long getBalance(){
      return balance;
   }

}


abstract class Bank{
   public void createAccount(AccountDetails details){
     System.out.println("Fucking account created");
   }

   abstract void deposit(AccountDetails details, long amount) throws Exception;

    public long getBalancee(AccountDetails details){
        return details.getBalance();
    }
}

interface  UPI{
    public void depositt(AccountDetails details,long amount) throws Exception;
}


class SBI extends Bank implements UPI{

    @Override
    public void createAccount(AccountDetails details){  //email, aadhar, pan
        if(details.getEmail()==null || details.getAadhar() == null || details.getPan() == null){
            System.out.println("Please submit Proper documents");
            return;
        }
        System.out.println("Account created Successfully");
    }
     
    @Override
    public void deposit(AccountDetails details, long amount) throws Exception{
        if(amount < 500){
            throw new Exception("Minimum deposit amount is 500");
        }
        long remainingBal = details.getBalance() + amount;
        details.setBalance(remainingBal);
    }

    @Override
    public void depositt(AccountDetails details,long amount) throws Exception{
        if(amount < 500){
            throw new Exception("Minimum deposit amount is 500");
        }
        details.setBalance(details.getBalance()+amount);       
    }

}

class HDFC extends Bank{

    @Override
    public void createAccount(AccountDetails details){  //email, aadhar, pan
        if(details.getEmail()==null || details.getAadhar() == null || details.getPan() == null){
            System.out.println("Please submit Proper documents");
            return;
        }
        System.out.println("Account created Successfullllly");

    }

     @Override
    public void deposit(AccountDetails details, long amount) throws  Exception{
        if(amount < 1000){
            throw new Exception("Minimum deposit amount is 500");
        }
        long remainingBal = details.getBalance() + amount;
        details.setBalance(remainingBal);
    }

}




public class Project1{
    public static void main(String[] args) throws Exception {
        AccountDetails  ac1 = new AccountDetails("Srinivas", "45683930244", "4698 9383 2993", "EUKPDU87S", "glsrinivsa1111@gmail.com",0L);
        AccountDetails  ac2 = new AccountDetails("Venkat", "45683930245", "4698 9383 8678", "EUKYU87J", "eswar511@gmail.com",0L);
        Bank b = new SBI();
        UPI u = new SBI();
        b.createAccount(ac1);
        b.deposit(ac1, 500);
        u.depositt(ac1,1000);
        System.out.println(b.getBalancee(ac1));

        b = new HDFC();
        b.createAccount(ac2);
        // try {
        //     b.deposit(ac, 999);
        // } catch (Exception e) {
        //    System.out.println(e.getMessage());
        // }
        b.deposit(ac2, 1000L);
        System.out.println(b.getBalancee(ac2));
    }
}