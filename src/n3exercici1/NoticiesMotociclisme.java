package n3exercici1;

public class NoticiesMotociclisme extends Noticies {
	private String equip;

	// Constructor
	public NoticiesMotociclisme(String titular, Redactor redactor, String equip) {
		super(titular, redactor);
		this.equip = equip;
	}

	// Getters & Setters
	public String getEquip() {
		return equip;
	}

	public void setEquip(String equip) {
		this.equip = equip;
	}


	// Mètodes
	public int calcularPreuNoticia() {
		int preuNoticia = 100;
		preuNoticia += (this.equip.equalsIgnoreCase("Ferrari") || this.equip.equalsIgnoreCase("Mercedes")) ? 50
				: 0;

		return preuNoticia;
	}

	public int calcularPuntsNoticia() {
		int puntsNoticia = 3;
		puntsNoticia += (this.equip.equalsIgnoreCase("Honda") || this.equip.equalsIgnoreCase("Yamaha")) ? 3
				: 0;

		return puntsNoticia;
	}
	
}
