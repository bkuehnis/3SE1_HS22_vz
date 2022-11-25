package uebung9.vza.ch.zhaw.kamaldil;

import java.util.HashMap;

public class Flight {
	private String flightNumber;
	private HashMap<String,Insasse> insassen = new HashMap<String,Insasse>();

	public Flight(String flightNumber) { 
		this.flightNumber = flightNumber;
	}

	public String getFlightNumber() {
		return this.flightNumber;
	}
	public void addInsasse(String id, Insasse insasse) {
		insassen.put(id, insasse);
	}

	public Insasse getInsasse(String id) {
		if (insassen.containsKey(id)) {
			return insassen.get(id);
		}return null;
	}

	public boolean hasInsasse (String id) {
		if (insassen.containsKey(id) == true) {
			return true;
		}return false;
	}

	public void printInsassen() {
		for (Insasse i: insassen.values()) {
			i.print();
		}
	}

	String zWert = "";
	Insasse zWert2;
	public void printInsassenWithId() {
		for ( String k : insassen.keySet()) { 
			zWert = k;
		}
		for (Insasse i: insassen.values()) {
			zWert2 = i;
			System.out.print(zWert +": ");
			zWert2.print();
		}
	}

}