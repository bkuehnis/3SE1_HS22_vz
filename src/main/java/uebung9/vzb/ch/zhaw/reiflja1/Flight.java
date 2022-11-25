package uebung9.vzb.ch.zhaw.reiflja1;

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
			return insassen.get(id);
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
		for (Insasse insasse : insassen.values()) {
			insasse.print();
		}
	}

	public void printInsassenWithId() {
		for (String insassenNummer : insassen.keySet()) {
			System.out.print(insassenNummer+" ");
			getInsasse(insassenNummer).print();
		}
	}
}
