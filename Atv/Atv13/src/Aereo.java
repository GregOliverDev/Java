public class Aereo implements ITipoEntrega {
    @Override
    public void DefinirTipo(Entrega entrega) {
        if (entrega.getDimensoes() > 50 || entrega.getPeso() > 200) {
            System.out.println("A encomenda excede os limites de peso ou dimensões para transporte aéreo.");
        } else {
            System.out.println("Entrega por transporte aéreo aprovada.");
        }
    }
}
