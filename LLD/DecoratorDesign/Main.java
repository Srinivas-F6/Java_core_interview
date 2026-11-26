
public class Main {
    public static void main(String[] args){
        Coffee coffee = new BasicCoffee();
        System.out.println(coffee.getCost());
        System.out.println(coffee.getDescription());

        coffee = new MilkDecorator(coffee);
        System.out.println(coffee.getCost() +"  "+coffee.getDescription());

        coffee = new SugarDecorator(coffee);
        System.out.println(coffee.getCost() +"  "+coffee.getDescription());

    }
}
