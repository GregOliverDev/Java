package br.edu.up.front;

import br.edu.up.persistencia.EntityManagerFactory;

public class Principal {
	public static void main(String[] args) {
		// instacia a primeira conexao com o banco
		EntityManagerFactory.getInstance();

		// Variavel controle Menu
		int opcao = 0;
		do {
			// Menu inicial
			System.out.println("\n--Menu Inicial--");
			System.out.println("1 - Cadastrar Equipe");
			System.out.println("2 - Jogar");
			System.out.println("3 - Pos Vida");
			System.out.println("4 - Processos Especiais");
			System.out.println("5 - Sair");
			opcao = Console.readInt("Escolha a opção: ");

			switch (opcao) {
			case 1:
				// Front de cadastro equipe
				new MenuCadastroEquipe();
				break;
			case 2:
				// Start Game com equipe
				new MenuStartGame();
				break;
			case 3:
				//Pos vida restaura equipes com os pontos
				new PosVida();
				break;
			case 4:
				// Processos especias para manipulacao da equipe e jogador
				new ProcessosEspeciais();
				break;
			}

		} while (opcao != 5);
	}
}
