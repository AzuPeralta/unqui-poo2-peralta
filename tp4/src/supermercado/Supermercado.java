package supermercado;

import java.util.ArrayList;
import java.util.List;

public class Supermercado {
	
	public String nombre;
	public String direccion;
	public List<Producto> productos;
	
	
	Supermercado(String nombre, String direccion){
		this.nombre = nombre;
		this.direccion = direccion;
		this.productos = new ArrayList<Producto>(); 
		
	}
	
	public int getCantidadDeProductos() {
		return productos.size();
	}
	
	
	public void agregarProducto(Producto producto){
		productos.add(producto);
	}
	
	public Double getPrecioTotal(){
		return productos.stream().mapToDouble(p -> p.precio)
								 .sum();
		
	}
}



