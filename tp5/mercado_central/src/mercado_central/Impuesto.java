package mercado_central;

public class Impuesto extends Factura{
	
	private double tasaServicio; 
	
	public Impuesto(double tasa, AgenciaRecaudadora agencia) {
		super(agencia);
		this.tasaServicio = tasa;
	}
	

	@Override
	public double montoAPagar() {
		// TODO Auto-generated method stub
		return this.tasaServicio;
	}

}
