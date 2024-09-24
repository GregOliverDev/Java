package br.edu.up.persistencia;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import br.edu.up.entidades.Monstro;

public class MonstroSave {
	public static Monstro procurarMonstro(Monstro monstro) {
		EntityManager manager = EntityManagerFactory.getInstance();
		Query consulta = manager.createQuery("from Monstro where id = :param");
		consulta.setParameter("param", monstro.getId());
		List<Monstro> monstros = consulta.getResultList();
		if (!monstros.isEmpty()) {
			return monstros.get(0);
		}
		return null;
	}
}
