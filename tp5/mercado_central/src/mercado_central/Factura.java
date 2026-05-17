package mercado_central;

abstract public class Factura implements Registrable {
	
	private AgenciaRecaudadora recaudadora;

	public Factura(AgenciaRecaudadora agencia) {
		this.recaudadora = agencia;
	}
	
	public void registrar() {
		recaudadora.registrarPago(this);
	}
	
	abstract public double montoAPagar();
	
	
}
