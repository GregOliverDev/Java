package br.edu.up.front;

import java.util.ArrayList;
import java.util.List;

import br.edu.up.entidades.Jogador;
import br.edu.up.persistencia.JogadorSave;

public class MenuListaJogador {
	//Lista os jogadores pelo nome 
	public MenuListaJogador() {	
		Jogador jogador = new Jogador();
		System.out.println("\n--Menu Lista Jogador--");
		jogador.setNome(Console.readString("Digite um parte do nome do Jogador: "));
		
		List<Jogador> jogadores = new ArrayList<Jogador>();
		
		jogadores = JogadorSave.listarJogadores(jogador);
		
		int contador = 0;
		
		for(Jogador element: jogadores) {
			contador++;
			System.out.println("\n Jogador " + contador);
			System.out.println("Nome do Jogador: "+ element.getNome());
			System.out.println("Status: "+ element.getStatus());
			System.out.println("Vida: "+ element.getVida());
			System.out.println("Sanidade: "+ element.getSanidade());
		}
	}
}
