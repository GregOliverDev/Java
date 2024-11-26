package Tipos;

import java.util.ArrayList;
import java.util.List;

public class Terrestre implements ITipoEntrega{

    @Override
    public void DefinirTipo() {

        List<String> transportadoras = new ArrayList<>();
        transportadoras.add("1 - Transportadora Silva");
        transportadoras.add("2 - Logística Rápida");
        transportadoras.add("3 - Expresso do Norte");
        transportadoras.add("4 - Entregas Pontuais");
        transportadoras.add("5 - Frete Fácil");


        for (String transportadora : transportadoras) {
            System.out.println(transportadora);
        }

    }
}
