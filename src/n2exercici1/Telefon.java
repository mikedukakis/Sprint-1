package n2exercici1;

public class Telefon {
	// Atributs
	private String marca;
	private String model;
	
	//Constructor	
	public Telefon(String marca, String model) {
		this.marca = marca;
		this.model = model;
	}

	// Mètodes
	public void trucar(String numTelefon) {
		System.out.println("Trucant al número " + numTelefon);
	}
}
