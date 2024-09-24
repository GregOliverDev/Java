package br.edu.up.front;

import br.edu.up.entidades.Equipe;
import br.edu.up.entidades.Jogador;
import br.edu.up.persistencia.JogadorSave;

public class MenuCadastroJogador {
	// Variaveis de controle do menu
	private static int registraJogador = 0, contador = 1;
	private static Jogador jogador;

	// Menu de cadastro de jogador
	public MenuCadastroJogador(Equipe equipe) {

		do {
			// Menu
			System.out.println("\n--Menu Cadastro Jogador--");
			System.out.println("1 - Cadastrar Jogador na Equipe (Max 10)");
			System.out.println("2 - Finalizar");

			// Opcao do usuario
			registraJogador = Console.readInt("Digite a opção: ");

			// Switch case pra registro de jogadores
			switch (registraJogador) {
			case 1:
				// If pra nao deixar cadastrar mais que 10 jogadores por equipe
				if (contador <= 10) {
					// Funcao de criarcao do obj jogador
					jogador = inserirJogador(equipe);
					jogador.setEquipe(equipe);
					// Verifica se ja tem o jogador cadastrado na equipe
					if (JogadorSave.procurarJogador(jogador) == null) {
						// Salva o Jogador no banco
						JogadorSave.incluir(jogador);

						System.out.println("\nJogador Cadastrado com Sucesso");

						// Incrementa pra no proximo jogador ficar a sequencia correta
						contador++;
					} else {
						// Jogador ja existe na equipe
						System.out.println("\nJogador com o mesmo nome na equipe !!!");
					}
				} else {
					// No maximo 10 jogadores
					System.out.println("\nMaximo de Jogadores Atingido");
					System.out.println("Equipe Finalizada");
				}
				break;
			case 2:
				if (contador == 1) {
					// Caso o minimo de jogadores nao tenha sido atingido
					System.out.println("\nCadastre pelo menos um Jogador!!!");
				} else {
					contador = 1;
					registraJogador = 3;
				}
				break;
			}

		} while (registraJogador != 3);
	}

	// Funcao de criarcao do obj jogador
	private static Jogador inserirJogador(Equipe equipe) {
		// obj jogador para criar registro
		jogador = new Jogador();
		Jogador objJogador1;

		// Variavel auxiliar pra controle de classe
		int auxClasse = 0;

		System.out.println("\nCadastrar o " + contador + "º Jogador");

		// Set no nome do jogador
		jogador.setNome(Console.readString("Digite o Nome do Jogador: "));
		int sair = 0;
		do {
			// Menu de classe de jogador
			System.out.println("\n--Menu Escolha de Classe--");
			System.out.println(
					"1º - Mago\n  --Status--\n  15 - Vida\n  30 - Sanidade\n  5 - Ataque\n  15 - Poder\n  10 - Agilidade\n  5 - Defesa\n  19 - Critico\n");
			System.out.println(
					"2º - Atirador\n  --Status--\n  20 - Vida)\n  28 - Sanidade\n  10 - Ataque\n  5 - Poder\n  15 - Agilidade\n  0 - Defesa\n  19 - Critico\n");
			System.out.println(
					"3º - Assassino\n  --Status--\n  15 - Vida)\n  24 - Sanidade\n  10 - Ataque\n  5 - Poder\n  15 - Agilidade\n  0 - Defesa\n  18 - Critico\n");
			System.out.println(
					"4º - Tank\n  --Status--\n  35 - Vida\n  26 - Sanidade\n  10 - Ataque\n  5 - Poder\n  3 - Agilidade\n  7 - Defesa\n  20 - Critico\n");
			auxClasse = Console.readInt("Digite sua Escolha de Classe: ");

			// Switch case pra definir stats do jogador
			if (auxClasse == 1) {
				objJogador1 = new Jogador(contador, "Mago", 19, 2, 5, 0, 15, 10, 5, 15, 30, 5);
				objJogador1.setNome(jogador.getNome());
				objJogador1.setStatus("Vivo");
				jogador = objJogador1;
				sair = 1;
			} else if (auxClasse == 2) {
				objJogador1 = new Jogador(contador, "Atirador", 19, 2, 5, 0, 10, 15, 10, 20, 28, 0);
				objJogador1.setNome(jogador.getNome());
				objJogador1.setStatus("Vivo");
				jogador = objJogador1;
				sair = 1;
			} else if (auxClasse == 3) {
				objJogador1 = new Jogador(contador, "Assassino", 18, 3, 10, 0, 5, 15, 5, 15, 24, 0);
				objJogador1.setNome(jogador.getNome());
				objJogador1.setStatus("Vivo");
				jogador = objJogador1;
				sair = 1;
			} else if (auxClasse == 4) {
				objJogador1 = new Jogador(contador, "Tank", 20, 1, 10, 0, 5, 3, 15, 35, 26, 7);
				objJogador1.setNome(jogador.getNome());
				objJogador1.setStatus("Vivo");
				jogador = objJogador1;
				sair = 1;
			} else {
				System.out.println("\nClasse invalida Digite novamente");
			}
		} while (sair == 0);
		return jogador;
	}
}
