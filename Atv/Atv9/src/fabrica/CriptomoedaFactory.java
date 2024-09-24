package fabrica;

import pagamentos.PagamentoCriptomoeda;
import pagamentos.IPagamento;

public class CriptomoedaFactory extends PagamentoFactory{
    @Override
    public IPagamento criarPagamento() {
        return new PagamentoCriptomoeda(0.0121);
    }
}
