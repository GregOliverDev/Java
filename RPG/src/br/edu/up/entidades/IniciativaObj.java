package br.edu.up.entidades;

public class IniciativaObj {
    private int valor;
    private int sequencial;
    private String nome;

    public IniciativaObj(int valor, int sequencial, String nome) {
        this.valor = valor;
        this.sequencial = sequencial;
        this.nome = nome;
    }

    public int getValor() {
        return valor;
    }

    public int getSequencial() {
        return sequencial;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public void setSequencial(int sequencial) {
        this.sequencial = sequencial;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

}
