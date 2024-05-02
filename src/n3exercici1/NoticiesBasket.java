package n3exercici1;

public class NoticiesBasket extends Noticies {
	private String competicio;
	private String club;

	// Constructor
	public NoticiesBasket(String titular, Redactor redactor, String competicio, String club) {
		super(titular, redactor);
		this.competicio = competicio;
		this.club = club;
	}
	
	// Getters & Setters
	public String getCompeticio() {
		return this.competicio;
	}

	public void setCompeticio(String competicio) {
		this.competicio = competicio;
	}

	public String getClub() {
		return this.club;
	}

	public void setClub(String club) {
		this.club = club;
	}

	// Mètodes
	public int calcularPreuNoticia() {
		int preuNoticia = 250;
		preuNoticia += (this.competicio.equalsIgnoreCase("Eurolliga")) ? 75 : 0;
		preuNoticia += (this.club.equalsIgnoreCase("Barça") || this.club.equalsIgnoreCase("Madrid")) ? 75 : 0;

		return preuNoticia;
	}
	
	public int calcularPuntsNoticia() {
		int puntsNoticia = 4;
		puntsNoticia += (this.competicio.equalsIgnoreCase("Eurolliga")) ? 3 : 0;
		puntsNoticia += (this.competicio.equalsIgnoreCase("ACB")) ? 2 : 0;
		puntsNoticia += (this.club.equalsIgnoreCase("Barça") || this.club.equalsIgnoreCase("Madrid")) ? 1 : 0;

		return puntsNoticia;
	}

}
