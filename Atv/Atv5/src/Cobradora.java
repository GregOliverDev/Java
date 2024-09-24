public class Cobradora {
    private iProcessador processador;

    Cobradora(iProcessador processador){
        this.processador = processador;
    }

    public void setProcessador(iProcessador processador){
        this.processador = processador;
    }

    public void cobrar(){
        this.processador.processar_pgto();
    }
}
