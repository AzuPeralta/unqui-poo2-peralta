package banco;

public abstract class SolicitudCredito {
	
	protected Cliente cliente;
	protected double montoTotal;
	protected int cantCuotas;

	
	public SolicitudCredito(Cliente cliente, double monto, int cuotas) {
		this.cliente = cliente;
		this.montoTotal = monto;
		this.cantCuotas = cuotas;
	}
	
	public String getNombreCliente() {
		return this.cliente.getNombre();
	}
	
	public double cuotaMensual() {
		return this.montoTotal / this.cantCuotas;
	}
	
	
	public double getMonto() {
		return this.montoTotal;
	}
	
	@Override 
	public String toString() {
		return "Se otorgó el crédito al cliente " + getNombreCliente() + "por " + getMonto();
		
	}
	
	
	public abstract boolean esAceptable();
	
}

//Al agregar una nueva solicitud de crédito al banco, se indica cuál es el cliente que la solicita, el monto solicitado y el
//plazo en meses. Dada una solicitud, se obtiene el monto de la cuota mensual dividiendo el monto solicitado por la
//cantidad de cuotas (considerando que se abona una cuota por mes).
//A todas las solicitudes de crédito se les puede realizar el chequeo sobre si son aceptables o no, lo cual depende
//del tipo de solicitud que se trate, como se explica a continuación.


