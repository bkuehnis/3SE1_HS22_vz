package uebung9.vza.ch.zhaw.ahmaddav;

import java.util.HashMap;

public class Flight {

	private String id;

	private String flightNumber;
	private HashMap<String, Insasse> insassen = new HashMap<String, Insasse>();

	public Flight(String flightNumber) {
		this.flightNumber = flightNumber;
	}

	public String getFlightNumber() {
		return flightNumber;
	}

	public void addInsasse(String id, Insasse xy) {
		insassen.put(id, xy);
	}

	public Insasse getInsasse(String id) {
		return insassen.get(id);
	}

	public boolean hasInsasse(String id) {
		if (insassen.containsKey(id)) {
			return true;
		} else {
			return false;
		}

	}

	public void printInsassen() {
		for (Insasse xy : insassen.values()) {
			xy.print();
		}
	}

	public void printInsassenWithId() {
		for (String id : insassen.keySet()) {
			System.out.print(id + "; ");
			insassen.get(id).print();

		}
	}
}
