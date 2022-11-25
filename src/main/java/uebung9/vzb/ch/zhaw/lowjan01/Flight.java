package uebung9.vzb.ch.zhaw.lowjan01;

import java.util.HashMap;

public class Flight {
	private static final Class<? extends Insasse> Crew = null;
	private String flightNumber;
	private HashMap<String, Insasse> insassen = new HashMap<String, Insasse>();

	public Flight(String flightNumber) {

		this.flightNumber = flightNumber;

	}

	public String getFlightNumber() {
		return flightNumber;
	}

	public void addInsasse(String id, Insasse insasse) {
		insassen.put(id, insasse);

	}

	public Insasse getInsasse(String id) {

		Insasse i = insassen.get(id);

		if (i != null) {
			return insassen.get(id);
		} else {
			return null;
		}
	}

	public boolean hasInsasse(String id) {
		Insasse i = insassen.get(id);

		if (i != null) {
			return true;
		} else {
			return false;
		}
	}

	public void printInsassen() {
		for (Insasse i : insassen.values()) {
			if (i.getPostition() != null) {
				System.out.println(i.getName() + ", " + i.getPostition());
			} else if (i.isFirstClass()) {
				System.out.println(i.getName()+", First Class");
			} else {
				System.out.println(i.getName()+", Ecomony");
			}

		}
	}
//// Aufgabe nicht ganz klar
	public void printInsassenWithId() {
		for (String s : insassen.keySet()) {
			for (Insasse i : insassen.values()) {
				System.out.println(s + ": " + i.getName() + ", ");
			}
		}
	}

	public void printFirstClass() {
		for (Insasse i : insassen.values()) {
			if (i.isFirstClass() == true) {
				System.out.println(i.getName());
			}
	}
	}

	public void printCrew() {
		for (Insasse i : insassen.values()) {
			if (i.getPostition() != null) {
				System.out.println(i.getName()+", "+i.getPostition());
			}
	}
		
	}
}
