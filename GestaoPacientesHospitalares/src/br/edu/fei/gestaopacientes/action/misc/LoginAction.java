package br.edu.fei.gestaopacientes.action.misc;

import com.opensymphony.xwork2.ActionSupport;

/** 
 * Classe respons�vel por realizar o processamento do Login do usu�rio
 * @author Gabriel Lett Viviani
 *
 */
public class LoginAction extends ActionSupport{
	/** Serial */
	private static final long serialVersionUID = -7943571654911514364L;
	
	/** Field Login do JSP */
	private String login;
	
	/** Field senha do JSP */
	private String senha;

	/**
	 * Metodo padr�o chamado por toda action caso n�o seja definido no struts.xml 
	 */
	public String execute() {

		// As propriedades j� vem preenchidas com seu respectivo nome da tela, e 
		// aqui podemos obtelas normalmente
		if (this.login.equals("fei") && this.senha.equals("123")) {
			return "success";
		} else {
			addActionError("Login Invalido!");
			return "login_invalido";
		}
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}
}
