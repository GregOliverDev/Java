public class Main {
    public static void main(String[] args) {

        Entrega entrega1 = new Entrega(10, 100, "Não");
        Entrega entrega2 = new Entrega(500, 300, "Sim");
        Entrega entrega3 = new Entrega(3, 30, "Não");

        GerenciadorDeEntregas gerenciador = new GerenciadorDeEntregas();

        System.out.println("\nTransporte terrestre:");
        gerenciador.setTipoEntrega(new Terrestre());
        gerenciador.entregar(entrega1);

        System.out.println("\nTransporte aéreo Entrega 1:");
        gerenciador.setTipoEntrega(new Aereo());
        gerenciador.entregar(entrega1);

        System.out.println("\nTransporte aéreo Entrega 3:");
        gerenciador.setTipoEntrega(new Aereo());
        gerenciador.entregar(entrega3);

        System.out.println("\nTransporte marítimo Entrega 1:");
        gerenciador.setTipoEntrega(new Maritimo());
        gerenciador.entregar(entrega1);

        System.out.println("\nTransporte marítimo Entrega 2:");
        gerenciador.setTipoEntrega(new Maritimo());
        gerenciador.entregar(entrega2);

        System.out.println("\nEntrega por drones Entrega 2:");
        gerenciador.setTipoEntrega(new Drone());
        gerenciador.entregar(entrega2);

        System.out.println("\nEntrega por drones Entrega 3:");
        gerenciador.setTipoEntrega(new Drone());
        gerenciador.entregar(entrega3);
    }
}