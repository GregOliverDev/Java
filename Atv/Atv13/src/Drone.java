public class Drone implements ITipoEntrega {
    @Override
    public void DefinirTipo(Entrega entrega) {
        if (entrega.getPeso() <= 5 && entrega.getDimensoes() <= 50) {
            System.out.println("Entrega por drones na área metropolitana aprovada.");
        } else {
            System.out.println("Entrega por drones limitada a pequenos pacotes.");
        }
    }
}
