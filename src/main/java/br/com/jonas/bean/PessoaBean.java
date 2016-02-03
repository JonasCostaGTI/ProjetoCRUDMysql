package br.com.jonas.bean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import br.com.jonas.dao.PessoaDAO;
import br.com.jonas.model.Pessoa;

@ManagedBean(name="pessoaBean")
@SessionScoped
public class PessoaBean {
	
	Pessoa pessoa = new Pessoa();
	
	
	public Pessoa getPessoa() {
		return pessoa;
	}
	public Pessoa setPessoa(Pessoa pessoa) {
		return  pessoa;
	}
	
	public void salvar() {
		PessoaDAO pessoaDAO = new PessoaDAO();
		pessoaDAO.salvaPessoa(pessoa);
		System.out.println("salvo");
	}
	
	public Pessoa pesquisarPorNome(Pessoa pessoa) {
		PessoaDAO pessoaDAO = new PessoaDAO();
		Pessoa pesquisaPorNome = pessoaDAO.pesquisaPorNome(pessoa);
		System.out.println("Pesquisou");
		return pesquisaPorNome;
	}
	
	
	
	

}
