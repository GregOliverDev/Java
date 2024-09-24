package br.edu.up.front;

import br.edu.up.entidades.Equipe;
import br.edu.up.persistencia.EquipeSave;

public class MenuVitoria {
	public MenuVitoria(Equipe equipe) {
		System.out.println("\n----- VITORIA -----");
		System.out.println("Vcs conseguiram ganhar do monstro Parabens");
		
		System.out.println("Vcs tbm Ganharam 50 pontos a Equipe");
		
		equipe.setPontuacao(equipe.getPontuacao() + 50);
		EquipeSave.alterar(equipe);
	}
}
