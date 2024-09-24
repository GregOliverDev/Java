package fabrica;

import pagamentos.PagamentoCartaoCredito;
import pagamentos.IPagamento;

public class CartaodeCreditoFactory extends PagamentoFactory{

    @Override
    public IPagamento criarPagamento() {
        return new PagamentoCartaoCredito(6);
    }
}
