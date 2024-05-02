package n1exercici1;

public class InstrumentsVent extends InstrumentsMusicals{
	// Constructor
	public InstrumentsVent(String nom, double preu) {
		super(nom, preu);
		System.out.println("Classe carregada des del constructor de la subclasse: " + this.getClass());
	}
	
	static {
		System.out.println("Classe carregada des d'un bloc d'inicialització estàtic de la subclasse: " + InstrumentsVent.class);
	}
	
	// Mètodes
	@Override
	public void tocar() {
		System.out.println("Està sonant un instrument de vent");
	}

}
