public class Main {
    public static void main(String[] args) {
        
        PaymentClient client = new PaymentClient(new PaypalAdapter(new PaypalGateway()));
        client.makePayment();
    }
}
