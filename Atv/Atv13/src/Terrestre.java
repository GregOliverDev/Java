import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Terrestre implements ITipoEntrega {

    @Override
    public void DefinirTipo(Entrega entrega) {

        List<String> transportadoras = new ArrayList<>();
        transportadoras.add("Transportadora Silva");
        transportadoras.add("Logística Rápida");
        transportadoras.add("Expresso do Norte");
        transportadoras.add("Entregas Pontuais");
        transportadoras.add("Frete Fácil");

        System.out.println("Selecionando transportadora local para entrega terrestre.");
        Random random = new Random();
        String transportadoraSelecionada = transportadoras.get(random.nextInt(transportadoras.size()));

        System.out.println("Transportadora sorteada: " + transportadoraSelecionada);
    }
}
