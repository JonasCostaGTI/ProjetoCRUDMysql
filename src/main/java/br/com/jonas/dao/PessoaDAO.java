package br.com.jonas.dao;

import javax.persistence.EntityManager;

import br.com.jonas.conexao.Conexao;
import br.com.jonas.model.Pessoa;

public class PessoaDAO {

	public void salvaPessoa(Pessoa pessoa) {
		EntityManager em = Conexao.getEntityManager();
		em.getTransaction().begin();
		em.persist(pessoa);
		em.getTransaction().commit();
		em.close();
	}

	public Pessoa pesquisaPorNome(Pessoa pessoa) {
		EntityManager em = Conexao.getEntityManager();
		Pessoa find = em.find(Pessoa.class, pessoa.getId());
		em.close();
		return find;

	}

	public void editarPessoa(Pessoa pessoa) {
		EntityManager em = Conexao.getEntityManager();

		em.getTransaction().begin();
		em.merge(pessoa);
		em.getTransaction().commit();
		em.close();

	}

	public void removePessoa(Pessoa pessoa) {
		EntityManager em = Conexao.getEntityManager();

		em.getTransaction().begin();
		em.remove(pessoa);
		em.getTransaction().commit();
		em.close();

	}

}
