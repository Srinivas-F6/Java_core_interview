class Employee{
    private int salary;
    private long balance;

    public void salary(int salary){
        if(salary > 0){
           this.salary = salary;
           balance += salary;
        }     
    }
    public long balancee(){
        return balance;
    }
}
public class Demo1{
    public static void main(String[] args){
          Employee e = new Employee();
          e.salary(-1000);
          System.out.println(e.balancee());
          
    }
}