package banco;

import java.time.YearMonth;

public class Sueldo {

	private YearMonth periodo;
	private double neto;
	
	public Sueldo(YearMonth periodo, double neto) {
		this.periodo = periodo;
		this.neto = neto;
	}
	
	public double getNeto() {
		return this.neto;
	}
	
	public YearMonth getPeriodo() {
		return this.periodo;
	}
}

