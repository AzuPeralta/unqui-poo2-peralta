package mercado_central;

public class Producto implements Registrable{
	
	protected double precio;
	protected int stock;
	
	public Producto(double precio){
		this.precio = precio;
		this.stock = 1;
		//Si creo un producto, y no especifico cuántos de eso creo (stock), se crea en 1
	}
	
	public Producto(double precio, int stock) {
		this.precio = precio;
		this.stock = stock;
	}
	
	public void registrar() {
		this.decrementarStock();
	}
	
	public double montoAPagar() {
		return getPrecio();
		
	}

	public double getPrecio() {
		return precio;
	}
	
	public int getStock() {
		return this.stock;
	}
	
	public void decrementarStock() {
		if (stock == 0) {
			throw new IllegalArgumentException("No hay stock de este producto");
		}
		stock -= 1;
	}
	
	public void incrementarStock() {
		stock += 1;
	}
}

