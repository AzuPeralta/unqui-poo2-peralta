package supermercado;

public class ProductoPrimeraNecesidad extends Producto {
	
	public Double porcentajeDeDesc;

	ProductoPrimeraNecesidad(String nombre, Double precio, Boolean precioCuidado, Double descuento) {
		super(nombre, precio, precioCuidado);
		this.porcentajeDeDesc = descuento;
		
	}

	
	@Override 
	public Double getPrecio() {
		return precio * (1-porcentajeDeDesc/100);
//		return 0.0;
	}
	
	
	
}

