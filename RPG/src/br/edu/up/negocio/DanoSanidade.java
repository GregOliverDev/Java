package br.edu.up.negocio;

import br.edu.up.entidades.Jogador;
import br.edu.up.entidades.Monstro;

public class DanoSanidade {
	public static Jogador danoSanidade(Jogador element, Monstro monstro,int valorDanoSanidade) {
		// Sanidade do jogador atual
		int sanidadeAtual = element.getSanidade();
		
		// Variaveis de teste presença
		int valorTeste = Dados.randonD20();
		String teste = Dados.resultTeste(valorTeste, element.getPresenca(), element.getCritico());

		
		// reduz o dano de acordo com o resultado do teste
		if (teste == "Extremo") {
			valorDanoSanidade = (valorDanoSanidade / 4);
		} else if (teste == "Sucesso") {
			valorDanoSanidade = (valorDanoSanidade / 2);
		} else if (teste == "Fracasso") {
			valorDanoSanidade = (valorDanoSanidade / 1);
		}

		// Calcula a sanidade atual
		sanidadeAtual = sanidadeAtual - valorDanoSanidade;

		if(element.getStatus().equals("Vivo")) {
		// montra os resultados
		System.out.println("\nO jogador " + element.getNome());
		System.out.println("Presença do Jogador: "+element.getPresenca());
		System.out.println("Valor do Teste de Presença: " + valorTeste + " Teve um " + teste);
		System.out.println("Dano Sofrido de sanidade: " + valorDanoSanidade);
		System.out.println("Sanidade atual: " + sanidadeAtual);
		}
		// atribui ao jogador a sanidade atual
		element.setSanidade(sanidadeAtual);
		return element;
	}

	public static Jogador verificaSanidade(Jogador element) {

		int sanidadeAtual = element.getSanidade();

		if (sanidadeAtual <= 0) {
			element.setStatus("Enlouqueceu");
			System.out.println("Jogador: " + element.getNome() + " Enlouqueceu !");
			System.out.println("Jogador Foi pra cima pois não estava mais pensando direito e levou um golpe fatal e não resistiu");
			element.setStatus("Morto");
		}
		
		return element;
	}
}