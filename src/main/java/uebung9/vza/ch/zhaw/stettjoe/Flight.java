package uebung9.vza.ch.zhaw.stettjoe;

import java.util.HashMap;

public class Flight {
	private String flightNumber;
	private HashMap<String,Insasse> insassen = new HashMap<String,Insasse>();

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
		for (String i: insassen.keySet()) {
			if (i.equals(id)) {
				return true;
			}
		}
		return false;
	}
	
	public void printInsassen() {
		for (Insasse i: insassen.values()) {
			i.print();
		}
	}
	
	public void printInsassenWithId() {
		for (String i: insassen.keySet()) {
			Insasse j = insassen.get(i);
			System.out.print(i+": ");
			j.print();
		}
	}
	
	
	// TODO: ergaenzen

}
