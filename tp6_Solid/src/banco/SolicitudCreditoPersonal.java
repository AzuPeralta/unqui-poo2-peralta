package banco;

public class SolicitudCreditoPersonal extends SolicitudCredito {

	public SolicitudCreditoPersonal(Cliente cliente, double monto, int cuotas) {
		super(cliente, monto, cuotas);
		// TODO Auto-generated constructor stub
	}

	@Override 
	public boolean esAceptable() {
		//condiciones que tiene que cumplir NO, ESTO LO TIENE QUE HACER EL EVALUADOR
	}
	
}
		