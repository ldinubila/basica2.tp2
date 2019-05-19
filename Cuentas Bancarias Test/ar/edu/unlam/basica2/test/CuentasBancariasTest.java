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
		
		// Preparaci�n
		CuentaSueldo cuentaSueldo = new CuentaSueldo(0.0);
				
		//Ejecuci�n
		cuentaSueldo.extraer(100.0);
		Double saldoObtenido = cuentaSueldo.getSaldo();
		
		Assert.assertFalse(saldoObtenido<0);
		
				
	}
	
	@Test
	public void testQueCompruebaElFuncionamientoDeLaCuentaSueldo2() {
		
		// Preparaci�n
		CuentaSueldo cuentaSueldo2 = new CuentaSueldo(0.0);
				
		//Ejecuci�n
		cuentaSueldo2.depositar(100.0);
		Double saldoObtenido = cuentaSueldo2.getSaldo();
		Double saldoEsperado = 100.0;
		
		assertEquals(saldoEsperado, saldoObtenido);
		
			
	}
	
	
	@Test
	public void testQueCompruebaElFuncionamientoDeLaCajaDeAhorros() {
		
		// Preparaci�n
		CajaDeAhorros cajaDeAhorro = new CajaDeAhorros(1000.0);
				
		//Ejecuci�n
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
		
		// Preparaci�n
		CuentaCorriente cuentaCorriente = new CuentaCorriente(100.0);
				
		//Ejecuci�n
		cuentaCorriente.extraer(600.0);
		Double saldoObtenido = cuentaCorriente.getSaldo();
		Double saldoEsperado = 105.0;
		
		assertEquals(saldoEsperado, saldoObtenido);
		
	
		
			
	}
	
	
	
	
	
	

}
