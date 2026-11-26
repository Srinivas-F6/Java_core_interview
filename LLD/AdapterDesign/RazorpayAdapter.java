
public class RazorpayAdapter implements  PaymentService{

    RazorpayGateway razorpay;

    public RazorpayAdapter(RazorpayGateway razorpay){
        this.razorpay = razorpay;
    }

    @Override 
    public String pay(int amount, int cid){
        boolean result = razorpay.makePayment(Double.valueOf(amount));
        if(result){
            return "Success";
        }
        return "Fail";
    }
    
}
