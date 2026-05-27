package banco;

import java.util.ArrayList;
import java.util.List;

public class Banco {

	private List<Cliente> clientes;
	private List<SolicitudCredito> solicitudes;
	
	
	public Banco() {
		this.clientes = new ArrayList<Cliente>();
		this.solicitudes = new ArrayList<SolicitudCredito>();
	}
	
	public void addCliente(Cliente cliente) {
		clientes.add(cliente);
	}
	
	public void addSolicitud(SolicitudCredito solicitud) {
		solicitudes.add(solicitud);
	}
	
	public boolean evaluarSolicitud(Evaluador evaluador, SolicitudCredito solicitud) {
		return evaluador.evaluarSolicitud(solicitud);
		
	}
	
	public void otorgarCredito(SolicitudCredito solicitud) {
		//sacar de la lista
		//hacer algo que indique que lo estas otorgando
	}
	
	//	Calcular el monto total de dinero a desembolsar por el banco, lo cual se obtiene como la sumatoria del
	//	monto solicitado de todas las solicitudes de crédito registradas que sean aceptables.
	public double calcularDesembolso() {
		return solicitudes.stream()
				.filter(s -> s.esAceptable())
				.mapToDouble(s -> s.getMonto())
				.sum();
	}
}
