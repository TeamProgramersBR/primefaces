package br.com.ambientinformatica.primefaces.controle;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;

import org.primefaces.context.RequestContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import br.com.ambientinformatica.ambientjsf.util.UtilFaces;
import br.com.ambientinformatica.jpa.exception.PersistenciaException;
import br.com.ambientinformatica.primefaces.entidade.Contato;
import br.com.ambientinformatica.primefaces.persistencia.ContatoDao;

@Controller("ContatoControl")
@Scope("conversation")
@ViewScoped
public class ContatoControl {

	private String nomeOuTelefone;
	

	private Contato contato = new Contato();
	private Contato contatoPOP = new Contato();

	@Autowired
	private ContatoDao contatoDao;

	private List<Contato> contatos = new ArrayList<Contato>();

	private boolean editMode;

	@PostConstruct
	public void init() {
		listar(null);
	}

	public void confirmar(ActionEvent evt) {
		try {
			contatoDao.alterar(contato);
			listar(evt);
			contato = new Contato();
		} catch (Exception e) {
			UtilFaces.addMensagemFaces(e);
		}
	}

	public void listar(ActionEvent evt) {
		try {
			contatos = contatoDao.listar();
		} catch (Exception e) {
			UtilFaces.addMensagemFaces(e);
		}
	}

	public void pesquisar() {
		contatos = contatoDao.listarPorNomeOuTelefone(nomeOuTelefone);
	}

	public void excluir(Contato contato) {
		try {
			contatoDao.excluirPorId(contato.getId());
			contatos = contatoDao.listar();
			UtilFaces.addMensagemFaces("Contato Excluído com sucesso!");
		} catch (Exception e) {
			UtilFaces.addMensagemFaces(e.getMessage());
		}
	}
	
	
public void selecionarContatoParaEdicao(Contato  contato){
		
		try {
			this.contato = contatoDao.consultar(contato.getId());
		} catch (PersistenciaException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
public void selecionarContatoParaEdicao(int  idcontato){
	
	try {
		this.contato = contatoDao.consultar(idcontato);
	} catch (PersistenciaException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	
}
	public void updatePopUp(int id){
		try{
			this.contato = contatoDao.consultar(id);
			
		}catch(PersistenciaException e){
			e.printStackTrace();
		}
	}
	// Metodo para alterar o contato//
	// public void alterar(Contato contato) throws PersistenciaException {
	// contatoDao.alterar(contato);
	// }

	public void update() {
		this.editMode = true;
	}
	/// teste para ver se altera pelo table esta funcionando
	public void modificar(Contato com) throws PersistenciaException{
	contatoDao.alterar(com);
		
	}

	public void listarTodos() throws PersistenciaException {
		contatos = contatoDao.listar();
	}

	public Contato getContato() {
		return contato;
	}

	public void setContato(Contato contato) {
		this.contato = contato;
	}

	public List<Contato> getContatos() {
		return contatos;
	}

	public String getNomeOuTelefone() {
		return nomeOuTelefone;
	}

	public void setNomeOuTelefone(String nomeOuTelefone) {
		this.nomeOuTelefone = nomeOuTelefone;
	}

	public boolean isEditMode() {
		return editMode;
	}

	public void setEditMode(boolean editMode) {
		this.editMode = editMode;
	}

	public Contato getContatoPOP() {
		return contatoPOP;
	}

	public void setContatoPOP(Contato contatoPOP) {
		System.out.println("ENTROU AQUI");
		this.contatoPOP = contatoPOP;
	}

	

}
