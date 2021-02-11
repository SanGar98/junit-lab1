package com.vortexbird.junit.junitlab1;

public class Calculadora {

	private static final String NUMERO2_NO_PUEDE_SER_INFINITO = "El numero2 no puede ser infinito";
	private static final String NUMERO1_NO_PUEDE_SER_INFINITO = "El numero1 no puede ser infinito";
	private static final String NUMERO2_NO_VALIDAO = "El numero2 no es válido";
	private static final String NUMERO1_NO_VALIDAO = "El numero1 no es válido";
	private static final String NUMERO2_OBLIGATORIO = "El número2 es obligatorio";
	private static final String NUMERO1_OBLIGATORIO = "El número1 es obligatorio";

	public Double sumar(Double numero1, Double numero2) throws CalculadoraException {
		if (numero1 == null) {
			throw new CalculadoraException (NUMERO1_OBLIGATORIO);
		}
		
		if (numero2 == null) {
			throw new CalculadoraException (NUMERO2_OBLIGATORIO);
		}
		
		if (numero1.isNaN()) {
			throw new CalculadoraException(NUMERO1_NO_VALIDAO);
		}
		
		if (numero2.isNaN()) {
			throw new CalculadoraException(NUMERO2_NO_VALIDAO);
		}
		
		if (numero1.isInfinite()) {
			throw new CalculadoraException(NUMERO1_NO_PUEDE_SER_INFINITO);
		}
		
		if (numero2.isInfinite()) {
			throw new CalculadoraException(NUMERO2_NO_PUEDE_SER_INFINITO);
		}
		
		return numero1+numero2;
	}
	
	public Double restar(Double numero1, Double numero2) throws CalculadoraException {
		if (numero1 == null) {
			throw new CalculadoraException (NUMERO1_OBLIGATORIO);
		}
		
		if (numero2 == null) {
			throw new CalculadoraException (NUMERO2_OBLIGATORIO);
		}
		
		if (numero1.isNaN()) {
			throw new CalculadoraException(NUMERO1_NO_VALIDAO);
		}
		
		if (numero2.isNaN()) {
			throw new CalculadoraException(NUMERO2_NO_VALIDAO);
		}
		
		if (numero1.isInfinite()) {
			throw new CalculadoraException(NUMERO1_NO_PUEDE_SER_INFINITO);
		}
		
		if (numero2.isInfinite()) {
			throw new CalculadoraException(NUMERO2_NO_PUEDE_SER_INFINITO);
		}
		
		return numero1-numero2;
	}
	
	public Double multiplicar(Double numero1, Double numero2) throws CalculadoraException {
		if (numero1 == null) {
			throw new CalculadoraException (NUMERO1_OBLIGATORIO);
		}
		
		if (numero2 == null) {
			throw new CalculadoraException (NUMERO2_OBLIGATORIO);
		}
		
		if (numero1.isNaN()) {
			throw new CalculadoraException(NUMERO1_NO_VALIDAO);
		}
		
		if (numero2.isNaN()) {
			throw new CalculadoraException(NUMERO2_NO_VALIDAO);
		}
		
		if (numero1.isInfinite()) {
			throw new CalculadoraException(NUMERO1_NO_PUEDE_SER_INFINITO);
		}
		
		if (numero2.isInfinite()) {
			throw new CalculadoraException(NUMERO2_NO_PUEDE_SER_INFINITO);
		}
		
		return numero1*numero2;
	}
	
	public Double dividir(Double dividendo, Double divisor) throws CalculadoraException {
		if (dividendo == null) {
			throw new CalculadoraException (NUMERO1_OBLIGATORIO);
		}
		
		if (divisor == null) {
			throw new CalculadoraException (NUMERO2_OBLIGATORIO);
		}
		
		if (dividendo.isNaN()) {
			throw new CalculadoraException(NUMERO1_NO_VALIDAO);
		}
		
		if (divisor.isNaN()) {
			throw new CalculadoraException(NUMERO2_NO_VALIDAO);
		}
		
		if (dividendo.isInfinite()) {
			throw new CalculadoraException(NUMERO1_NO_PUEDE_SER_INFINITO);
		}
		
		if (divisor.isInfinite()) {
			throw new CalculadoraException(NUMERO2_NO_PUEDE_SER_INFINITO);
		}
		
		//Se deja bloque comentado, para verificar que la prueba de unidad 
		//valide la regla: no se puede dividir entre cero
		
		if (divisor.equals(0d)) {
			throw new CalculadoraException("El divisor no puede ser igual a cero");
		}
		
		return dividendo/divisor;
	}
	
}
