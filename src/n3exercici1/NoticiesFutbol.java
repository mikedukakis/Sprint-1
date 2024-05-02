package n3exercici1;

public class NoticiesFutbol extends Noticies {
	private String competicio;
	private String club;
	private String jugador;

	// Constructor
	public NoticiesFutbol(String titular, Redactor redactor, String competicio, String club, String jugador) {
		super(titular, redactor);
		this.competicio = competicio;
		this.club = club;
		this.jugador = jugador;
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

	public String getJugador() {
		return this.jugador;
	}

	public void setJugador(String jugador) {
		this.jugador = jugador;
	}
	
	// Mètodes
	public int calcularPreuNoticia() {
		int preuNoticia = 300;
		preuNoticia += (this.competicio.equalsIgnoreCase("Lliga de Campions")) ? 100 : 0;
		preuNoticia += (this.club.equalsIgnoreCase("Barça") || this.club.equalsIgnoreCase("Madrid")) ? 100 : 0;
		preuNoticia += (this.jugador.equalsIgnoreCase("Ferran Torres") || this.jugador.equalsIgnoreCase("Benzema")) ? 50
				: 0;

		return preuNoticia;
	}

	public int calcularPuntsNoticia() {
		int puntsNoticia = 5;
		puntsNoticia += (this.competicio.equalsIgnoreCase("Lliga de Campions")) ? 3 : 0;
		puntsNoticia += (this.competicio.equalsIgnoreCase("Lliga")) ? 2 : 0;
		puntsNoticia += (this.club.equalsIgnoreCase("Barça") || this.club.equalsIgnoreCase("Madrid")) ? 1 : 0;
		puntsNoticia += (this.jugador.equalsIgnoreCase("Ferran Torres") || this.jugador.equalsIgnoreCase("Benzema")) ? 1
				: 0;

		return puntsNoticia;
	}

}
