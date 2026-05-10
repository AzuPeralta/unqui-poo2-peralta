package trabajador;

import java.util.Date;

public class IngresoPorHsExtras extends Ingreso {
	
	public int hsExtrasTrabajadas;
	
	IngresoPorHsExtras(Date mes, String concepto, Double monto, int cantHsExtras){
		super(mes, concepto, monto);
		this.hsExtrasTrabajadas = cantHsExtras;
	}	
	
	@Override
	public Double getMontoImponible() {
		return 0d;
	}
	
	@Override
	public Double getMontoNoImponible() {
		return super.monto;
	}
	
	
}
