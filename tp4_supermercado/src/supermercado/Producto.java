package supermercado;

public class Producto {

	public String nombre;
	public Double precio;
	public Boolean esPrecioCuidado; 
	
	Producto(String nombre, Double precio){
		this(nombre, precio, false);
	}
	
	Producto(String nombre, Double precio, Boolean precioCuidado){
		this.nombre = nombre;
		this.precio = precio;
		this.esPrecioCuidado = precioCuidado;
	}
	
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Double getPrecio() {
		return precio;
	}

	public void setPrecio(Double precio) {
		this.precio = precio;
	}

	public void aumentarPrecio(Double cuanto) {
		this.precio += cuanto;
	}
	
	public Boolean esPrecioCuidado() {
		return this.esPrecioCuidado;
		
	}
}
