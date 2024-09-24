package br.edu.up.negocio;

import java.util.ArrayList;
import java.util.List;

import br.edu.up.entidades.Atq;
import br.edu.up.entidades.Equipe;
import br.edu.up.entidades.Jogador;
import br.edu.up.entidades.Monstro;

public class AuxBatalha {
	// Batalha monstro
	public static Monstro defMonstro(Atq atq, Monstro monstro) {
		// Variavel auxiliar pra definir o numero para defesa
		int defEscolha = 0;

		// Gera um valor aleatorio entre 0 a 1
		defEscolha = Dados.randonD2();

		// If de controle de forma de defesa
		if (defEscolha == 0) {
			// Defesa com escolha de Bloquio por def 1
			int bloqueioMonstro = monstro.getDefesa() + 5;

			System.out.println("Monstro Tentou Bloquear");

			if (atq.getTeste().equals("Extremo")) {
				// Dano na vida do monstro
				int vidaAtualMonstro = monstro.getVida();
				vidaAtualMonstro = vidaAtualMonstro - atq.getDano();
				monstro.setVida(vidaAtualMonstro);

				if (vidaAtualMonstro <= 0) {
					monstro.setStatus("Morto");
					System.out.println("Sem sucesso Levou " + atq.getDano() + " de Dano");
					System.out.println("Monstro Morreu");
				} else {
					System.out.println("Sem sucesso Levou " + atq.getDano() + " de Dano");
					System.out.println("Vida atual do Monstro: " + monstro.getVida());
				}

			} else if (atq.getTeste().equals("Sucesso")) {
				// Pra indentifica o se teve um sucesso no bloqueio ou nao
				if (atq.getValorPericia() >= bloqueioMonstro) {
					// Dano na vida do monstro
					int vidaAtualMonstro = monstro.getVida();
					vidaAtualMonstro = vidaAtualMonstro - atq.getDano();
					monstro.setVida(vidaAtualMonstro);
					if (vidaAtualMonstro <= 0) {
						monstro.setStatus("Morto");
						System.out.println("Sem sucesso Levou " + atq.getDano() + " de Dano");
						System.out.println("Monstro Morreu");
					} else {
						System.out.println("Sem sucesso Levou " + atq.getDano() + " de Dano");
						System.out.println("Vida atual do Monstro: " + monstro.getVida());
					}
				} else {
					System.out.println("Monstro Bloqueou o Ataque");
					System.out.println("Dano não infringido");
					System.out.println("Vida atual do Monstro: " + monstro.getVida());
				}

			} else {
				System.out.println("Monstro Bloqueou o Ataque");
				System.out.println("Dano não infringido");
				System.out.println("Vida atual do Monstro: " + monstro.getVida());
			}

		} else if (defEscolha == 1) {
			// Defesa com escolha de esquiva por def 3
			int esquivaMonstro = monstro.getDefesa() + monstro.getAgilidade();

			System.out.println("Monstro Tentou Esquivar");

			if (atq.getTeste().equals("Extremo")) {
				// Dano na vida do monstro
				int vidaAtualMonstro = monstro.getVida();
				vidaAtualMonstro = vidaAtualMonstro - atq.getDano();
				monstro.setVida(vidaAtualMonstro);

				if (vidaAtualMonstro <= 0) {
					monstro.setStatus("Morto");
					System.out.println("Sem sucesso Levou " + atq.getDano() + " de Dano");
					System.out.println("Monstro Morreu");
				} else {
					System.out.println("Sem sucesso Levou " + atq.getDano() + " de Dano");
					System.out.println("Vida atual do Monstro: " + monstro.getVida());
				}

			} else if (atq.getTeste().equals("Sucesso")) {
				// Pra indentifica o se teve um sucesso no bloqueio ou nao
				if (atq.getValorPericia() >= esquivaMonstro) {
					// Dano na vida do monstro
					int vidaAtualMonstro = monstro.getVida();
					vidaAtualMonstro = vidaAtualMonstro - atq.getDano();
					monstro.setVida(vidaAtualMonstro);

					if (vidaAtualMonstro <= 0) {
						monstro.setStatus("Morto");
						System.out.println("Sem sucesso Levou " + atq.getDano() + " de Dano");
						System.out.println("Monstro Morreu");
					} else {
						System.out.println("Sem sucesso Levou " + atq.getDano() + " de Dano");
						System.out.println("Vida atual do Monstro: " + monstro.getVida());
					}
				} else {
					System.out.println("Monstro Esquivou do Ataque");
					System.out.println("Dano não infringido");
					System.out.println("Vida atual do Monstro: " + monstro.getVida());
				}

			} else {
				System.out.println("Monstro Esquivou do Ataque");
				System.out.println("Dano não infringido");
				System.out.println("Vida atual do Monstro: " + monstro.getVida());
			}
		}

		return monstro;
	}

	// defesa monstro
	public static Jogador defJogador(int opcao, Atq atq, Jogador jogador) {

		// If de controle de forma de defesa
		if (opcao == 1) {
			// Defesa com escolha de Bloquio por def 1
			int bloqueio = jogador.getDefesa() + 5;

			System.out.println("Jogador Tentou Bloquear");

			if (atq.getTeste().equals("Extremo")) {
				// Dano na vida do monstro
				int vidaAtual = jogador.getVida();
				vidaAtual = vidaAtual - atq.getDano();
				jogador.setVida(vidaAtual);

				if (vidaAtual <= 0) {
					jogador.setStatus("Morto");
					System.out.println("Sem sucesso Levou " + atq.getDano() + " de Dano");
					System.out.println("Jogador Morreu");
				} else {
					System.out.println("Sem sucesso Levou " + atq.getDano() + " de Dano");
					System.out.println("Vida atual do Jogador: " + jogador.getVida());
				}

			} else if (atq.getTeste().equals("Sucesso")) {
				// Pra indentifica o se teve um sucesso no bloqueio ou nao
				if (atq.getValorPericia() >= bloqueio) {
					// Dano na vida do monstro
					int vidaAtual = jogador.getVida();
					vidaAtual = vidaAtual - atq.getDano();
					jogador.setVida(vidaAtual);

					if (vidaAtual <= 0) {
						jogador.setStatus("Morto");
						System.out.println("Sem sucesso Levou " + atq.getDano() + " de Dano");
						System.out.println("Jogador Morreu");
					} else {
						System.out.println("Sem sucesso Levou " + atq.getDano() + " de Dano");
						System.out.println("Vida atual do Jogador: " + jogador.getVida());
					}
				} else {
					System.out.println("Jogador conseguiu Bloquear");
					System.out.println("Dano não infringido");
					System.out.println("Vida atual do Jogador: " + jogador.getVida());
				}
			} else {
				System.out.println("Jogador conseguiu Bloquear");
				System.out.println("Dano não infringido");
				System.out.println("Vida atual do Jogador: " + jogador.getVida());

			}
		} else if (opcao == 2) {
			// Defesa com escolha de esquiva por def 3
			int esquiva = jogador.getDefesa() + jogador.getAgilidade();

			System.out.println("Jogador Tentou Esquivar");

			if (atq.getTeste().equals("Extremo")) {
				// Dano na vida do monstro
				int vidaAtual = jogador.getVida();
				vidaAtual = vidaAtual - atq.getDano();
				jogador.setVida(vidaAtual);

				if (vidaAtual <= 0) {
					jogador.setStatus("Morto");
					System.out.println("Sem sucesso Levou " + atq.getDano() + " de Dano");
					System.out.println("Jogador Morreu");
				} else {
					System.out.println("Sem sucesso Levou " + atq.getDano() + " de Dano");
					System.out.println("Vida atual do Jogador: " + jogador.getVida());
				}

			} else if (atq.getTeste().equals("Sucesso")) {
				// Pra indentifica o se teve um sucesso no bloqueio ou nao
				if (atq.getValorPericia() >= esquiva) {
					// Dano na vida do monstro
					int vidaAtual = jogador.getVida();
					vidaAtual = vidaAtual - atq.getDano();
					jogador.setVida(vidaAtual);

					if (vidaAtual <= 0) {
						jogador.setStatus("Morto");
						System.out.println("Sem sucesso Levou " + atq.getDano() + " de Dano");
						System.out.println("Jogador Morreu");
					} else {
						System.out.println("Sem sucesso Levou " + atq.getDano() + " de Dano");
						System.out.println("Vida atual do Jogador: " + jogador.getVida());
					}
				} else {
					System.out.println("Jogador conseguiu Esquivar");
					System.out.println("Dano não infringido");
					System.out.println("Vida atual do Jogador: " + jogador.getVida());
				}

			} else {
				System.out.println("Jogador conseguiu Esquivar");
				System.out.println("Dano não infringido");
				System.out.println("Vida atual do Jogador: " + jogador.getVida());
			}
		}

		return jogador;
	}

	// Procura os jogadores na lista da equipe pelo sequencial
	public static Jogador procurarJogadorSeq(Equipe equipe, int sequencial) {
		// Lista de jogadores da equipe
		List<Jogador> jogadoresEquipe = new ArrayList<Jogador>();
		// Pega os jogadores da equipe e salva na lista
		jogadoresEquipe = equipe.getJogadores();

		// Obj jogador aux
		Jogador jogador = new Jogador();

		// For pra procurar um jogador pelo sequencial
		for (Jogador element : jogadoresEquipe) {
			if (element.getNumSequencia() == sequencial) {
				jogador = element;
			}
		}

		return jogador;
	}

	// Verifica se a equipe esta viva
	public static boolean verificaStatusEquipe(Equipe equipe) {
		for (Jogador element : equipe.getJogadores()) {
			if (element.getStatus().equals("Vivo")) {
				return true;
			}
		}
		return false;
	}

	// Verifica se o monstro esta vivo
	public static boolean verificaStatusMonstro(Monstro monstro) {
		if (monstro.getStatus().equals("Morto")) {
			return true;
		} else {
			return false;
		}
	}		
}