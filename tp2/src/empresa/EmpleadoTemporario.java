package empresa;

import java.time.LocalDate;

public class EmpleadoTemporario extends Empleado {
	
	public LocalDate finDesignacion;
	public int cantHorasExtras;
	public Double adicXHsExtra;
	public Double descMayorDe50; 
	public Double aporteJubXHsExtra; 
	
	

	public EmpleadoTemporario(String nombre, String direccion, String estadoCivil, LocalDate fechaNac,
			Double sueldoBasico, LocalDate finDesignacion, int cantHorasExtras) {
		super(nombre, direccion, estadoCivil, fechaNac, sueldoBasico);
		this.finDesignacion = finDesignacion;
		this.cantHorasExtras = cantHorasExtras;
	}

	@Override
	public Double sueldoBruto() {

		return this.sueldoBasico + (this.cantHorasExtras * this.adicXHsExtra);
	}

	@Override
	public Double aporteOS() {
		//Obra Social: 10% de su sueldo bruto + $25 si supera los 50 años 
		return this.sueldoBruto() * 0.1 + ((this.edad() > 50) ? this.descMayorDe50 : 0);
	}

	@Override
	public Double aporteJub() {
		//Aportes Jubilatorios: 10% de su sueldo bruto + $5 por cada hora extra.
		return (this.sueldoBruto() * 0.1) + (this.aporteJubXHsExtra * this.cantHorasExtras);
	}

}
