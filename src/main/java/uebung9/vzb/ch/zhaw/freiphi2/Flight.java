package uebung9.vzb.ch.zhaw.freiphi2;

import java.util.HashMap;

public class Flight {
	private String flightNumber;
	private HashMap<String, Insasse> insassen = new HashMap<String, Insasse>();

	public Flight(String flightNumber) {
		System.out.println(flightNumber);
	}

	public String getFlightNumber() {
		return flightNumber;
	}

	public void addInsasse(String id, Insasse insasse) {
		insassen.put(id, insasse);
	}

	public Insasse getInsasse(String id) {
		return insassen.get(id);
	}

	public boolean hasInsasse(String id) {
		if (insassen.containsKey(id)) {
			return true;

		}
		return false;
	}
	public void printInsassen() {
		for (Insasse i: insassen.values()) {
			System.out.println(i.getName()+", "+i.getClass());
		}
	}
	public void printInsassenWithId() {
		for (Insasse i: insassen.values()) {
			System.out.println(flightNumber+", "+i.getName()+", "+i.getClass());
		}
	}
	// TODO: ergaenzen

}
