package br.edu.up.front;

import br.edu.up.entidades.Equipe;
import br.edu.up.persistencia.EquipeSave;

public class MenuDeleteEquipe {
	// Menu para excluir equipe
	public MenuDeleteEquipe() {
		// Obj auxiliar para procura da equipe
		System.out.println("\n--Menu Excluir Equipe--");
		Equipe objEquipe = new Equipe();
		Equipe equipe = new Equipe();

		// Procura a equipe no banco
		objEquipe.setNome(Console.readString("Digite o nome da equipe que deseja excluir: "));
		objEquipe = EquipeSave.procurarEquipe(objEquipe);
		if (objEquipe != null) {

			// Solicita a senha e a valida com um obj equipe auxilar
			equipe.setSenha(Console.readString("Digite a senha Equipe: "));
			if (equipe.getSenha().equals(objEquipe.getSenha())) {
				// Exclui a equipe do banco
				EquipeSave.excluir(objEquipe);
				System.out.println("\nEquipe Deletada com Sucesso");
			} else {

				// Senha digitada diferente da senha no banco
				System.out.println("\nSenha Incorreta!!!");
			}
		} else {
			System.out.println("\nEquipe não Encontrada!!!");
		}
	}
}
