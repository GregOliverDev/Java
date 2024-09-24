package fabrica;

import pagamentos.IPagamento;

public abstract  class PagamentoFactory {
    public abstract IPagamento criarPagamento();
}
