package br.edu.up.front;

import br.edu.up.entidades.Equipe;
import br.edu.up.entidades.Jogador;
import br.edu.up.persistencia.EquipeSave;
import br.edu.up.persistencia.JogadorSave;

public class MenuPesquisaJogador {
	//Menu de pesquisa jogador pelo nome e equipe
	public MenuPesquisaJogador() {
		// Obj jogador para auxiliar na busca
		Jogador jogador = new Jogador();
		System.out.println("\n--Menu Pesquisa Jogador--");
		jogador.setNome(Console.readString("Digite o nome do Jogador: "));

		// Obj Equipe para auxiliar na busca
		Equipe equipe = new Equipe();
		equipe.setNome(Console.readString("Digite o nome da equipe do Jogador: "));

		equipe = EquipeSave.procurarEquipe(equipe);
		if (equipe != null) {
			//Pega o id da equipe pra procurar o jogador nessa equipe
			jogador.setEquipe(equipe);
			jogador = JogadorSave.procurarJogador(jogador);
			
			if(jogador != null) {
				System.out.println("\n--O "+jogador.getNumSequencia()+"º Jogador da Equipe foi Encontrado--");
				System.out.println("Nome Jogador: " + jogador.getNome());
				System.out.println("Status Atual: "+jogador.getStatus());
                
				System.out.println("\n--Estatisticas Gerais--");
				System.out.println("Classe: " + jogador.getClasseNome());
                System.out.println("Vida: "+ jogador.getVida());
                System.out.println("Sanidade: "+ jogador.getSanidade());
                System.out.println("Defesa: "+ jogador.getDefesa());
                System.out.println("Critico: "+jogador.getCritico());
                System.out.println("Dados de dano: "+jogador.getDano());
                
                System.out.println("\n--Perícias--");
                System.out.println("Força: "+jogador.getForca());
                System.out.println("Vigor: "+jogador.getVigor());
                System.out.println("Intelecto: "+jogador.getIntelecto());
                System.out.println("Agilidade: "+jogador.getAgilidade());
                System.out.println("Presenca: "+jogador.getPresenca());
			}else {
				System.out.println("\nJogador não Encontrado nessa Equipe!!!");
			}
		} else {
			System.out.println("\nEquipe não Encontrada!!!");
		}
	}
}
