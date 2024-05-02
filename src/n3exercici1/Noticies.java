package n3exercici1;

public abstract class Noticies {
	private String titular;
	private String text;
	private float preu;
	private int puntuacio;
	private Redactor redactor;

	// Constructor
	public Noticies(String titular, Redactor redactor) {
		this.titular = titular;
		this.redactor = redactor;
	}

	// Getters & Setters

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public int getPuntuacio() {
		return puntuacio;
	}

	public void setPuntuacio(int puntuacio) {
		this.puntuacio = puntuacio;
	}

	public float getPreu() {
		return preu;
	}

	public void setPreu(float preu) {
		this.preu = preu;
	}

	@Override
	public String toString() {
		return "\nNotícia[titular:" + titular + ", text:" + text + ", preu:" + preu + ", puntuacio:" + puntuacio + "]";
	}

	public abstract int calcularPreuNoticia();

	public abstract int calcularPuntsNoticia();

}
