package br.edu.up.front;

public class ProcessosEspeciais {
	public ProcessosEspeciais() {
		// Variavel controle Menu
		int opcao = 0;
		do {
			// Menu de processos especiais
			System.out.println("\n----------Processos Especias----------");
			System.out.println("1 - Pesquisa Equipe");
			System.out.println("2 - Pesquisa Jogador");
			System.out.println("3 - Lista de Equipes pelo Nome");
			System.out.println("4 - Lista de Jogadores pelo Nome");
			System.out.println("5 - Excluir Equipe");
			System.out.println("6 - Lista das Melhores Equipes");
			System.out.println("7 - Volta ao Menu Inicial\n");
			opcao = Console.readInt("Escolha a opção: ");

			System.out.println("-------------------------------------");
			switch (opcao) {

			case 1:
				// Pesquisa de Equipe pelo nome
				new MenuPesquisaEquipe();
				break;
			case 2:
				// Pesquisa de jogador pelo nome
				new MenuPesquisaJogador();
				break;
			case 3:
				// Lista as equipes por uma parte do nome
				new MenuListaEquipe();
				break;
			case 4:
				// Lista os jogadores por uma parte do nome
				new MenuListaJogador();
				break;
			case 5:
				// Deleta a equipe desejada
				new MenuDeleteEquipe();
				break;
			case 6:
				//Menu de equipes com melhor pontuacao
				new MenuLiders();
				break;
			}

		} while (opcao != 7);
	}
}
