package trabajador;

import java.util.Date;

public class Ingreso {

	private Date mesDePercepcion;
	private String concepto;
	protected Double monto;
	
	Ingreso(Date mes, String concepto, Double monto){
		this.mesDePercepcion = mes;
		this.concepto = concepto;
		this.monto = monto;
	}

	public Date getMesDePercepcion() {
		return mesDePercepcion;
	}

	public String getConcepto() {
		return concepto;
	}
	
	public Double getMontoNoImponible() {
		return 0d;
		
	}
	
	public Double getMontoImponible() {
		return monto;
	}
}
