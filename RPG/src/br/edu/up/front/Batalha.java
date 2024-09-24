package br.edu.up.front;

import java.util.List;

import br.edu.up.entidades.Equipe;
import br.edu.up.entidades.IniciativaObj;
import br.edu.up.entidades.Jogador;
import br.edu.up.entidades.Monstro;
import br.edu.up.negocio.AuxBatalha;

public class Batalha {
	public Batalha(Equipe equipe, Monstro monstro, List<IniciativaObj> objIniciativas) {
		boolean teste = false, testeJogador = false;
		// Do while pra rodar a luta ate um dos dois lados estiverem mortos
		do {
			// For pra controle de sequencia de iniciativa
			for (IniciativaObj elementIniciativa : objIniciativas) {
				Jogador jogador;
				monstro.setAlvo(1);

				if (elementIniciativa.getSequencial() == 0) {
					System.out.println("-------------------------------------");
					System.out.println("\nVez do Monstro");
					do {
						jogador = AuxBatalha.procurarJogadorSeq(equipe, monstro.getAlvo());

						if (jogador.getStatus().equals("Morto")) {
							for (int i = 1; i <= equipe.getJogadores().size(); i++) {
								monstro.setAlvo(i);
								jogador = AuxBatalha.procurarJogadorSeq(equipe, monstro.getAlvo());

								if (jogador.getStatus().equals("Vivo")) {
									break;
								}
							}

							jogador = AuxBatalha.procurarJogadorSeq(equipe, monstro.getAlvo());
							if (AuxBatalha.verificaStatusEquipe(equipe) == false) {
								break;
							}
						} else {
							testeJogador = true;
						}
					} while (testeJogador != true);
					if (AuxBatalha.verificaStatusEquipe(equipe) == false) {
						teste = true;
						break;
					}
					System.out.println("Alvo do Ataque foi o jogador " + jogador.getNome());
					new AtaqueMonstro(jogador, monstro);
					equipe.getJogadores().set(equipe.getJogadores().indexOf(jogador), jogador);

				} else {
					jogador = AuxBatalha.procurarJogadorSeq(equipe, elementIniciativa.getSequencial());
					if (jogador.getStatus().equals("Morto")) {
						// Jogador morto nao executa
					} else {
						System.out.println("-------------------------------------");
						System.out.println("\nVez do Jogador " + jogador.getNome());

						new MenuAtaque(jogador, monstro);
					}
					if (AuxBatalha.verificaStatusMonstro(monstro) == true) {
						teste = true;
						break;
					}
				}
			}
		} while (teste != true);

		if (monstro.getStatus().equals("Morto")) {
			new MenuVitoria(equipe);
		} else if (AuxBatalha.verificaStatusEquipe(equipe) == false) {
			new MenuGameOver(equipe);
		}
	}
}
