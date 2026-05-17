package mercado_central;

public class AgenciaRecaudadora implements Agencia{

	@Override
	public void registrarPago(Factura factura) {
		System.out.println("Se registró un pago");
	}

}
