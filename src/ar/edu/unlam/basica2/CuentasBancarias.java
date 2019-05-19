package ar.edu.unlam.basica2;

public class CuentasBancarias {

	protected Double saldo;
	protected Long cbu;
	

		
	public CuentasBancarias(Double saldo) {
		this.saldo = saldo;
	}



	public void depositar(Double cantidad) {
		saldo += cantidad;
	}
	
	
	
	public Double extraer(Double cantidad) {
		if (cantidad > saldo) {
			System.out.print("No posee saldo disponible");
		} else {
			saldo -= cantidad;
		}
		return saldo;
	}


	public Double saldo() {
		return saldo;
	}
	
	

	public Double getSaldo() {
		return saldo;
	}



	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}




	
	
	
	
	
	
	
	
	
	
}
