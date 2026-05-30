package banco;


public class SolicitudCreditoPersonal extends SolicitudCredito {

	public SolicitudCreditoPersonal(Cliente cliente, double monto, int cuotas) {
		super(cliente, monto, cuotas);
	}

	@Override 
	public boolean esAceptable() {
		return (this.cliente.sueldoNetoAnual() > 15000) && (this.cuotaMensual() <= this.cliente.sueldoMensual() * 0.7); 
	}
	
}
		

//Solicitudes de crédito personal
//Las solicitudes para los créditos personales requieren que el solicitante tenga ingresos anuales por al menos
//$15000, y que el monto de la cuota no supere el 70% de sus ingresos mensuales.
