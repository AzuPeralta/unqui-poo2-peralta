package empresa;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public abstract class Empleado {
	
	public String    nombre;
	public String    direccion;
	public String 	 estadoCivil;
	public LocalDate fechaNac; 
	public Double    sueldoBasico;


	public Empleado(String nombre, String direccion, String estadoCivil, LocalDate fechaNac, Double sueldoBasico) {
		super();
		this.nombre = nombre;
		this.direccion = direccion;
		this.estadoCivil = estadoCivil;
		this.fechaNac = fechaNac;
		this.sueldoBasico = sueldoBasico;
	}

	public Long edad() {
		
		return ChronoUnit.YEARS.between(this.fechaNac, LocalDate.now());
	}
	
	public Double sueldoNeto() {
		return sueldoBruto() - retenciones();
	}
	public Double retenciones() {
		return this.aporteJub() + this.aporteOS();
	}
	
	public abstract Double sueldoBruto();
	public abstract Double aporteOS();
	public abstract Double aporteJub();
}
