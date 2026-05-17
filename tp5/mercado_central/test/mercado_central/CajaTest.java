package mercado_central;

import static org.junit.jupiter.api.Assertions.*;

//import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CajaTest {
	
	protected Caja caja = new Caja();
	protected Producto leche = new Producto(1965.0, 3); 
	protected Producto manteca = new Producto(2800.5);
	protected ProductoCooperativa fideos = new ProductoCooperativa(1000.8, 10);
	protected ProductoCooperativa arroz = new ProductoCooperativa(1790.0, 5 ,10);
	
	
//	@BeforeEach
//	public void setUp() {
//		caja.addProducto(arroz);
//		caja.addProducto(leche);
//		caja.addProducto(fideos);
//		caja.addProducto(manteca);
//	}
//	
	@Test
	void testMontoTotal() {
		assertEquals(caja.montoTotal(), 7277.22);
	}

}
