package com.vortexbird.junit.junitlab1;

public class CalculadoraException extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = -559609322386431659L;
	
	public CalculadoraException(String mensaje) {
		super(mensaje);
	}
	
	public CalculadoraException() {
		super();
	}

}
