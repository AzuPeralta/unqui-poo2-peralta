package banco;

public abstract class SolicitudCredito {
	
	private Cliente cliente;
	private double monto;
	private int cantCuotas;

	
	public SolicitudCredito(Cliente cliente, double monto, int cuotas) {
		this.cliente = cliente;
		this.monto = monto;
		this.cantCuotas = cuotas;
	}
	
	public double cuotaMensual(double monto, int mes) {
		return monto;
	}
	
	
	public double getMonto() {
		return this.monto;
	}
	
	public abstract boolean esAceptable();
	

}

