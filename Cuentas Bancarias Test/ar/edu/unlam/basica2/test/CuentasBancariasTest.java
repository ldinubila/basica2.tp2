package ar.edu.unlam.basica2.test;

import static org.junit.Assert.assertEquals;


import org.junit.Assert;
import org.junit.Test;

import ar.edu.unlam.basica2.CajaDeAhorros;
import ar.edu.unlam.basica2.CuentaCorriente;
import ar.edu.unlam.basica2.CuentaSueldo;


public class CuentasBancariasTest {
	
	@Test
	public void testQueCompruebaElFuncionamientoDeLaCuentaSueldo() {
		
		// Preparación
		CuentaSueldo cuentaSueldo = new CuentaSueldo(0.0);
				
		//Ejecución
		cuentaSueldo.extraer(100.0);
		Double saldoObtenido = cuentaSueldo.getSaldo();
		
		Assert.assertFalse(saldoObtenido<0);
		
				
	}
	
	@Test
	public void testQueCompruebaElFuncionamientoDeLaCuentaSueldo2() {
		
		// Preparación
		CuentaSueldo cuentaSueldo2 = new CuentaSueldo(0.0);
				
		//Ejecución
		cuentaSueldo2.depositar(100.0);
		Double saldoObtenido = cuentaSueldo2.getSaldo();
		Double saldoEsperado = 100.0;
		
		assertEquals(saldoEsperado, saldoObtenido);
		
			
	}
	
	
	@Test
	public void testQueCompruebaElFuncionamientoDeLaCajaDeAhorros() {
		
		// Preparación
		CajaDeAhorros cajaDeAhorro = new CajaDeAhorros(1000.0);
				
		//Ejecución
		cajaDeAhorro.extraer(100.0);
		cajaDeAhorro.extraer(100.0);
		cajaDeAhorro.extraer(100.0);
		cajaDeAhorro.extraer(100.0);
		cajaDeAhorro.extraer(100.0);
		cajaDeAhorro.extraer(100.0);
		Double saldoObtenido = cajaDeAhorro.getSaldo();
		Double saldoEsperado = 394.0;
		
		assertEquals(saldoEsperado, saldoObtenido);
		
	
		
			
	}
	
	
	
	@Test
	public void testQueCompruebaElFuncionamientoDeLaCuentaCorriente() {
		
		// Preparación
		CuentaCorriente cuentaCorriente = new CuentaCorriente(100.0);
				
		//Ejecución
		cuentaCorriente.extraer(600.0);
		Double saldoObtenido = cuentaCorriente.getSaldo();
		Double saldoEsperado = 105.0;
		
		assertEquals(saldoEsperado, saldoObtenido);
		
	
		
			
	}
	
	
	
	
	
	

}
