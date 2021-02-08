package com.vortexbird.junit.junitlab1.unit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.vortexbird.junit.junitlab1.Calculadora;

class CalculadoraTest {

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
		final Calculadora calculadora = new Calculadora();
		
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
		final Calculadora calculadora = new Calculadora();
		
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
		Calculadora calculadora = new Calculadora();
		
		/*
		 * *************************************
		 * Act and assert on throws
		 * Invoque la funcionalidad
		 * ************************************* 
		 */
		assertThrows(Exception.class, ()->{
			calculadora.sumar(n1, n2);
		});
		
		
	}
	
}
