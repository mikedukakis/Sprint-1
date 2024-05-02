package n3exercici1;

public class NoticiesF1 extends Noticies {
	private String escuderia;

	// Constructor
	public NoticiesF1(String titular, Redactor redactor, String escuderia) {
		super(titular, redactor);
		this.escuderia = escuderia;
	}

	// Getters & Setters
	public String getEscuderia() {
		return escuderia;
	}

	public void setEscuderia(String escuderia) {
		this.escuderia = escuderia;
	}
	
	// Mètodes
	public int calcularPreuNoticia() {
		int preuNoticia = 100;
		preuNoticia += (this.escuderia.equalsIgnoreCase("Ferrari") || this.escuderia.equalsIgnoreCase("Mercedes")) ? 50
				: 0;

		return preuNoticia;
	}

	public int calcularPuntsNoticia() {
		int puntsNoticia = 4;
		puntsNoticia += (this.escuderia.equalsIgnoreCase("Ferrari") || this.escuderia.equalsIgnoreCase("Mercedes")) ? 2
				: 0;

		return puntsNoticia;
	}

}
