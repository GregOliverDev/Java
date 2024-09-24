package br.edu.up.front;

import br.edu.up.entidades.Equipe;
import br.edu.up.entidades.Monstro;
import br.edu.up.entidades.Local;
import br.edu.up.negocio.ViewerMonstro;
import br.edu.up.persistencia.LocalSave;

public class MenuLocal {
	// Menu de local de luta
	public MenuLocal(Equipe objEquipe) {
		// Variavel auxiliar ao menu
		int opcao = 0;
		boolean teste = false;
		Local local = null;

		// Obj monstro para usar na luta
		Monstro objMonstro = null;
		do {
			// Menu de escolha
			System.out.println("\n--Menu Local--");
			System.out.println("1 - Lago Do Desespero");
			System.out.println("2 - A Floresta Em Chamas");
			System.out.println("3 - Caverna Da Morte");

			// Solicita ao usuario o lugar de escolha
			opcao = Console.readInt("Escolha uma local para investigar com a Equipe: ");

			// Switch case de escolha a local
			switch (opcao) {
			case 1:

				// 1º Local Monstro do lago
				objMonstro = ViewerMonstro.genMonstro(opcao, objEquipe);

				// Instancia o local
				local = new Local();
				local.setId(1);
				local = LocalSave.procurarLocal(local);

				// Mostra as informacoes instaciadas
				System.out.println("\nLocal 1 --Lago Do Desespero--");
				System.out.println(local.getDescricao());
				System.out.println("Você(s) Sentiram um arrepio e de repente");
				System.out.println("Aparece diante de Você(s) o " + objMonstro.getNome());
				System.out.println(objMonstro.getDescricao());

				teste = true;
				break;
			case 2:
				// 3º Local Monstro da floresta

				objMonstro = ViewerMonstro.genMonstro(opcao, objEquipe);

				// Instancia o local
				local = new Local();
				local.setId(2);
				local = LocalSave.procurarLocal(local);

				// Mostra as informacoes instaciadas
				System.out.println("\nLocal 2 --A Floresta Em Chamas--");
				System.out.println(local.getDescricao());
				System.out.println("Você(s) Sentiram um arrepio e de repente");
				System.out.println("Aparece diante de Você(s) a " + objMonstro.getNome());
				System.out.println(objMonstro.getDescricao());

				teste = true;
				break;
			case 3:

				// 2º Local Monstro da caverna
				objMonstro = ViewerMonstro.genMonstro(opcao, objEquipe);

				// Instancia o local
				local = new Local();
				local.setId(3);
				local = LocalSave.procurarLocal(local);

				// Mostra as informacoes instaciadas
				System.out.println("\nLocal 3 --Caverna Da Morte--");
				System.out.println(local.getDescricao());
				System.out.println("Você(s) Sentiram um arrepio e de repente");
				System.out.println("Aparece diante de Você(s) a " + objMonstro.getNome());
				System.out.println(objMonstro.getDescricao());

				teste = true;
				break;

			}
		} while (teste != true);

		objMonstro.setStatus("Vivo");
		
		// Chama a Iniciativa de jogo
		new Iniciativa(objEquipe, objMonstro);
	}
}
