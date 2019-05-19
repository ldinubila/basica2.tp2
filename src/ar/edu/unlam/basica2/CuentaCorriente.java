package ar.edu.unlam.basica2;

public class CuentaCorriente extends CuentasBancarias{

	public CuentaCorriente(Double saldo) {
		super(saldo);
		// TODO Auto-generated constructor stub
	}

	private final Integer DESCUBIERTO = 150;
	private final Double COMISION = 0.5;
	
	
	@Override
	public Double extraer (Double cantidad) {
		if (cantidad < saldo)
			saldo -= cantidad;
		else { if (cantidad >= saldo + DESCUBIERTO)
			System.out.print("No posee descubierto para realizar la operación");
		else 
			saldo = (saldo - cantidad) * COMISION;
		}
	return saldo;
			
	}
	














}
