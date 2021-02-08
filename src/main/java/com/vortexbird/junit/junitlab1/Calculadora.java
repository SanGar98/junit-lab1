package com.vortexbird.junit.junitlab1;

public class Calculadora {

	public Double sumar(Double numero1, Double numero2) throws Exception {
		if (numero1 == null) {
			throw new Exception ("El número1 es obligatorio");
		}
		
		if (numero2 == null) {
			throw new Exception ("El número2 es obligatorio");
		}
		
		if (numero1.isNaN()) {
			throw new Exception("El numero1 no es válido");
		}
		
		if (numero2.isNaN()) {
			throw new Exception("El numero2 no es válido");
		}
		
		if (numero1.isInfinite()) {
			throw new Exception("El numero1 no puede ser infinito");
		}
		
		if (numero2.isInfinite()) {
			throw new Exception("El numero2 no puede ser infinito");
		}
		
		return numero1+numero2;
	}
	
}
