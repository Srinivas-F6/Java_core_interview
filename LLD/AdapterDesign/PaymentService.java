
// public class PaymentService {
    // Here we need to communicate with the third party payment service called PaypalGateway
    // But the return type, parameters are different
    // we can solve this problem without using adapter

    // PaypalGateway paypal = new PaypalGateway();
    // public String pay(int amount, int customerId){


    //     // This is the way we can connect third party gateway with payment service
    //     // It is working for single payment gateway, if there are more than one payment gateway we should adapter pattern.

    //     int res = paypal.doTransaction(Double.valueOf(amount), customerId);
    //     if(res == 1){
    //       return "Success";
    //     }
    //     return "FAAAIIILLLL";
        
//     }
// }


public interface PaymentService{
    String pay(int amount, int cId);
}
