package mercado_central;

public class Servicio extends Factura {
	
	private double costoPorUnidad;
	private double unidadesConsumidas;
	
	public Servicio(double costoUnidad, double unidadesConsumidas, AgenciaRecaudadora agencia) {
		super(agencia);
		this.costoPorUnidad = costoUnidad;
		this.unidadesConsumidas = unidadesConsumidas;
	}

	@Override
	public void registrar() {
		// TODO Auto-generated method stub

	}

	@Override
	public double montoAPagar() {
		// TODO Auto-generated method stub
		return this.costoPorUnidad * this.unidadesConsumidas;
	}

}
