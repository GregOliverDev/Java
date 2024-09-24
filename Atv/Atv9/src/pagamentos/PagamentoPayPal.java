package pagamentos;

public class PagamentoPayPal implements IPagamento {
    private String email;

    public PagamentoPayPal(String email){
        this.email = email;
    }

    @Override
    public void processarPagamento(Double valor) {
        System.out.println();
        System.out.println("Pagemento com Paypal");
        if (validaEmail()) {
            System.out.println("Pagamento de R$" + valor + " pago com sucesso.");
        } else {
            System.out.println("Email do usuário incorreto");
        }
    }

    public boolean validaEmail() {
        if (this.email.length() > 0) {
            return true;
        } else {
            return false;
        }
    }
}
