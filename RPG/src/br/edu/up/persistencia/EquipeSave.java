package br.edu.up.persistencia;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import br.edu.up.entidades.Equipe;

public class EquipeSave {
	public static boolean incluir(Equipe equipe) {
		try {
			EntityManager manager = EntityManagerFactory.getInstance();
			manager.getTransaction().begin();
			manager.persist(equipe);
			manager.getTransaction().commit();
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	public static boolean alterar(Equipe equipe) {
		try {
			EntityManager manager = EntityManagerFactory.getInstance();
			manager.getTransaction().begin();
			manager.persist(equipe);
			manager.getTransaction().commit();
			return true;

		} catch (Exception e) {
			return false;
		}
	}

	public static boolean excluir(Equipe equipe) {
		try {
			EntityManager manager = EntityManagerFactory.getInstance();
			manager.getTransaction().begin();
			manager.remove(equipe);
			manager.getTransaction().commit();
			return true;

		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	public static Equipe procurarEquipe(Equipe equipe) {
		EntityManager manager = EntityManagerFactory.getInstance();
		Query consulta = manager.createQuery("from Equipe where nome = :param");
		consulta.setParameter("param", equipe.getNome());
		List<Equipe> equipes = consulta.getResultList();
		if (!equipes.isEmpty()) {
			return equipes.get(0);
		}
		return null;
	}

	public static List<Equipe> listaEquipes(Equipe equipe) {
		EntityManager manager = EntityManagerFactory.getInstance();
		Query consulta = manager.createQuery("from Equipe where nome LIKE :param");
		consulta.setParameter("param", "%" + equipe.getNome() + "%");
		List<Equipe> equipes = consulta.getResultList();

		return equipes;
	}
	
	public static List<Equipe> lidersEquipe(){
		EntityManager manager = EntityManagerFactory.getInstance();
		Query consulta = manager.createQuery("from Equipe ORDER BY pontuacao DESC").setMaxResults(25);
		List<Equipe> equipes = consulta.getResultList();
		
		return equipes;
	}
}
