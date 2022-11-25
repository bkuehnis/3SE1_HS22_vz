package uebung9.vza.ch.zhaw.vuchl001;

import java.util.HashMap;

public class Flight {
	private String flightNumber;
	private HashMap<String, Insasse> insassen = new HashMap<String, Insasse>();

	public Flight(String flightNumber) {
		this.flightNumber = flightNumber;
	}

	// TODO: ergaenzen
	public String getFlightNumber() {
		return flightNumber;
	}

	public void addInsasse(String id, Insasse insasse) {
		insassen.put(id, insasse);
	}

	public Insasse getInsasse(String id) {
		if (insassen.get(id) != null) {
			return insassen.get(id);
		} else {
			return null;
		}
	}

	public boolean hasInsasse(String id) {
		if (insassen.get(id) != null) {
			return true;
		} else {
			return false;
		}
	}

	public void printInsassen() {
		for (Insasse s : insassen.values()) {
			s.print();
		}
	}

	void printInsassenWithId() {
		for (String s : insassen.keySet()) {
			System.out.println(s + ": ");
		}

	}

}
