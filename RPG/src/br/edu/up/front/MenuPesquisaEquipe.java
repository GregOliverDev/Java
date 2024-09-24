package br.edu.up.front;

import br.edu.up.entidades.Equipe;
import br.edu.up.entidades.Jogador;
import br.edu.up.persistencia.EquipeSave;

public class MenuPesquisaEquipe {
	// Menu de pesquisa de equipe pelo nome
	public MenuPesquisaEquipe() {
		// Obj equipeAuxiliar
		Equipe objEquipe = new Equipe();
		System.out.println("\n--Menu Pesquisa Equipe--");
		objEquipe.setNome(Console.readString("Digite o Nome da Equipe: "));

		// Chama a procura no banco
		objEquipe = EquipeSave.procurarEquipe(objEquipe);
		if (objEquipe != null) {
			// Mostra as informacoes relevante da equipe
			System.out.println("\n--Equipe Encontrada--");
			System.out.println("Nome da Equipe: " + objEquipe.getNome());
			System.out.println("Pontuação da Equipe: " + objEquipe.getPontuacao());
			System.out.println("  --Jogadores--");

			// Mostra os jogadores da equipe e suas infos
			for (Jogador element : objEquipe.getJogadores()) {
				System.out.println("\nNome Jogador: " + element.getNome());
				System.out.println("Classe: " + element.getClasseNome());
				System.out.println("Status: " + element.getStatus());
				System.out.println("Vida: " + element.getVida());
				System.out.println("Sanidade: " + element.getSanidade());
			}
		} else {
			System.out.println("\nEquipe não Encontrada!!!");
		}
	}
}
