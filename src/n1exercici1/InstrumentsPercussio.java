package n1exercici1;

public class InstrumentsPercussio extends InstrumentsMusicals{
	public InstrumentsPercussio(String nom, double preu) {
		super(nom, preu);
		System.out.println("Classe carregada des del constructor de la subclasse: " + this.getClass());
	}
	
	// Mètodes
	@Override
	public void tocar() {
		System.out.println("Està sonant un instrument de percussió");
	}
}
