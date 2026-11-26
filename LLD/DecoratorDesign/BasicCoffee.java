
public class BasicCoffee implements  Coffee{
     @Override
     public int getCost(){
        return 100;
     }
    
     @Override 
     public String getDescription(){
        return "Basic Coffee";
     }
}