package br.edu.up.negocio;

import java.util.List;

import br.edu.up.entidades.IniciativaObj;

public class OrdemIniciativa {
	public static List<IniciativaObj> ordenarObjetos(List<IniciativaObj> objIniciativas) {
		int n = objIniciativas.size();

		for (int i = 0; i < n - 1; i++) {
			int indiceMaior = i;

			for (int j = i + 1; j < n; j++) {
				if (objIniciativas.get(j).getValor() > objIniciativas.get(indiceMaior).getValor()) {
					indiceMaior = j;
				}
			}

			IniciativaObj temp = objIniciativas.get(indiceMaior);
			objIniciativas.set(indiceMaior, objIniciativas.get(i));
			objIniciativas.set(i, temp);
		}
		
		return objIniciativas;
	}
}
