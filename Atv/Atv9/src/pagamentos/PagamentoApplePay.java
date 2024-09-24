package pagamentos;

public class PagamentoApplePay implements IPagamento {
    @Override
    public void processarPagamento(Double valor) {
        System.out.println();
        System.out.println("Pagemento com Apple Pay.");
        System.out.println("Pagamento de R$" + valor + " pago com sucesso.");
    }
}
