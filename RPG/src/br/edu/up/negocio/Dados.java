package br.edu.up.negocio;

import java.util.Random;

import br.edu.up.entidades.Monstro;

public class Dados {
	// Dado de 20 lados
	public static int randonD20() {
		int d20 = 0;
		Random geradorD20 = new Random();
		d20 = geradorD20.nextInt(19) + 1;
		return d20;
	}

	// Dado de 6 lados
	public static int randonD6() {
		int d6 = 0;
		Random geradorD6 = new Random();
		d6 = geradorD6.nextInt(5) + 1;
		return d6;
	}

	// Dado de 3 lados
	public static int randonD2() {
		int d2 = 0;
		Random geradorD2 = new Random();
		d2 = geradorD2.nextInt(2);
		return d2;
	}

	public static String resultTeste(int valorDado, int pericia, int critico) {
		int dificuldade = 20 - pericia;
		if (valorDado >= critico) {
			return "Extremo";
		} else if (valorDado >= dificuldade) {
			return "Sucesso";
		} else {
			return "Fracasso";
		}
	}

	public static String resultPerce(String resultTeste, Monstro monstro) {
		int testePerc = Dados.randonD20();
		String auxTestePerc = Dados.resultTeste(testePerc, monstro.getPresenca(), monstro.getCritico());

		if (resultTeste == "Extremo") {
			return "Extremo";
		} else if (resultTeste == "Sucesso" && auxTestePerc == "Extremo") {
			return "Fracasso";
		} else if (resultTeste == "Sucesso" && auxTestePerc == "Sucesso") {
			return "Sucesso";
		} else if (resultTeste == "Sucesso" && auxTestePerc == "Fracasso") {
			return "Sucesso";
		} else {
			return "Fracasso";
		}
	}
}
