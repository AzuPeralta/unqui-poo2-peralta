package banco;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;

public class Cliente {
	private String nombre;
	private String apellido;
	private LocalDate fechaNac;
	private List<Sueldo> sueldos;
	
	public Cliente(String nombre, String apellido, LocalDate fechaNac) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.fechaNac = fechaNac;
		this.sueldos = new ArrayList<Sueldo>();
		
	}
	
	public LocalDate getFechaNac() {
		return this.fechaNac;
	}
	
	public int edad() {
		LocalDate hoy = LocalDate.now();
		
		return Period.between(hoy, getFechaNac()).getYears();
	}

	public void addSueldo(Sueldo nuevoSueldo) {
		this.addSueldo(nuevoSueldo);
	}
	
	public double sueldoNetoAnual(int anio) {
		
		return sueldos.stream()
				.filter(s -> s.getPeriodo().getYear() == anio) //Traeme los sueldos del año dado por parametros
				.mapToDouble(s -> s.getNeto())				   //De esos traeme todos los netos	
				.sum();										   //y sumalos 
	}
	
	public String getNombre() {
		return nombre;
	}

	public String getApellido() {
		return apellido;
	}

	

	
}
