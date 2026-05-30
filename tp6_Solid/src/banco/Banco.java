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
	
	public void otorgarCredito(SolicitudCredito solicitud) {
		System.out.println(solicitud.toString());
		
	}
	
	public double calcularDesembolso() {
		return solicitudes.stream()
				.filter(s -> s.esAceptable())
				.mapToDouble(s -> s.getMonto())
				.sum();
	}
}
