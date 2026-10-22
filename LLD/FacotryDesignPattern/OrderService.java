public class OrderService {
    public void sendNotification(){
       NotificationFactory factory = new EmailFactory();
       Notification notification = factory.createNotification();
       notification.send();

       factory = new SmsFactory();
       notification = factory.createNotification();
       notification.send();
    }

}
