import notifiers.INotifier;
import payments.IPaymentProcessor;

import java.util.List;

public class Order {
    private String orderId;
    private List<String> items;
    private double totalAmount;
    private IPaymentProcessor paymentProcessor;
    private INotifier notifier;

    public Order(String orderId, List<String> items, double totalAmount,
                 IPaymentProcessor paymentProcessor, INotifier notifier) {
        this.orderId = orderId;
        this.items = items;
        this.totalAmount = totalAmount;
        this.paymentProcessor = paymentProcessor;
        this.notifier = notifier;
    }

    public void setNotifier(INotifier notifier) {
        this.notifier = notifier;
    }

    public void setPaymentProcessor (IPaymentProcessor paymentProcessor) {
        this.paymentProcessor = paymentProcessor;
    }

    public void processOrder() {
        System.out.println("Processing order " + orderId);
        notifier.sendNotification("Order " + orderId + " processed successfully!");
    }
}
