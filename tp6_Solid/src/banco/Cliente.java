package banco;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;

public class Cliente {
	private String nombre;
	private String apellido;
	private LocalDate fechaNac;
	private List<Double> sueldos;
	
	public Cliente(String nombre, String apellido, LocalDate fechaNac) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.fechaNac = fechaNac;
		this.sueldos = new ArrayList<>();
		
	}
	
	public LocalDate getFechaNac() {
		return this.fechaNac;
	}
	
	public int edad() {
		LocalDate hoy = LocalDate.now();
		
		return Period.between(hoy, getFechaNac()).getYears();
	}

	public void addSueldo(Double nuevoSueldo) {
		this.addSueldo(nuevoSueldo);
	}
	
	public double sueldoMensual() {
		return this.sueldoNetoAnual() / 12; 
	}
	
	public double sueldoNetoAnual() {
		return sueldos.stream()
					  	.mapToDouble(Double::doubleValue)
					  	.sum();											  
	}
	
	public String getNombre() {
		return nombre;
	}
	

	public String getApellido() {
		return apellido;
	}

	

	
}
