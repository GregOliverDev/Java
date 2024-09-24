import fabrica.PagamentoFactory;
import pagamentos.IPagamento;

public class PagamentoService {
    public void pagar(PagamentoFactory factory, Double valor) {
        IPagamento pagamento = factory.criarPagamento();
        pagamento.processarPagamento(valor);
    }
}
