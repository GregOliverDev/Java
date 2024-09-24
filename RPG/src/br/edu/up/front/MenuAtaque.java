package br.edu.up.front;

import br.edu.up.entidades.Atq;
import br.edu.up.entidades.Jogador;
import br.edu.up.entidades.Monstro;
import br.edu.up.negocio.Ataques;
import br.edu.up.negocio.AuxBatalha;

public class MenuAtaque {
	public MenuAtaque(Jogador jogador, Monstro monstro) {
		// Variavel de controle de selecão
		boolean teste = false;
		int opcao = 0;
		do {
			// Menu inicial
			System.out.println("\n--Menu de Ataque--");
			System.out.println("1 - Ataque Corpo a Corpo (Usa Força do Jogador)");
			System.out.println("2 - Ataque Mágico (Usa Intelecto do Jogador)");
			System.out.println("3 - Ataque a Distância (Usa Agilidade do Jogador)");
			System.out.println("4 - Ataque Furtivo (Usa Agilidade e Força do Jogador)\n");
			opcao = Console.readInt("Escolha a opção: ");

			if (opcao == 1) {
				Atq atq = new Atq();
				atq = Ataques.atqCorp(jogador);
				System.out.println("\nValor da Força do jogador: "+ jogador.getForca());
				System.out.println("Valor do Teste: " + atq.getValorPericia());
				System.out.println("Resultado do teste "+atq.getTeste());
				
				monstro = AuxBatalha.defMonstro(atq, monstro);
				teste = true;
			} else if (opcao == 2) {
				Atq atq = new Atq();
				atq = Ataques.atqMagic(jogador);
				System.out.println("\nValor do Intelecto do jogador: "+ jogador.getIntelecto());
				System.out.println("Valor do Teste: " + atq.getValorPericia());
				System.out.println("Resultado do teste "+atq.getTeste());
				
				monstro = AuxBatalha.defMonstro(atq, monstro);
				teste = true;
			} else if (opcao == 3) {
				Atq atq = new Atq();
				atq = Ataques.atqDista(jogador);
				System.out.println("\nValor da Agilidade do jogador: "+ jogador.getAgilidade());
				System.out.println("Valor do Teste: " + atq.getValorPericia());
				System.out.println("Resultado do teste "+atq.getTeste());
				
				monstro = AuxBatalha.defMonstro(atq, monstro);
				teste = true;
			} else if (opcao == 4) {
				System.out.println("\nValor da Força do jogador: "+ jogador.getForca());
				System.out.println("Valor da Agilidade do jogador: "+ jogador.getAgilidade());
				Atq atq = new Atq();
				atq = Ataques.atqFurt(jogador, monstro);
				
				System.out.println("Valor do Teste de Ataque: " + atq.getValorPericia());
				System.out.println("Resultado do teste de Ataque Foi "+atq.getTeste());
				teste = true;
				monstro = AuxBatalha.defMonstro(atq, monstro);

			}
		} while (teste != true);
	}

}
