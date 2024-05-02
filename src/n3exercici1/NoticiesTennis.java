package n3exercici1;

public class NoticiesTennis extends Noticies {
	private String competicio;
	private String tennista;

	// Constructor
	public NoticiesTennis(String titular, Redactor redactor, String competicio, String tennista) {
		super(titular, redactor);
		this.competicio = competicio;
		this.tennista = tennista;
	}
	
	// Getters & Setters
	public String getCompeticio() {
		return this.competicio;
	}

	public void setCompeticio(String competicio) {
		this.competicio = competicio;
	}

	public String getTennista() {
		return this.tennista;
	}

	public void setTennista(String tennista) {
		this.tennista = tennista;
	}
	
	// Mètodes
	public int calcularPreuNoticia() {
		int preuNoticia = 150;
		preuNoticia += (this.tennista.equalsIgnoreCase("Federer") || this.tennista.equalsIgnoreCase("Nadal")
				|| this.tennista.equalsIgnoreCase("Djokovic")) ? 100 : 0;

		return preuNoticia;
	}
	
	public int calcularPuntsNoticia() {
		int puntsNoticia = 4;
		puntsNoticia += (this.tennista.equalsIgnoreCase("Federer") || this.tennista.equalsIgnoreCase("Nadal")
				|| this.tennista.equalsIgnoreCase("Djokovic")) ? 3 : 0;

		return puntsNoticia;
	}

}
