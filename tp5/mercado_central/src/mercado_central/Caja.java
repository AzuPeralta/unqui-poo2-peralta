package mercado_central;

import java.util.ArrayList;
import java.util.List;

public class Caja {
	
	private List<Registrable> elementos;
	
	
	public Caja() {
		this.elementos = new ArrayList<Registrable>();
	}

	public double montoTotal() {
		return elementos.stream()
				.mapToDouble(e -> e.montoAPagar())
				.sum();
	}
	
	public void addElemento(Registrable elemento) {
		elemento.registrar();
		elementos.add(elemento);
	}

}

