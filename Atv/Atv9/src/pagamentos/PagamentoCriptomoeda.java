package pagamentos;

public class PagamentoCriptomoeda implements IPagamento {
    private Double saldo;

    public PagamentoCriptomoeda(Double saldo) {
        this.saldo = saldo;
    }

    @Override
    public void processarPagamento(Double valor) {
        System.out.println();
        System.out.println("Pagemento com Criptomoeda");
        if (this.saldo >= valor) {
            System.out.println("Pagamento de R$" + valor + " pago com sucesso.");
        } else {
            System.out.println("Saldo insuficiente.");
        }
    }
}
