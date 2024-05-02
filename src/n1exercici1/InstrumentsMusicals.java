package n1exercici1;

public abstract class InstrumentsMusicals {
	// Atributs
	private String nom;
	private double preu;
	
	// Constructor
	public InstrumentsMusicals(String nom, double preu) {
		this.nom = nom;
		this.preu = preu;
		System.out.println("Classe carregada des del constructor de la superclasse: " + this.getClass());
	}
	
	static {
		System.out.println("Classe carregada des d'un bloc d'inicialització estàtic de la superclasse: " + InstrumentsMusicals.class);
	}
	
	// Getters & Setters
	public String getNom() {
		return this.nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public double getPreu() {
		return this.preu;
	}

	public void setPreu(double preu) {
		this.preu = preu;
	}
	
	// Mètodes
	
	public String toString() {
		return "Instrument: " + this.nom + ". Preu: " + this.preu;
	}
	
	
	public abstract void tocar();
	
}
