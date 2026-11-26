

public class MilkDecorator extends CoffeeDecorator {
    public MilkDecorator(Coffee coffee){
        super(coffee);
    }

    @Override 
    public int getCost(){
        return coffee.getCost() + 10;
    }

    @Override 
    public String getDescription(){
        return coffee.getDescription() + " Milk ";
    }
}
