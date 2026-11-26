

public class PaymentClient {

    PaymentService service;

    public PaymentClient(PaymentService service){
        this.service = service;
    }

    public void makePayment(){
        String result = service.pay(1000,1);
        if(result.equals("Success")){
            System.out.println("Payment Succedd");
        }
        else{
            System.out.println("payment failed");
        }
    }
    
}
