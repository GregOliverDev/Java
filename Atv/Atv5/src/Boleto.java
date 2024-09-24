public class Boleto implements iProcessador {
    public double valor;
    public String situacao;

    @Override
    public void processar_pgto() {
        System.out.println("Pagar por Boleto " + this.valor);
        this.situacao = "Pago";
    }
}
