package br.edu.up.negocio;

import br.edu.up.entidades.Equipe;
import br.edu.up.entidades.Monstro;
import br.edu.up.persistencia.MonstroSave;

public class ViewerMonstro {
	// Funcao pra instanciar obj
	public static Monstro genMonstro(int opcao, Equipe equipe) {
		
		// Obj pra mostrar as informacoes da luta
		Monstro monstro = null;

		// If pra utilizar para case
		if (opcao == 1) {

			// Instancia o monstro com seu id pra busca no banco 
			monstro = new Monstro();
			monstro.setId(1);
			monstro =  MonstroSave.procurarMonstro(monstro);
			
			// Atribui a vida ao monstro
			monstro = AtribuiVida.atribuiVida(monstro, equipe, opcao);

		} else if (opcao == 2) {

			// Instancia o monstro com seu id pra busca no banco 
			monstro = new Monstro();
			monstro.setId(2);
			monstro =  MonstroSave.procurarMonstro(monstro);
			
			// Atribui a vida ao monstro
			monstro = AtribuiVida.atribuiVida(monstro, equipe, opcao);

		} else if (opcao == 3) {

			// Instancia o monstro com seu id pra busca no banco 
			monstro = new Monstro();
			monstro.setId(3);
			monstro =  MonstroSave.procurarMonstro(monstro);
			
			// Atribui a vida ao monstro
			monstro = AtribuiVida.atribuiVida(monstro, equipe, opcao);
		}

		// Retorna o monstro para o menu local
		return monstro;
	}
}
