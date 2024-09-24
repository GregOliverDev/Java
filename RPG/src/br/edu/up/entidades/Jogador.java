package br.edu.up.entidades;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Jogador {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne
    private Equipe equipe;
    private String nome;
    private int numSequencia;

    private String status;
    private String classeNome;
    private int critico;
    private int dano;

    private int forca;
    private int vigor;
    private int intelecto;
    private int agilidade;
    private int presenca;
    private int vida;
    private int sanidade;
    private int defesa;

    public Jogador() {

    }

    public Jogador(int numSequencia, String classeNome, int critico, int dano, int forca, int vigor,
            int intelecto, int agilidade, int presenca, int vida, int sanidade, int defesa) {
        this.numSequencia = numSequencia;
        this.classeNome = classeNome;
        this.critico = critico;
        this.dano = dano;
        this.forca = forca;
        this.vigor = vigor;
        this.intelecto = intelecto;
        this.agilidade = agilidade;
        this.presenca = presenca;
        this.vida = vida;
        this.sanidade = sanidade;
        this.defesa = defesa;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Equipe getEquipe() {
        return equipe;
    }

    public void setEquipe(Equipe equipe) {
        this.equipe = equipe;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNumSequencia() {
        return numSequencia;
    }

    public void setNumSequencia(int numSequencia) {
        this.numSequencia = numSequencia;
    }
    
    public String getStatus() {
    	return status;
    }

    public void setStatus(String status) {
    	this.status = status;
    }
    
    public String getClasseNome() {
        return classeNome;
    }

    public void setClasseNome(String classeNome) {
        this.classeNome = classeNome;
    }

    public int getCritico() {
        return critico;
    }

    public void setCritico(int critico) {
        this.critico = critico;
    }

    public int getDano() {
        return dano;
    }

    public void setDano(int dano) {
        this.dano = dano;
    }

    public int getForca() {
        return forca;
    }

    public void setForca(int forca) {
        this.forca = forca;
    }

    public int getVigor() {
        return vigor;
    }

    public void setVigor(int vigor) {
        this.vigor = vigor;
    }

    public int getIntelecto() {
        return intelecto;
    }

    public void setIntelecto(int intelecto) {
        this.intelecto = intelecto;
    }

    public int getAgilidade() {
        return agilidade;
    }

    public void setAgilidade(int agilidade) {
        this.agilidade = agilidade;
    }

    public int getPresenca() {
        return presenca;
    }

    public void setPresenca(int presenca) {
        this.presenca = presenca;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getSanidade() {
        return sanidade;
    }

    public void setSanidade(int sanidade) {
        this.sanidade = sanidade;
    }

    public int getDefesa() {
        return defesa;
    }

    public void setDefesa(int defesa) {
        this.defesa = defesa;
    }

}
