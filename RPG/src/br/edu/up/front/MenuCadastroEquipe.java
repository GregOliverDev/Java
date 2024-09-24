package br.edu.up.front;

import br.edu.up.entidades.Equipe;
import br.edu.up.persistencia.EquipeSave;

public class MenuCadastroEquipe {
	// Cadastro da Equipe
	public MenuCadastroEquipe() {

		// Obj Equipe
		Equipe objEquipe = new Equipe();
		System.out.println("\n--Cadastro Equipe--");

		// Solicita o Nome para consultar no Banco
		objEquipe.setNome(Console.readString("Digite o Nome da Equipe: "));

		// Funcao da persistencia para verificar se ja existe uma Equipe com esse nome
		if (EquipeSave.procurarEquipe(objEquipe) == null) {

			// Se nao tiver esse nome no banco registra a equipe
			objEquipe.setSenha(Console.readString("Digite a Senha da Equipe: "));
			objEquipe.setPontuacao(0);

			// Inclui a equipe no banco
			EquipeSave.incluir(objEquipe);

			// Chama o menu de cadastro de jogadores da equipe
			new MenuCadastroJogador(objEquipe);

			// Equipe registrada
			System.out.println("\nEquipe registrada com Sucesso");
		} else {
			// Equipe nao registrada
			System.out.println("\nJá Existe uma Equipe com esse Nome!!!");
		}

	}
}
