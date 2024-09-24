package br.edu.up.front;

import br.edu.up.entidades.Equipe;
import br.edu.up.persistencia.EquipeSave;

public class MenuGameOver {
	public MenuGameOver(Equipe equipe) {
		EquipeSave.alterar(equipe);
		System.out.println("\n----- GAME OVER -----");
		System.out.println("Todos os jogadores da equipe Morreram");
		System.out.println("O Monstro Matou milhares Vcs Foram os primeiros");
		System.out.println("Boa Sorte no Pos Vida");
	}
}
