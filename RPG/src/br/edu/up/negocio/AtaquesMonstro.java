package br.edu.up.negocio;

import br.edu.up.entidades.Atq;
import br.edu.up.entidades.Monstro;

public class AtaquesMonstro {
	// Ataque corpo a corpo do monstro
		public static Atq atqCorpMonstro(Monstro monstro) {

			// obj de ataque pra passar os valores
			Atq atq = new Atq();

			// variaveis auxiliares para atq
			String auxTeste;
			int danoAtq = 0;

			// Atribui os valores ao obj atq
			atq.setValorPericia(Dados.randonD20());
			auxTeste = Dados.resultTeste(atq.getValorPericia(), monstro.getForca(), monstro.getCritico());
			atq.setTeste(auxTeste);

			// definir o dano do atq
			if (atq.getTeste() == "Extremo") {
				// for pra atribuir dano
				for (int i = 1; i <= monstro.getDano(); i++) {
					danoAtq = danoAtq + 6;
				}

			} else if (atq.getTeste() == "Sucesso") {
				// for pra atribuir dano
				for (int i = 1; i <= monstro.getDano(); i++) {
					danoAtq = danoAtq + Dados.randonD6();
				}

			} else {
				// fracasso nao acerta o golpe
				danoAtq = 0;
			}

			atq.setDano(danoAtq);

			return atq;
		}

		// Ataque a distancia do monstro
		public static Atq atqDistaMonstro(Monstro monstro) {
			// Obj de ataque pra passar os valores
			Atq atq = new Atq();

			// Variaveis auxiliares para atq
			String auxTeste;
			int danoAtq = 0;

			// Atribui os valores ao obj atq
			atq.setValorPericia(Dados.randonD20());
			auxTeste = Dados.resultTeste(atq.getValorPericia(), monstro.getAgilidade(), monstro.getCritico());
			atq.setTeste(auxTeste);

			// Definir o dano do atq
			if (atq.getTeste() == "Extremo") {
				// For pra atribuir dano
				for (int i = 1; i <= monstro.getDano(); i++) {
					danoAtq = danoAtq + 6;
				}

			} else if (atq.getTeste() == "Sucesso") {
				// For pra atribuir dano
				for (int i = 1; i <= monstro.getDano(); i++) {
					danoAtq = danoAtq + Dados.randonD6();
				}

			} else {
				// Fracasso nao acerta o golpe
				danoAtq = 0;
			}

			atq.setDano(danoAtq);

			return atq;
		}
}
