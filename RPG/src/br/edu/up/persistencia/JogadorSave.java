package br.edu.up.persistencia;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import br.edu.up.entidades.Jogador;

public class JogadorSave {
	public static boolean incluir(Jogador jogador) {
		try {
			EntityManager manager = EntityManagerFactory.getInstance();
			manager.getTransaction().begin();
			manager.persist(jogador);
			manager.getTransaction().commit();
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	public static boolean alterar(Jogador jogador) {
		try {
			EntityManager manager = EntityManagerFactory.getInstance();
			manager.getTransaction().begin();
			manager.persist(jogador);
			manager.getTransaction().commit();
			return true;

		} catch (Exception e) {
			return false;
		}
	}

	public static boolean excluir(Jogador jogador) {
		try {
			EntityManager manager = EntityManagerFactory.getInstance();
			manager.getTransaction().begin();
			manager.remove(jogador);
			manager.getTransaction().commit();
			return true;

		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	public static Jogador procurarJogador(Jogador jogador) {
		EntityManager manager = EntityManagerFactory.getInstance();
		Query consulta = manager.createQuery("from Jogador where nome = :param1 and equipe_id = :param2 ");
		consulta.setParameter("param1", jogador.getNome());
		consulta.setParameter("param2", jogador.getEquipe());
		List<Jogador> jogadores = consulta.getResultList();
		if (!jogadores.isEmpty()) {
			return jogadores.get(0);
		}
		return null;
	}

	public static List<Jogador> listarJogadores(Jogador jogador) {
		EntityManager manager = EntityManagerFactory.getInstance();
		Query consulta = manager.createQuery("from Jogador where nome like :param1 ");
		consulta.setParameter("param1", "%" + jogador.getNome() + "%");
		List<Jogador> jogadores = consulta.getResultList();

		return jogadores;
	}
}
