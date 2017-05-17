package br.com.ambientinformatica.primefaces.persistencia;

import java.util.List;

import br.com.ambientinformatica.jpa.persistencia.Persistencia;
import br.com.ambientinformatica.primefaces.entidade.Contato;


public interface ContatoDao extends Persistencia<Contato>{
	List<Contato> listarPorNomeOuTelefone(String NomeOuTelefone);
	public void update(Contato contato);
	
}
