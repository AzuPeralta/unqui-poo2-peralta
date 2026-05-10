package trabajador;

import java.util.ArrayList;
import java.util.List;
import java.util.function.ToDoubleFunction;

public class Trabajador {

	public Double impuestoAlTrabajador = 0.02;
	public List<Ingreso> ingresos = new ArrayList<Ingreso>();
	
	private Double totales(ToDoubleFunction<Ingreso> totalTipo) {
	    return ingresos.stream()
	                   .mapToDouble(totalTipo) 
	                   .sum();
	}
	
	public Double getTotalPercibido() {
		return getMontoImponible() + getMontoNoImponible() - getImpuestoAPagar();
	}
	
	public Double getMontoImponible() {
		return totales(i -> i.getMontoImponible());
	}
	
	public Double getMontoNoImponible() {
		return totales(i -> i.getMontoNoImponible());	
	}
	
	public Double getImpuestoAPagar() {
		return getMontoImponible() * impuestoAlTrabajador; 
	}

}
