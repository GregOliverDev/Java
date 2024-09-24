package fabrica;

import pagamentos.IPagamento;
import pagamentos.PagamentoApplePay;

public class FactoryApplePay extends PagamentoFactory{
    @Override
    public IPagamento criarPagamento() {
        return new PagamentoApplePay();
    }
}
