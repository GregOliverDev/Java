package br.edu.up.entidades;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Monstro {
	@Id
	private int id;
	private String nome;
	private int critico;
	private int dano;
	private int danoSanidade;
	private String descricao;
	private int NumSequencia;
	private String status;

	private int forca;
	private int vigor;
	private int intelecto;
	private int agilidade;
	private int presenca;
	private int vida;
	private int sanidade;
	private int defesa;
	private int alvo;

	public Monstro() {

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
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

	public int getDanoSanidade() {
		return danoSanidade;
	}

	public void setDanoSanidade(int danoSanidade) {
		this.danoSanidade = danoSanidade;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public int getNumSequencia() {
		return NumSequencia;
	}

	public void setNumSequencia(int numSequencia) {
		NumSequencia = numSequencia;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
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

	public int getPresenca() {
		return presenca;
	}

	public void setPresenca(int presenca) {
		this.presenca = presenca;
	}

	public int getAlvo() {
		return alvo;
	}

	public void setAlvo(int alvo) {
		this.alvo = alvo;
	}
}
