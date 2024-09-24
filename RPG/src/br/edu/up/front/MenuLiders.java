package br.edu.up.front;

import java.util.ArrayList;
import java.util.List;

import br.edu.up.entidades.Equipe;
import br.edu.up.persistencia.EquipeSave;

public class MenuLiders {
	// Menu de lista de melhores equipes
	public MenuLiders() {
		System.out.println("\n--Tabela de Liderança--");

		List<Equipe> equipes = new ArrayList<Equipe>();
		equipes = EquipeSave.lidersEquipe();

		//Contador para definir liderancao por posicao 
		int contador = 0;
		for (Equipe element : equipes) {
			contador++;

			System.out.println("|  Posição: " + contador + "°  |  Nome da Equipe: " + element.getNome() + "  |  Pontuação: "
					+ element.getPontuacao() + "  | Total de Jogadores: " + element.getJogadores().size() + "  |");

		}
	}
}
