package fabrica;

import pagamentos.IPagamento;
import pagamentos.PagamentoPayPal;

public class PayPalFactory extends PagamentoFactory{
    @Override
    public IPagamento criarPagamento() {
        return new PagamentoPayPal("teste@gmail.com.br");
    }
}
