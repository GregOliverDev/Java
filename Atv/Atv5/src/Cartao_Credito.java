public class Cartao_Credito implements iProcessador {
    public double valor;
    public String situacao;

    @Override
    public void processar_pgto() {
        System.out.println("Pagar por Cartao Credito " + this.valor );
        this.situacao = "Pago";
    }
}
