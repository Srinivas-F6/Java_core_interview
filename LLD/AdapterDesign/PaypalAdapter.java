
public class PaypalAdapter implements  PaymentService{
    
    PaypalGateway paypal;

    public PaypalAdapter(PaypalGateway paypal){
        this.paypal = paypal;
    }

    @Override 
    public String pay(int amount, int cId){
        int result = paypal.doTransaction(Double.valueOf(amount), cId);

        if(result == 1){
            return "Success";
        }
        return "Fail";
    }
}
