package br.edu.up.front;

import br.edu.up.entidades.Equipe;
import br.edu.up.negocio.AuxBatalha;
import br.edu.up.persistencia.EquipeSave;

public class MenuStartGame {
	// Menu de start do jogo
	public MenuStartGame() {
		// Solicita a equipe aos jogadores com nome e senha
		System.out.println("\nEntrar com a Equipe");
		Equipe objEquipe = new Equipe();
		Equipe equipe = new Equipe();

		// Procura a equipe no banco pra entrar com o login
		objEquipe.setNome(Console.readString("Digite o Nome da Equipe: "));
		objEquipe = EquipeSave.procurarEquipe(objEquipe);
		if (objEquipe != null) {

			// Solicita a senha e a valida com um obj equipe auxilar
			equipe.setSenha(Console.readString("Digite a senha Equipe: "));
			if (equipe.getSenha().equals(objEquipe.getSenha())) {
				// Verifica se pelo menos um jogadore esta vivo
				if (AuxBatalha.verificaStatusEquipe(objEquipe) == false) {
					System.out.println("\nEquipe com todos os jogadores Mortos!!!");
				} else {// Chama o menu do local
					new MenuLocal(objEquipe);
				}
			} else {

				// Senha digitada diferente da senha no banco
				System.out.println("\nSenha Incorreta!!!");
			}
		} else {

			// Equipe nao encontrada no banco
			System.out.println("\nEquipe não Encontrada!!!");
		}
	}
}
