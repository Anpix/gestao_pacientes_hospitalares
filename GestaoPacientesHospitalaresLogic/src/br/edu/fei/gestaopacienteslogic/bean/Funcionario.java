package br.edu.fei.gestaopacienteslogic.bean;

import br.edu.fei.gestaopacienteslogic.enums.Cargo;

/**
 * Classe utilizada para representar um funcion�rio do hospital
 * @author Gabriel Lett Viviani
 *
 */
public class Funcionario extends Pessoa{
	
	/** Cargo deste funcion�rio no hospital */
	private Cargo cargo;

	/**
	 * @return the cargo
	 */
	public Cargo getCargo() {
		return cargo;
	}

	/**
	 * @param cargo the cargo to set
	 */
	public void setCargo(Cargo cargo) {
		this.cargo = cargo;
	}
}
