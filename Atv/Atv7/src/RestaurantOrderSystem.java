import notifiers.EmailNotifier;
import notifiers.INotifier;
import notifiers.PushNotifier;
import payments.BitcoinProcessor;
import payments.CreditCardProcessor;
import payments.IPaymentProcessor;

import java.util.Arrays;
import java.util.List;

public class RestaurantOrderSystem {
    public void createOrder() {
        String orderId = "12345";
        double totalAmount = 45.50;
        List<String> items = Arrays.asList("Pizza", "Soda", "Dessert");

        // Aqui você pode trocar as implementações de PaymentProcessor e Notifier
        IPaymentProcessor paymentProcessor = new CreditCardProcessor();
        INotifier notifier = new EmailNotifier();

        Order order = new Order(orderId, items, totalAmount, paymentProcessor, notifier);
        order.setNotifier(new PushNotifier());
        order.setPaymentProcessor(new BitcoinProcessor());
        order.processOrder();
    }

    public static void main(String[] args) {
        RestaurantOrderSystem system = new RestaurantOrderSystem();
        system.createOrder();
    }
}
