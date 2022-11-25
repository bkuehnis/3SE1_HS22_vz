package uebung9.vza.ch.zhaw.bauerfel;

import java.util.HashMap;

public class Flight {
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
			return i;
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
			i.print();
		}
	}

	public void printInsassenWithId() {
		for (String i : insassen.keySet()) {
			System.out.print(i + ": ");

		}
	}
}
