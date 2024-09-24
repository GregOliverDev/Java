package pagamentos;

public class PagamentoCartaoCredito implements IPagamento {
    private int numero;

    public PagamentoCartaoCredito(int numero) {
        this.numero = numero;
    }

    @Override
    public void processarPagamento(Double valor) {
        System.out.println();
        System.out.println("Pagemento com Cartão de Crédito.");
        if (validaNumero()) {
            System.out.println("Pagamento de R$" + valor + " pago com sucesso.");
        } else {
            System.out.println("Erro de numero de cartão.");
        }
    }

    public boolean validaNumero() {
        if (this.numero / 2 > 2) {
            this.numero = 2;
            return true;
        } else {
            return false;
        }
    }
}
