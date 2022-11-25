package uebung9.vza.ch.zhaw.chiraant;

import java.util.HashMap;

public class Flight {
	private String flightNumber;
	private HashMap<String,Insasse> insassen = new HashMap<String,Insasse>();

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
		return insassen.get(id);
	}
	
	public boolean hasInsasse(String id) {
		if (insassen.containsKey(id)) {
			return true;
		} return false;
	}
	public void printInsassen() {
		for (Insasse i: insassen.values()) {
			i.print();
		}
	}
	public void printInsassenWithId() {
		for (Insasse i: insassen.values()) {
			i.print();
		}
	}
	
}
