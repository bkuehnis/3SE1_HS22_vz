package uebung9.vza.ch.zhaw.campbjam;

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
		if (insassen.containsKey(id)) {
			Insasse insasse = insassen.get(id);
			return insasse;
		}
		return null;
	}

	public boolean hasInsasse(String id) {
		if (insassen.containsKey(id)) {
			return true;
		}
		return false;
	}

	public void printInsassen() {
		for (Insasse i : insassen.values()) {
			i.print();
		}
	}

	public void printInsassenWithId() {
		for (String k : insassen.keySet()) {
			System.out.print(k + ": ");
			insassen.get(k).print();
		}
	}
}
