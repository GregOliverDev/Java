package br.edu.up.front;

import java.util.ArrayList;
import java.util.List;

import br.edu.up.entidades.Equipe;
import br.edu.up.persistencia.EquipeSave;

public class MenuListaEquipe {
	// Menu Listar equipes pelo nome
	public MenuListaEquipe() {
		// Obj equipe Auxiliar
		Equipe objEquipe = new Equipe();
		System.out.println("\n--Menu Lista de Equipes--");
		objEquipe.setNome(Console.readString("Digite um parte do Nome da Equipe a listar: "));

		// List de equipes do retorno do metodo
		List<Equipe> equipes = new ArrayList<Equipe>();

		// Chama a procura no banco
		equipes = EquipeSave.listaEquipes(objEquipe);
		if (equipes != null) {
			System.out.println("\n--" + equipes.size() + " Equipes Encontradas--");
			for (Equipe element : equipes) {
				System.out.println("\n Equipe ");
				System.out.println("Nome da Equipe: " + element.getNome());
				System.out.println("Pontuação da Equipe: " + element.getPontuacao());
				System.out.println("Total de Jogadores: " + element.getJogadores().size());
			}
		}
	}
}
