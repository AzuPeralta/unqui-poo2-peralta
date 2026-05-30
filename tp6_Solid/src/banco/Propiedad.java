package banco;

public class Propiedad {
	private double valorFiscal;
	private String descripcion; 
	private String direccion; 
	
	public Propiedad(double valorFiscal, String descripcion, String direccion) {
		this.valorFiscal = valorFiscal;
		this.descripcion = descripcion;
		this.direccion 	 = direccion; 
	}
	

	@Override 
	public String toString() {
		return "Se presentó como garantía a la solicitud la propiedad de valor fiscal " + this.valorFiscal + " que responde a " + this.descripcion + " ubicada en " + this.direccion;
		
	}
	
	public double getValorFiscal() {
		return this.valorFiscal;
	}
}

// De cada propiedad se tiene una
//breve descripción, dirección y valor fiscal.