package empresa;
import java.time.LocalDate;

public class EmpleadoPermanente extends Empleado {
	
	public int hijos;
	public int antig;
	public Double asigXHijo;
	public Double asigXCony;
	public Double adicXAntig;
	public Double retPorHijo;



	public EmpleadoPermanente(String nombre, String direccion, String estadoCivil, LocalDate fechaNac,
							  Double sueldoBasico, int hijos, int antig) {
		super(nombre, direccion, estadoCivil, fechaNac, sueldoBasico);
		this.hijos = hijos;
		this.antig = antig;
	}

	private Boolean esCasado() {
		return super.estadoCivil == "Casado/a";
	}
	
	private Double salarioFamiliar() {
		return (this.hijos * this.asigXHijo) + ((this.esCasado()) ? this.asigXCony : 0);
	}
	
	private Double adicXAntig() {
		return this.antig * this.adicXAntig;
	}
	
	@Override
	public Double sueldoBruto() {

		return this.sueldoBasico + this.salarioFamiliar() + this.adicXAntig();
	}

	@Override
	public Double aporteOS() {
		return (this.sueldoBruto() * 0.1) + (this.retPorHijo * this.hijos);
	}

	@Override
	public Double aporteJub() {
		return (this.sueldoBruto() * 0.15);
	}

}
