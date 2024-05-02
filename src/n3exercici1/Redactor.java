package n3exercici1;

import java.util.ArrayList;

public class Redactor {
	private String name;
	private final String DNI;
	private static int sou;
	private ArrayList<Noticies> noticies;
	
	// Constructor
	public Redactor(String name, String DNI) {
		this.name = name;
		this.DNI = DNI;
		this.noticies = new ArrayList<>();
		sou = 1500;
	}

	// Getters & Setters
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public static int getSou() {
		return sou;
	}

	public static void setSou(int sou) {
		Redactor.sou = sou;
	}

	public ArrayList<Noticies> getNoticies() {
		return this.noticies;
	}

	public void setNoticies(ArrayList<Noticies> noticies) {
		this.noticies = noticies;
	}

	public String getDNI() {
		return DNI;
	}

	@Override
	public String toString() {
		return "Redactor\n"
				+ "Name: " + name + "\n"
				+ "DNI: " + DNI + "\n"
				+ "Notícies: \n" + noticies.toString();
	}
	
}
