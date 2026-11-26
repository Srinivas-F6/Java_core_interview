

public class SugarDecorator extends CoffeeDecorator{

    public SugarDecorator(Coffee coffee){
         super(coffee);
    }
    
    @Override
    public int getCost(){
        return coffee.getCost() + 5;
    }
    
    @Override 
    public String getDescription(){
        return coffee.getDescription() + " Sugar ";
    }
}
