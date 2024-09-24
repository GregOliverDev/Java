package notifiers;

public class EmailNotifier implements INotifier {
    @Override
    public void sendNotification(String message) {
        System.out.println("Sending email: " + message);
    }
}
