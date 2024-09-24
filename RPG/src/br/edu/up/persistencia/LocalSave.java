package br.edu.up.persistencia;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import br.edu.up.entidades.Local;

public class LocalSave {
   
    	public static Local procurarLocal(Local local) {
    		EntityManager manager = EntityManagerFactory.getInstance();
    		Query consulta = manager.createQuery("from Local where id = :param");
    		consulta.setParameter("param", local.getId());
    		List<Local> locais = consulta.getResultList();
    		if (!locais.isEmpty()) {
    			return locais.get(0);
    		}
    		return null;
    	}
}
