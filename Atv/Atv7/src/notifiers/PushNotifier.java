package notifiers;

public class PushNotifier implements INotifier {
    @Override
    public void sendNotification(String message) {
        System.out.println("Sending push notification: " + message);
    }
}
