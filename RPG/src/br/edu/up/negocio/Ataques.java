package br.edu.up.negocio;

import br.edu.up.entidades.Atq;
import br.edu.up.entidades.Jogador;
import br.edu.up.entidades.Monstro;

public class Ataques {
	// Ataque corpo a corpo
	public static Atq atqCorp(Jogador jogador) {
		// Obj de ataque pra passar os valores
		Atq atq = new Atq();

		// Variaveis auxiliares para atq
		String auxTeste;
		int danoAtq = 0;

		// Atribui os valores ao obj atq
		atq.setValorPericia(Dados.randonD20());
		auxTeste = Dados.resultTeste(atq.getValorPericia(), jogador.getForca(), jogador.getCritico());
		atq.setTeste(auxTeste);

		// Definir o dano do atq
		if (atq.getTeste().equals("Extremo")) {
			// For pra atribuir dano
			for (int i = 1; i <= jogador.getDano(); i++) {
				danoAtq = danoAtq + 6;
			}

		} else if (atq.getTeste().equals("Sucesso")) {
			// For pra atribuir dano
			for (int i = 1; i <= jogador.getDano(); i++) {
				danoAtq = danoAtq + Dados.randonD6();
			}

		} else {
			// Fracasso nao acerta o golpe
			danoAtq = 0;
		}

		atq.setDano(danoAtq);

		return atq;
	}

	// Ataque Mágico
	public static Atq atqMagic(Jogador jogador) {
		// Obj de ataque pra passar os valores
		Atq atq = new Atq();

		// Variaveis auxiliares para atq
		String auxTeste;
		int danoAtq = 0;

		// Atribui os valores ao obj atq
		atq.setValorPericia(Dados.randonD20());
		auxTeste = Dados.resultTeste(atq.getValorPericia(), jogador.getIntelecto(), jogador.getCritico());
		atq.setTeste(auxTeste);

		// Definir o dano do atq
		if (atq.getTeste().equals("Extremo")) {
			// For pra atribuir dano
			for (int i = 1; i <= jogador.getDano(); i++) {
				danoAtq = danoAtq + 6;
			}

		} else if (atq.getTeste().equals("Sucesso")) {
			// For pra atribuir dano
			for (int i = 1; i <= jogador.getDano(); i++) {
				danoAtq = danoAtq + Dados.randonD6();
			}

		} else {
			// Fracasso nao acerta o golpe
			danoAtq = 0;
		}

		atq.setDano(danoAtq);

		return atq;
	}

	// Ataque a distancia
	public static Atq atqDista(Jogador jogador) {
		// Obj de ataque pra passar os valores
		Atq atq = new Atq();

		// Variaveis auxiliares para atq
		String auxTeste;
		int danoAtq = 0;

		// Atribui os valores ao obj atq
		atq.setValorPericia(Dados.randonD20());
		auxTeste = Dados.resultTeste(atq.getValorPericia(), jogador.getAgilidade(), jogador.getCritico());
		atq.setTeste(auxTeste);

		// Definir o dano do atq
		if (atq.getTeste().equals("Extremo")) {
			// For pra atribuir dano
			for (int i = 1; i <= jogador.getDano(); i++) {
				danoAtq = danoAtq + 6;
			}

		} else if (atq.getTeste().equals("Sucesso")) {
			// For pra atribuir dano
			for (int i = 1; i <= jogador.getDano(); i++) {
				danoAtq = danoAtq + Dados.randonD6();
			}

		} else {
			// Fracasso nao acerta o golpe
			danoAtq = 0;
		}

		atq.setDano(danoAtq);

		return atq;
	}

	// Ataque furtivo
	public static Atq atqFurt(Jogador jogador, Monstro monstro) {
		// Obj de ataque pra passar os valores
		Atq atq = new Atq();

		// Variaveis auxiliares para atq
		String auxTeste;
		String auxTesteFurt;
		int auxPeriFurt;
		int danoAtq = 0;

		// Atribui os valores ao obj atq
		atq.setValorPericia(Dados.randonD20());
		auxTeste = Dados.resultTeste(atq.getValorPericia(), jogador.getForca(), jogador.getCritico());
		atq.setTeste(auxTeste);

		auxPeriFurt = Dados.randonD20();
		auxTesteFurt = Dados.resultTeste(auxPeriFurt, jogador.getAgilidade(), jogador.getCritico());

		String resultPerce = Dados.resultPerce(auxTesteFurt, monstro);

		System.out.println("Jogador Tirou um " + resultPerce + " no Teste de Futividade");

		if (resultPerce.equals("Extremo")) {
			atq.setTeste("Extremo");

			// For pra atribuir dano
			for (int i = 1; i <= jogador.getDano(); i++) {
				danoAtq = danoAtq + 6;
			}
		} else {
			// Definir o dano do atq
			if (atq.getTeste().equals("Extremo")) {
				// For pra atribuir dano
				for (int i = 1; i <= jogador.getDano(); i++) {
					danoAtq = danoAtq + 6;
				}

			} else if (atq.getTeste().equals("Sucesso")) {
				// For pra atribuir dano
				for (int i = 1; i <= jogador.getDano(); i++) {
					danoAtq = danoAtq + Dados.randonD6();
				}

			} else {
				// Fracasso nao acerta o golpe
				danoAtq = 0;
			}
		}

		atq.setDano(danoAtq);

		return atq;
	}
}
