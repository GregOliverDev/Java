package notifiers;

public class SMSNotifier implements INotifier {
    @Override
    public void sendNotification(String message) {
        System.out.println("Sending SMS: " + message);
    }
}
