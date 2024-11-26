public class Entrega {
    private double peso;
    private double dimensoes;
    private String internacional;

    public Entrega(double peso, double dimensoes, String internacional) {
        this.peso = peso;
        this.dimensoes = dimensoes;
        this.internacional = internacional;
    }

    public String getInternacional() {
        return internacional;
    }

    public double getPeso() {
        return peso;
    }

    public double getDimensoes() {
        return dimensoes;
    }
}
