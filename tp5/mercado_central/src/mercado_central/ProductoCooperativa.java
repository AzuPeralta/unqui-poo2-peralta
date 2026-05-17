package mercado_central;

public class ProductoCooperativa extends Producto{
	
	private double porcentajeDescuento;
	
	public ProductoCooperativa(double precio, double porcentajeDescuento){
		super(precio);
		this.porcentajeDescuento = porcentajeDescuento; 
	}
	
	public ProductoCooperativa(double precio, int stock, double porcentajeDescuento){
		super(precio, stock);
		this.porcentajeDescuento = porcentajeDescuento; 
	}
	
	
	@Override 
	public double getPrecio() {
		return this.precio * (1 - porcentajeDescuento / 100);
	}

}
