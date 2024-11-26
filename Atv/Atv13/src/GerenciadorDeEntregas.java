public class GerenciadorDeEntregas {
    private  ITipoEntrega tipoEntrega;

    public void setTipoEntrega(ITipoEntrega tipoEntrega) {
        this.tipoEntrega = tipoEntrega;
    }

    public void entregar(Entrega entrega) {
        if (tipoEntrega != null) {
            tipoEntrega.DefinirTipo(entrega);
        } else {
            System.out.println("Nenhuma estratégia de transporte selecionada.");
        }
    }
}
