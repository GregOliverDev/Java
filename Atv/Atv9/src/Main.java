import fabrica.CartaodeCreditoFactory;
import fabrica.CriptomoedaFactory;
import fabrica.FactoryApplePay;
import fabrica.PayPalFactory;

public class Main {
    public static void main(String[] args) {
        PagamentoService service = new PagamentoService();
        service.pagar(new CartaodeCreditoFactory(), 150.99);
        service.pagar(new CriptomoedaFactory(), 0.1222);
        service.pagar(new PayPalFactory(), 120.75);
        service.pagar(new FactoryApplePay(), 90.55);
    }
}