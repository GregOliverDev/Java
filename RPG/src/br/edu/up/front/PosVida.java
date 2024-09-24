package br.edu.up.front;

import br.edu.up.entidades.Equipe;
import br.edu.up.entidades.Jogador;
import br.edu.up.persistencia.EquipeSave;

public class PosVida {
	public PosVida() {
		// Obj auxiliar para procura da equipe
		System.out.println("\n--Menu Pos Vida--");
		Equipe objEquipe = new Equipe();
		Equipe equipe = new Equipe();

		// Variavel Teste
		int teste = 0;

		// Procura a equipe no banco
		objEquipe.setNome(Console.readString("Digite o nome da equipe que deseja restaurar os Jogadores: "));
		objEquipe = EquipeSave.procurarEquipe(objEquipe);
		if (objEquipe != null) {

			// Solicita a senha e a valida com um obj equipe auxilar
			equipe.setSenha(Console.readString("Digite a senha Equipe: "));
			if (equipe.getSenha().equals(objEquipe.getSenha())) {
				// Verifica a pontuacao da equipe
				int pontuacaoAtual = objEquipe.getPontuacao();
				if (pontuacaoAtual >= 100) {
					System.out.println("\nPara Restaurar os jogadores custa 100 pontos");
					System.out.println("Pontuação atual da equipe: " + pontuacaoAtual);

					teste = Console.readInt("Digite 1 para continuar o Procedimento: ");
					switch (teste) {
					case 1:
						
						pontuacaoAtual = pontuacaoAtual - 100;
						objEquipe.setPontuacao(pontuacaoAtual);
						
						for (Jogador element : objEquipe.getJogadores()) {
							if(element.getClasseNome().equals("Mago")) {
								element.setVida(15);
								element.setSanidade(30);
								element.setStatus("Vivo");
							}else if(element.getClasseNome().equals("Atirador")) {
								element.setVida(20);
								element.setSanidade(28);
								element.setStatus("Vivo");
							}else if(element.getClasseNome().equals("Assassino")) {
								element.setVida(15);
								element.setSanidade(24);
								element.setStatus("Vivo");
							}else if(element.getClasseNome().equals("Tank")) {
								element.setVida(35);
								element.setSanidade(26);
								element.setStatus("Vivo");
							}

							// atribui ao jogador a sanidade atual
							objEquipe.getJogadores().set(objEquipe.getJogadores().indexOf(element), element);
						}
						
						System.out.println("\nJogadores Restauraram Vida e Sanidade");
						System.out.println("Pontuação atual da equipe: " + objEquipe.getPontuacao());
						
						EquipeSave.alterar(objEquipe);
						
						break;
					default:
						System.out.println("Procedimento cancelado!!!");
						break;

					}

				} else {
					System.out.println("Pontuação insuficiente!!!");
				}

			} else {

				// Senha digitada diferente da senha no banco
				System.out.println("\nSenha Incorreta!!!");
			}
		} else {
			System.out.println("\nEquipe não Encontrada!!!");
		}
	}
}
