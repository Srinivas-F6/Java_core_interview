
class AccountDetails {

    String name;
    String aadhaar;
    String pan;
    String passport;
    String mobile;
    String email;
    String address;

    public AccountDetails(String name, String aadhaar, String pan, String passport, String mobile, String email, String address) {
        this.name = name;
        this.aadhaar = aadhaar;
        this.pan = pan;
        this.passport = passport;
        this.mobile = mobile;
        this.email = email;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public String getAadhaar() {
        return aadhaar;
    }

    public String getEmail() {
        return email;
    }

    public String getPan() {
        return pan;
    }

    public String getPassport() {
        return passport;
    }

    public String getAddress() {
        return address;
    }

    public String getMobile(){
      return mobile;
    }
}

abstract class Bank {

    int balance;

    abstract void createAccount(AccountDetails accountDetails);

    public void deposit(int amount) {
        balance += amount;
    }

    public void withdraw(int amount) {
        balance -= amount;
    }

    public int balanceAmount() {
        return balance;
    }
}

class SBI extends Bank {

    @Override
    public void createAccount(AccountDetails accountDetails) {

        if (accountDetails.getAadhaar() == null || accountDetails.getPan() == null) {
            System.out.println("Submit proper details");
            return;
        }
        System.out.println("SBI Bank Account Created Successfully");
    }

    @Override
    public void deposit(int amount) {
        if (amount < 500) {
            System.out.println("minimum amount 500 rs should be deposit");
            return;
        }
        super.deposit(amount);
    }

    @Override
    public void withdraw(int amount) {
        if (balance-amount <= 100){
            System.out.println("Minimum account balance is 100");
            return;
        }
        super.withdraw(amount);
    }

    @Override
    public int balanceAmount() {
        return super.balanceAmount();
    }
}

class HDFC extends Bank {

    @Override
    public void createAccount(AccountDetails accountDetails) {
       if (accountDetails.getPassport() == null || accountDetails.getAddress() == null) {
            System.out.println("Submit proper details");
            return;
        }
        System.out.println("HDFC Bank Account Created Successfully");
    }

    @Override
    public void deposit(int amount) {
        if (amount < 1000) {
            System.out.println("minimum amount 1000 rs should be deposit");
            return;
        }
        super.deposit(amount);
    }

    @Override
    public void withdraw(int amount) {
        if (balance-amount <= 500){
            System.out.println("Minimum account balance is 500");
            return;
        }
        super.withdraw(amount);
    }

    @Override
    public int balanceAmount() {
        return super.balanceAmount();
    }
}

public class Inheritance2Demo {

    public static void main(String[] args) {

        AccountDetails accountDetails = new AccountDetails("srinivas", "468483785005", "EUKPG7578H", "83k9fd8we", "9505691379", "glsrinivas1111@gmail.com", "Parsilli vari veedhi");

        Bank sb = new SBI();
        sb.createAccount(accountDetails);
        sb.deposit(1000);
        sb.withdraw(600);
        System.out.println(sb.balanceAmount());

        HDFC hf = new HDFC();
        hf.createAccount(accountDetails);
        hf.deposit(5000);
        hf.withdraw(4500);
        System.out.println(hf.balanceAmount());

    }
}
