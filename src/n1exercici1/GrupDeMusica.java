package n1exercici1;

public class GrupDeMusica {

	public static void main(String[] args) {
		
		InstrumentsVent saxo = new InstrumentsVent("Saxo", 1224.99);
		InstrumentsCorda guitarra = new InstrumentsCorda("Guitarra", 699.99);
		InstrumentsPercussio bombo = new InstrumentsPercussio("Bombo", 449.99);
		
		System.out.println(saxo);
		System.out.println(guitarra);
		System.out.println(bombo);

		saxo.tocar();
		guitarra.tocar();
		bombo.tocar();
		
	}

}
