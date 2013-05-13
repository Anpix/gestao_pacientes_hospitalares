package br.edu.fei.gestaopacientes.action;

import com.opensymphony.xwork2.ActionSupport;

/** 
 * Classe respons�vel por realizar o processamento do Login do usu�rio
 * @author Gabriel Lett Viviani
 *
 */
public class MedicamentosAction extends ActionSupport{
	/** Serial */
	private static final long serialVersionUID = -7943571654911514364L;
	
	public String execute(){
		return "success";
	}

	private String pagina = "Medicamentos";
	private String paginaPresent = "Medicamentos";
	
	public String getPagina(){
		return this.pagina;
	}

	public String getPaginaPresent(){
		return this.paginaPresent;
	}
	
	
}
