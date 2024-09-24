
public class Main {

    public static void main(String[] args) {
        Cartao_Credito cartaoCredito = new Cartao_Credito();
        cartaoCredito.valor = 50.00;
        cartaoCredito.situacao = "Aberto";
        Boleto boleto = new Boleto();
        boleto.valor = 100.00;
        boleto.situacao = "Aberto";

        Cobradora cobradora = new Cobradora(boleto);
        System.out.println(boleto.situacao);
        cobradora.cobrar();
        System.out.println(boleto.situacao);
        cobradora.setProcessador(cartaoCredito);
        System.out.println(cartaoCredito.situacao);
        cobradora.cobrar();
        System.out.println(cartaoCredito.situacao);
    }
}
