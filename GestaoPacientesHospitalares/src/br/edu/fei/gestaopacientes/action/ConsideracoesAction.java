package br.edu.fei.gestaopacientes.action;

import com.opensymphony.xwork2.ActionSupport;

/** 
 * Classe respons�vel por realizar o processamento do Login do usu�rio
 * @author Gabriel Lett Viviani
 *
 */
public class ConsideracoesAction extends ActionSupport{
	/** Serial */
	private static final long serialVersionUID = -7943571654911514364L;
	
	private String pagina = "Consideracoes";
	private String paginaPresent = "Considera��es M�dicas";
	
	public String getPagina(){
		return this.pagina;
	}

	public String getPaginaPresent(){
		return this.paginaPresent;
	}
	
	public String execute(){
		return "success";
	}

}
