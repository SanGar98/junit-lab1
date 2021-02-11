package com.vortexbird.junit.junitlab1.unit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.vortexbird.junit.junitlab1.Calculadora;
import com.vortexbird.junit.junitlab1.CalculadoraException;

class CalculadoraTest {

	final Calculadora calculadora = new Calculadora();
	
	/**
	 * Prueba de unidad que valida que la suma de dos números positivos, de 
	 * un resultado válido
	 * @throws Exception calculadora.sumar(n1, n2) puede lanzar Excepción
	 */
	@Test
	void sumar_debe_retornar_resultado_valido_con_numeros_positivos() throws Exception{
		
		/*
		 * *************************************
		 * Arrange
		 * sea n1=5 y n2=4
		 * ************************************* 
		 */
		final Double n1=5d;
		final Double n2=4d;
		final Double resultadoEsperado = 9d;
		Double resultadoObtenido = null;
		
		/*
		 * *************************************
		 * Act
		 * Invoque la funcionalidad
		 * ************************************* 
		 */
		resultadoObtenido = calculadora.sumar(n1, n2);
		
		
		/*
		 * *************************************
		 * Assert
		 * Asegure que el resultado obtenido sea el esperdo
		 * ************************************* 
		 */
		assertEquals(resultadoEsperado, resultadoObtenido);
		
	}
	
	/**
	 * Prueba de unidad que valida que la suma de dos números negativos, de 
	 * un resultado válido
	 * @throws Exception calculadora.sumar(n1, n2) puede lanzar Excepción
	 */
	@Test
	void sumar_debe_retornar_resultado_valido_con_numeros_negativos() throws Exception{
		
		/*
		 * *************************************
		 * Arrange
		 * sea n1=-5 y n2=-4
		 * ************************************* 
		 */
		final Double n1=-5d;
		final Double n2=-4d;
		final Double resultadoEsperado = -9d;
		Double resultadoObtenido = null;
		
		/*
		 * *************************************
		 * Act
		 * Invoque la funcionalidad
		 * ************************************* 
		 */
		resultadoObtenido = calculadora.sumar(n1, n2);
		
		
		/*
		 * *************************************
		 * Assert
		 * Asegure que el resultado obtenido sea el esperdo
		 * ************************************* 
		 */
		assertEquals(resultadoEsperado, resultadoObtenido);
		
	}
	
	/**
	 * Prueba de unidad que valida que la suma de dos números positivos, 
	 * cuando uno de ellos es infinito, debe arrojar una excepcion
	 * @throws Exception calculadora.sumar(n1, n2) puede lanzar Excepción
	 */
	@Test
	void sumar_debe_lanzar_excepcion_con_numero_infinito() throws Exception{
		
		/*
		 * *************************************
		 * Arrange
		 * sea n1=5 y n2=infinito
		 * ************************************* 
		 */
		Double n1=5d;
		Double n2=Double.POSITIVE_INFINITY;
		
		/*
		 * *************************************
		 * Act and assert on throws
		 * Invoque la funcionalidad
		 * ************************************* 
		 */
		assertThrows(CalculadoraException.class, ()->{
			calculadora.sumar(n1, n2);
		});
		
		
	}
	
	/**
	 * Prueba de unidad que valida que la división de dos números 
	 * reales (con divisor diferente a cero), debe dar como resultado 
	 * un número real
	 * @throws Exception calculadora.dividir(n1, n2) puede lanzar Excepción
	 */
	@Test
	void dividir_debe_retornar_resultado_valido_con_numeros_positivos() throws Exception{
		
		/*
		 * *************************************
		 * Arrange
		 * sea n1=10 y n2=2
		 * ************************************* 
		 */
		final Double dividendo=10d;
		final Double divisor=2d;
		final Double resultadoEsperado = 5d;
		Double resultadoObtenido = null;
		
		/*
		 * *************************************
		 * Act
		 * Invoque la funcionalidad
		 * ************************************* 
		 */
		resultadoObtenido = calculadora.dividir(dividendo, divisor);
		
		
		/*
		 * *************************************
		 * Assert
		 * Asegure que el resultado obtenido sea el esperdo
		 * ************************************* 
		 */
		assertEquals(resultadoEsperado, resultadoObtenido);
		
	}
	
	/**
	 * Prueba de unidad que valida que la división de dos números 
	 * reales (con divisor diferente a cero), debe dar como resultado 
	 * un número real
	 * @throws Exception calculadora.dividir(n1, n2) puede lanzar Excepción
	 */
	@Test
	void dividir_debe_retornar_resultado_valido_con_numeros_positivos_con_aproximacion() throws Exception{
		
		/*
		 * *************************************
		 * Arrange
		 * sea n1=10 y n2=2
		 * ************************************* 
		 */
		final Double dividendo=10d;
		final Double divisor=3d;
		final Double resultadoEsperado = 3.33d;
		Double resultadoObtenido = null;
		
		/*
		 * *************************************
		 * Act
		 * Invoque la funcionalidad
		 * ************************************* 
		 */
		resultadoObtenido = calculadora.dividir(dividendo, divisor);
		
		
		/*
		 * *************************************
		 * Assert
		 * Asegure que el resultado obtenido sea el esperdo
		 * ************************************* 
		 */
		assertEquals(resultadoEsperado, resultadoObtenido, 0.004d);
		
	}
	
	/**
	 * Prueba de unidad que valida que la división de dos números 
	 * reales con divisor igual a cero, debe lanzar una excepción
	 * @throws Exception calculadora.dividir(n1, n2) puede lanzar Excepción
	 */
	@Test
	void dividir_debe_lanzar_ecepcion_con_divisor_cero() throws Exception{
		
		/*
		 * *************************************
		 * Arrange
		 * sea n1=10 y n2=2
		 * ************************************* 
		 */
		final Double dividendo=10d;
		final Double divisor=0d;
		
		/*
		 * *************************************
		 * Act y assert
		 * Invoque la funcionalidad
		 * ************************************* 
		 */
		assertThrows(CalculadoraException.class, ()->{
			calculadora.dividir(dividendo, divisor);
		});
		
		
	}
	
}
