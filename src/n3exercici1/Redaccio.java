package n3exercici1;

import java.util.ArrayList;
import java.util.Scanner;

public class Redaccio {

	static ArrayList<Redactor> redactors = new ArrayList<>();
	static Scanner entradaTeclat = new Scanner(System.in);

	public static void main(String[] args) {
		String menu = "------ MENU ------\n" + "1.- Introduir redactor\n" + "2.- Eliminar redactor\n"
				+ "3.- Introduir notícia a un redactor\n" + "4.- Eliminar notícia\n"
				+ "5.- Mostrar totes les notícies per redactor\n" + "6.- Calcular puntuació de la notícia\n"
				+ "7.- Calcular preu-notícia\n" + "8.- Sortir";
		int opcio = 0;
		String name = "";
		String DNI = "";
		String resposta = "";
		int esport = 0;
		String titular = "";

		/*
		// Entrades per testing
		Redactor red1 = new Redactor("Jane Doe", "12345678A");
		Redactor red2 = new Redactor("John Doe", "98765432A");
		redactors.add(red1);
		redactors.add(red2);
		
		NoticiesFutbol notFutbol = new NoticiesFutbol("titular", red1, "Lliga de Campions", "Barça", "Messi");
		NoticiesFutbol notFutbol2 = new NoticiesFutbol("titular", red2, "Lliga", "Madrid", "Benzema");
		NoticiesBasket notBasket1 = new NoticiesBasket("titular1", red1, "Eurolliga", "Barça");
		NoticiesTennis notTennis1 = new NoticiesTennis("titular1", red2, "Roland Garros", "Nadal");
		NoticiesF1 notF1 = new NoticiesF1("titular2", red1, "Ferrari");
		NoticiesMotociclisme notMot1 = new NoticiesMotociclisme("titular2", red2, "Yamaha");

		red1.getNoticies().add(notFutbol);
		red1.getNoticies().add(notBasket1);
		red1.getNoticies().add(notF1);
		red2.getNoticies().add(notFutbol2);
		red2.getNoticies().add(notTennis1);
		red2.getNoticies().add(notMot1);
		*/

		do {
			System.out.println(menu);
			opcio = entradaTeclat.nextInt();
			entradaTeclat.nextLine();
			switch (opcio) {
			case 1:
				System.out.println("Introdueix el nom del redactor");
				name = entradaTeclat.nextLine();
				System.out.println("Introdueix el DNI");
				DNI = entradaTeclat.nextLine();
				resposta = introduirRedactor(name, DNI);
				break;
			case 2:
				System.out.println("Introdueix el DNI");
				DNI = entradaTeclat.nextLine();
				resposta = eliminarRedactor(DNI);
				break;
			case 3:
				System.out.println("Indica el DNI del redactor a qui vols assignar la notícia: ");
				DNI = entradaTeclat.nextLine();
				if (!dniTrobat(DNI)) {
					resposta = "El DNI no s'ha trobat al sistema";
				} else {
					System.out.println(
							"De quin esport és la notícia: [1. Futbol, 2. Bàsquet, 3. Tennis, 4. Fòrmula 1, 5. Motociclisme");
					esport = entradaTeclat.nextInt();
					entradaTeclat.nextLine();
					System.out.println("Titular de la notícia: ");
					titular = entradaTeclat.nextLine();
					switch (esport) {
					case 1:
						resposta = assignarNoticiaFutbol(DNI, titular);
						break;
					case 2:
						resposta = assignarNoticiaBasquet(DNI, titular);
						break;
					case 3:
						resposta = assignarNoticiaTennis(DNI, titular);
						break;
					case 4:
						resposta = assignarNoticiaFormula1(DNI, titular);
						break;
					case 5:
						resposta = assignarNoticiaMotociclisme(DNI, titular);
					}
				}
				break;
			case 4:
				System.out.println("Indica el DNI del redactor de qui vols eliminar una notícia: ");
				DNI = entradaTeclat.nextLine();
				System.out.println("Titular de la notícia: ");
				titular = entradaTeclat.nextLine();
				if (!dniTrobat(DNI)) {
					System.out.println("El DNI no s'ha trobat al sistema");
				} else {
					resposta = eliminarNoticia(DNI, titular);
				}
				break;
			case 5:
				System.out.println("Indica el DNI del redactor de qui vols veure les notícia: ");
				DNI = entradaTeclat.nextLine();
				if (!dniTrobat(DNI)) {
					System.out.println("El DNI no s'ha trobat al sistema");
				} else {
					resposta = veureNoticiesRedactor(DNI);
				}
				break;
			case 6:
				System.out.println("Indica el DNI del redactor de la notícia: ");
				DNI = entradaTeclat.nextLine();
				System.out.println("Titular de la notícia: ");
				titular = entradaTeclat.nextLine();
				if (!dniTrobat(DNI)) {
					System.out.println("El DNI no s'ha trobat al sistema");
				} else {
					resposta = puntuacioNoticia(DNI, titular);
				}
				break;
			case 7:
				System.out.println("Indica el DNI del redactor de la notícia: ");
				DNI = entradaTeclat.nextLine();
				System.out.println("Titular de la notícia: ");
				titular = entradaTeclat.nextLine();
				if (!dniTrobat(DNI)) {
					System.out.println("El DNI no s'ha trobat al sistema");
				} else {
					resposta = preuNoticia(DNI, titular);
				}
				break;
			case 8:
				resposta = "Gràcies per fer servir l'aplicació\n";
			}
			System.out.println(resposta);
		} while (opcio != 8);
	}

	public static String introduirRedactor(String name, String DNI) {
		String missatge = "";
		if (dniTrobat(DNI)) {
			missatge = "El DNI ja existeix\n";
			mostrarRedactors();
		} else {
			Redactor redactor = new Redactor(name, DNI);
			redactors.add(redactor);
			missatge = "\nRedactor afegit amb èxit\n";
			mostrarRedactors();
		}
		return missatge;
	}

	public static String eliminarRedactor(String DNI) {
		String missatge = "";
		if (!dniTrobat(DNI)) {
			missatge = "\nEl DNI no existeix\n";
		} else {
			redactors.remove(buscaRedactor(DNI));
			missatge = "\nRedactor eliminat amb èxit\n";
		}
		return missatge;
	}

	public static String assignarNoticiaFutbol(String DNI, String titular) {
		String missatge = "";
		String competicio = "";
		String club = "";
		String jugador = "";

		System.out.println("Competició: ");
		competicio = entradaTeclat.nextLine();
		System.out.println("Club: ");
		club = entradaTeclat.nextLine();
		System.out.println("Jugador: ");
		jugador = entradaTeclat.nextLine();
		Redactor redactor = buscaRedactor(DNI);

		NoticiesFutbol noticiaFut = new NoticiesFutbol(titular, redactor, competicio, club, jugador);
		redactor.getNoticies().add(noticiaFut);

		return missatge;
	}

	public static String assignarNoticiaBasquet(String DNI, String titular) {
		String missatge = "";
		String competicio = "";
		String club = "";

		System.out.println("Competició: ");
		competicio = entradaTeclat.nextLine();
		System.out.println("Club: ");
		club = entradaTeclat.nextLine();
		Redactor redactor = buscaRedactor(DNI);

		NoticiesBasket noticiaBasket = new NoticiesBasket(titular, redactor, competicio, club);
		redactor.getNoticies().add(noticiaBasket);

		return missatge;
	}

	public static String assignarNoticiaTennis(String DNI, String titular) {
		String missatge = "";
		String competicio = "";
		String tennista = "";

		System.out.println("Competició: ");
		competicio = entradaTeclat.nextLine();
		System.out.println("Tennista: ");
		tennista = entradaTeclat.nextLine();
		Redactor redactor = buscaRedactor(DNI);

		NoticiesTennis NoticiaTennis = new NoticiesTennis(titular, redactor, competicio, tennista);
		redactor.getNoticies().add(NoticiaTennis);

		return missatge;
	}

	public static String assignarNoticiaFormula1(String DNI, String titular) {
		String missatge = "";
		String escuderia = "";

		System.out.println("Escuderia: ");
		escuderia = entradaTeclat.nextLine();
		Redactor redactor = buscaRedactor(DNI);

		NoticiesF1 NoticiaF1 = new NoticiesF1(titular, redactor, escuderia);
		redactor.getNoticies().add(NoticiaF1);

		return missatge;
	}

	public static String assignarNoticiaMotociclisme(String DNI, String titular) {
		String missatge = "";
		String equip = "";

		System.out.println("Equip: ");
		equip = entradaTeclat.nextLine();
		Redactor redactor = buscaRedactor(DNI);

		NoticiesMotociclisme noticiaMotociclisme = new NoticiesMotociclisme(titular, redactor, equip);
		redactor.getNoticies().add(noticiaMotociclisme);

		return missatge;
	}

	public static String eliminarNoticia(String DNI, String titular) {
		String missatge = "El titular no existeix";
		for (int i = 0; i < buscaRedactor(DNI).getNoticies().size(); i++) {
			if (buscaRedactor(DNI).getNoticies().get(i).getTitular().equalsIgnoreCase(titular)) {
				buscaRedactor(DNI).getNoticies().remove(i);
				missatge = "Notícia eliminada amb èxit";
			}
		}

		return missatge;
	}

	public static String veureNoticiesRedactor(String DNI) {
//		String missatge = "";
		return buscaRedactor(DNI).getNoticies().toString();
	}

	public static String puntuacioNoticia(String DNI, String titular) {
		String missatge = "El titular no existeix";
		for (int i = 0; i < buscaRedactor(DNI).getNoticies().size(); i++) {
			if (buscaRedactor(DNI).getNoticies().get(i).getTitular().equalsIgnoreCase(titular)) {
				missatge = "Puntiació notícia: " + buscaRedactor(DNI).getNoticies().get(i).calcularPuntsNoticia();
			}
		}
		return missatge;
	}

	public static String preuNoticia(String DNI, String titular) {
		String missatge = "El titular no existeix";
		for (int i = 0; i < buscaRedactor(DNI).getNoticies().size(); i++) {
			if (buscaRedactor(DNI).getNoticies().get(i).getTitular().equalsIgnoreCase(titular)) {
				missatge = "Preu notícia: " + buscaRedactor(DNI).getNoticies().get(i).calcularPreuNoticia();
			}
		}
		return missatge;
	}

	public static void mostrarRedactors() {
		for (Redactor element : redactors) {
			System.out.println(element.toString());
		}
	}

	public static boolean dniTrobat(String DNI) {
		boolean dniTrobat = false;
		for (int i = 0; i < redactors.size(); i++) {
			if (redactors.get(i).getDNI().equalsIgnoreCase(DNI)) {
				dniTrobat = true;
			}
		}
		return dniTrobat;
	}

	public static Redactor buscaRedactor(String DNI) {
		Redactor redactor = null;
		for (int i = 0; i < redactors.size(); i++) {
			if (redactors.get(i).getDNI().equalsIgnoreCase(DNI)) {
				redactor = redactors.get(i);
			}
		}
		return redactor;
	}

}
