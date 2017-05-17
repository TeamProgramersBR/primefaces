package br.com.ambientinformatica.primefaces.persistencia;

import java.util.List;

import javax.faces.context.FacesContext;
import javax.persistence.Query;

import org.primefaces.context.RequestContext;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import br.com.ambientinformatica.jpa.persistencia.PersistenciaJpa;
import br.com.ambientinformatica.primefaces.entidade.Contato;

@Repository("contatoDao")
public class ContatoDaoJpa extends PersistenciaJpa<Contato> implements ContatoDao {

	private static final long serialVersionUID = 1L;

	@SuppressWarnings("unchecked")
	@Override
	public List<Contato> listarPorNomeOuTelefone(String nomeOuTelefone) {
		Query query = em.createQuery(
				"select c from Contato c where UPPER(c.nome) LIKE :nome OR UPPER(c.telefone) LIKE :telefone");
		query.setParameter("nome", nomeOuTelefone.toUpperCase() + "%");
		query.setParameter("telefone", nomeOuTelefone.toUpperCase() + "%");
		return query.getResultList();
	}
	
		@Transactional
		@Override
		public void update(Contato contato) {
			em.merge(contato);
		}
		
		


}