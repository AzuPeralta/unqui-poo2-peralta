package empresa;
import java.util.Set;
import java.util.function.ToDoubleFunction;

public class Empresa {
	
	public String nombre;
	public String cuit;
	public Set<Empleado> empleados; //sin empleados repetidos!!!
	
	Empresa(String nombre, String cuit){
		this.nombre = nombre;
		this.cuit = cuit;
	}
	
	private Double totales(ToDoubleFunction<Empleado> totalTipo) {
	    return empleados.stream()
	                    .mapToDouble(totalTipo) 
	                    .sum();
	}

	
	private Double totalNeto() {	
	    return totales(e -> e.sueldoNeto());
		}
	
	private Double totalBruto() {
		return totales(e -> e.sueldoBruto());
	}
	
	private Double totalRetenciones() {
		return totales(e -> e.retenciones());
	}
	
	//public Void liquidarSueldos();		// to be continued...

}
