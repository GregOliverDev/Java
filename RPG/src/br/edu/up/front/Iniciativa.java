package br.edu.up.front;

import java.util.ArrayList;
import java.util.List;

import br.edu.up.entidades.Equipe;
import br.edu.up.entidades.IniciativaObj;
import br.edu.up.entidades.Jogador;
import br.edu.up.entidades.Monstro;
import br.edu.up.negocio.Dados;
import br.edu.up.negocio.DanoSanidade;
import br.edu.up.negocio.OrdemIniciativa;

public class Iniciativa {
	// chama a funcao iniciativa pra definir a ordem de batalha
	public Iniciativa(Equipe equipe, Monstro monstro) {
		int opcao = 0;

		// encontro de equipe com o monstro rolagem do dano de sanidade
		System.out.println("O arrepio que vcs serentiram agora tem motivo, no ver essa criatura vcs sentem medo");
		do {
			opcao = Console.readInt("\nDigite 1 para continuar: ");
		} while (opcao != 1);
		System.out.println("\nTeste de Sanidade");

		int valorDanoSanidade = 0;
		int dadosDanoSanidade = monstro.getDanoSanidade();

		// atribui o dano na variavel
		for (int i = 1; i <= dadosDanoSanidade; i++) {
			valorDanoSanidade = valorDanoSanidade + Dados.randonD6();
		}

		System.out.println("\nDano de sanidade Possivel " + valorDanoSanidade);
		for (Jogador element : equipe.getJogadores()) {
			// funcao pra rodar dano de sanidade por jogador
			element = DanoSanidade.danoSanidade(element, monstro, valorDanoSanidade);
			// Verifica caso o usuario tenha a sanidade menor ou igual a 0
			element = DanoSanidade.verificaSanidade(element);

			// atribui ao jogador a sanidade atual
			equipe.getJogadores().set(equipe.getJogadores().indexOf(element), element);
		}

		// lista de objs jogador e monstro para gerar a iniciativa
		List<IniciativaObj> objIniciativas = new ArrayList<IniciativaObj>();

		// for para atribuir os jogadores da equipe no list objiniciativa
		for (Jogador element : equipe.getJogadores()) {
			if(element.getStatus().equals("Vivo")) {
			IniciativaObj objIniciativa = new IniciativaObj(Dados.randonD20(), element.getNumSequencia(),
					element.getNome());
			objIniciativas.add(objIniciativa);
			}
		}
		// adiciona o monstro na iniciativa
		IniciativaObj objIniciativ = new IniciativaObj(Dados.randonD20(), monstro.getNumSequencia(), monstro.getNome());
		objIniciativas.add(objIniciativ);

		// funcao pra ordenar os obj no list pelo valor
		objIniciativas = OrdemIniciativa.ordenarObjetos(objIniciativas);

		opcao = 0;
		do {
			opcao = Console.readInt("\nDigite 1 para continuar: ");
		} while (opcao != 1);
		int contador = 0;
		System.out.println("\nIniciativa de Combate\n");
		System.out.println("Ordem de Iniciativa");
		// Imprimir a lista ordenada
		for (IniciativaObj objIniciativa : objIniciativas) {
			contador++;
			System.out.println("  " + contador + " º -" + objIniciativa.getNome()
					+ " - Resultado do dado da iniciativa " + objIniciativa.getValor());

		}

		// chama o menu de batalha passando os objs
		new Batalha(equipe, monstro, objIniciativas);

	}

}
