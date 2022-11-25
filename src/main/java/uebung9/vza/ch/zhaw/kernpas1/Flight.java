package uebung9.vza.ch.zhaw.kernpas1;

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
		insassen.put(id, (insasse));
	}
	
	public Insasse getInsasse(String id) {
		return insassen.get(id);
	}
	
	public boolean hasInsasse(String id) {
		return (insassen.containsKey(id));
	}
	
	public void printInsassen() {
		for (Insasse i: insassen.values()) {
			i.print();
		}
	}
	
	public void printInsassenWithId() {
		for (String a: insassen.keySet()) {
			System.out.print(a+": ");
			insassen.get(a).print();
		}
	}
}

