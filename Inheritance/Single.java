// class Calculator{
//     public int add(int a, int b){
//         return a+b;
//     }
//     public int sub(int a, int b){
//         return a-b;
//     }
// }

// class AdvCalculator extends Calculator{
//     public int mul(int a, int b){
//         return a*b;
//     }
//     public int div(int c, int d){
//         return c/d;
//     }
// }

// public class Single{
//     public static void main(String[] args) {
//         AdvCalculator c = new AdvCalculator();
//         System.out.print(c.add(5,7));
//         System.out.print(c.mul(5,7));

//     }
// }




// Parent class
// class BankAccount {
//     protected double balance;

//     public BankAccount(double initialBalance) {
//         this.balance = initialBalance;
//     }

//     public void deposit(double amount) {
//         balance += amount;
//         System.out.println("Deposited: " + amount);
//     }

//     public void withdraw(double amount) {
//         if(amount <= balance) {
//             balance -= amount;
//             System.out.println("Withdrawn: " + amount);
//         } else {
//             System.out.println("Insufficient balance!");
//         }
//     }

//     public void showBalance() {
//         System.out.println("Balance: " + balance);
//     }
// }


// class SavingsAccount extends BankAccount {
//     private double interestRate;
//     public SavingsAccount(double initialBalance, double interestRate) {
//         super(initialBalance); // call parent constructor...........super() is used for calling the parent class constructor
//         this.interestRate = interestRate;
//     }

//     public void addInterest() {
//         double interest = balance * interestRate / 100;
//         deposit(interest); // reusing parent method
//         System.out.println("Interest Added: " + interest);
//     }
// }

// public class BankSystem {
//     public static void main(String[] args) {
//         SavingsAccount acc = new SavingsAccount(1000, 5);

//         acc.showBalance();   // from parent
//         acc.deposit(500);    // from parent
//         acc.withdraw(200);   // from parent
//         acc.addInterest();   // from child
//         acc.showBalance();   // final balance
//     }
// }
