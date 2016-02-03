package br.com.jonas.conexao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Conexao {
	
	private static EntityManagerFactory emf;

	private Conexao() {
		emf = Persistence.createEntityManagerFactory("hibrenateComMysql");
	}
	
	public static EntityManager getEntityManager(){
		if (emf == null) {
			new Conexao();
		}
		EntityManager em = emf.createEntityManager();
		return em;
	}

}
