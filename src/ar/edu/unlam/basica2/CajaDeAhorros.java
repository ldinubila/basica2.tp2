package ar.edu.unlam.basica2;

public class CajaDeAhorros extends CuentasBancarias{

	
	public CajaDeAhorros(Double saldo) {
		super(saldo);
		// TODO Auto-generated constructor stub
	}
	
	Integer cantidadDeExtracciones=0;
	private final Integer COMISION = 6;
	
	@Override
	public Double extraer(Double cantidad) {
		if (cantidad > saldo)
			System.out.print("No posee saldo disponible");
		else {
			saldo -= cantidad;
			cantidadDeExtracciones ++;
			if (cantidadDeExtracciones > 5 )
				saldo = saldo - COMISION;
		}
		return saldo;
	}
	
}
		
		
		



