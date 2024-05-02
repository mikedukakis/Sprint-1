package n1exercici2;

public class GestorCotxe {

	public static void main(String[] args) {
		Cotxe Ford1 = new Cotxe("Focus", 1500); // La instanciació de l'atribut model és per tota la classe
		Cotxe Ford2 = new Cotxe("Cupra", 1200); // La nova instanciació de l'atribut model SOBREESRCRIU per tota la classe
		System.out.println(Ford1);
		System.out.println(Ford2);

		Ford1.accelerar(); // S'accedeix al mètode no static des d'una instància de la classe
		// Cotxe.accelerar(); // Des de la classe no es pot accedir al mètode si no és static, COMPILE TIME ERROR
		Cotxe.frenar(); // S'accedeix al mètode static des de la classe
		Ford2.frenar(); // També es pot accedir des d'una instància de la classe, però no és bona pràctica
	}

}
