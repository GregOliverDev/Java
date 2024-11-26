import java.util.Objects;

public class Maritimo implements ITipoEntrega {
    @Override
    public void DefinirTipo(Entrega entrega) {
        if (Objects.equals(entrega.getInternacional(), "Sim")) {
            System.out.println("Entrega internacional via transporte marítimo.");
        } else {
            System.out.println("Transporte marítimo só está disponível para entregas internacionais.");
        }
    }
}
