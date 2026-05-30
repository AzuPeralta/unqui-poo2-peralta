package banco;

public class SolicitudCreditoHipotecario extends SolicitudCredito {
	
	private Propiedad garantia;

	public SolicitudCreditoHipotecario(Cliente cliente, double monto, int cuotas, Propiedad garantia) {
		super(cliente, monto, cuotas);
		this.garantia = garantia;
	}

	public boolean esAceptable() {
		return condicionEconomica() && condicionEtaria() && condicionGarantia();
				
	}
	
	private boolean condicionEconomica() {
		return this.cuotaMensual() <= this.cliente.sueldoMensual(); 
	}
	
	private boolean condicionEtaria() {
		int aniosCredito = this.cantCuotas / 12; 
		
		return this.cliente.edad() + aniosCredito <= 65;
	}
	
	private boolean condicionGarantia() {
		return  this.montoTotal >= garantia.getValorFiscal() * 0.7;
	}
	
	
}


//Para ser aceptadas, las solicitudes de créditos hipotecarios requieren que el monto de la cuota no supere el 50%
//de los ingresos mensuales del titular, que el monto total solicitado no sea mayor al 70% del valor fiscal de la
//garantía, y que la persona no supere los 65 años de edad antes de terminar de pagar el crédito.