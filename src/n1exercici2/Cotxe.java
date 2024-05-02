package n1exercici2;

public class Cotxe {
	// Atributs
	private static final String MARCA = "Ford"; // Només es pot inicialitzar una vegada (final) i com a static, a nivell
												// de classe, no d'instància, per tant només hi pot haver una marca
	private static String model; // S'inicialitza només una vegada per totes les instàncies de la classe (static)
	private final int POTENCIA; // S'inicialitza només una vegada (final) per instància de classe

	// Constructors
	public Cotxe(String model, int POTENCIA) {
		Cotxe.model = model; // L'atribut model, s'ha d'instanciar des de la classe només una vegada (és static)
		this.POTENCIA = POTENCIA; // L'atribut POTENCIA s'instancia en cada objecte creat
	}

	// Getters & Setters
	public static String getModel() {
		return model;
	}

	public static void setModel(String model) {
		Cotxe.model = model;
	}

	public static String getMarca() {
		return MARCA;
	}

	public int getPOTENCIA() {
		return this.POTENCIA;
	}

	// Mètodes
	public static void frenar() {
		System.out.println("El vehicle està frenant");
	}

	public void accelerar() {
		System.out.println("El vehicle està accelerant");
	}

	@Override
	public String toString() {
		return "Cotxe [Marca = " + MARCA + "\n" + "Model = " + model + "\n" + "Potència = " + POTENCIA + "]";
	}

}
