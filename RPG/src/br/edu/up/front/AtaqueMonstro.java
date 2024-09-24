package br.edu.up.front;

import br.edu.up.entidades.Atq;
import br.edu.up.entidades.Jogador;
import br.edu.up.entidades.Monstro;
import br.edu.up.negocio.AtaquesMonstro;
import br.edu.up.negocio.AuxBatalha;
import br.edu.up.negocio.Dados;

public class AtaqueMonstro {
	//Ataque monstro definido aleatorio
	public AtaqueMonstro(Jogador jogador, Monstro monstro) {
		int testeAtaque = Dados.randonD2();
		int opcao = 0;
		
		if(testeAtaque == 1) {
			System.out.println("Monstro Atacou Corpo a Corpo");
			Atq atq = new Atq();
			atq = AtaquesMonstro.atqCorpMonstro(monstro);
			
			Boolean teste = false;
			
			do {
				// Menu de escolha de defesa
				System.out.println("\n--Menu Defesa Ataque--");
				System.out.println("1 - Bloqueio (Sua defesa mais 5)");
				System.out.println("2 - Esquiva (Sua defesa mais sua agilidade)\n");
				opcao = Console.readInt("Digite a opção de Defesa: ");

				if (opcao == 1 ) {
					teste = true;
				}else if(opcao == 2) {
					teste = true;
				}else {
					System.out.println("Opção incorreta!!!");
				}

			} while (teste != true);
			
			System.out.println("Valor da Força do Monstro: "+ monstro.getForca());
			System.out.println("Valor do Teste: " + atq.getValorPericia());
			System.out.println("Resultado do teste "+atq.getTeste());
			
			jogador = AuxBatalha.defJogador(opcao, atq, jogador);
			
		}else {
			System.out.println("Monstro Atacou a Distancia");
			Atq atq = new Atq();
			atq = AtaquesMonstro.atqDistaMonstro(monstro);		
			
			Boolean teste = false;
			
			do {
				// Menu de escolha de defesa
				System.out.println("\n--Menu Defesa Ataque--");
				System.out.println("1 - Bloqueio (Sua defesa mais 5)");
				System.out.println("2 - Esquiva (Sua defesa mais sua agilidade)\n");
				opcao = Console.readInt("Digite a opção de Defesa: ");

				if (opcao == 1 ) {
					teste = true;
				}else if(opcao == 2) {
					teste = true;
				}else {
					System.out.println("Opção incorreta!!!");
				}

			} while (teste != true);
			
			System.out.println("Valor da Agilidade do Monstro: "+ monstro.getAgilidade());
			System.out.println("Valor do Teste: " + atq.getValorPericia());
			System.out.println("Resultado do teste "+atq.getTeste());
			
			jogador = AuxBatalha.defJogador(opcao, atq, jogador);
			
		}
	}
}
