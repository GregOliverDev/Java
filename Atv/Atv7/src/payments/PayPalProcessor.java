package payments;

public class PayPalProcessor implements IPaymentProcessor {

    @Override
    public void processPayment(double amount) {
        System.out.println("Processing Bitcoin payment of $" + amount);
    }
}
