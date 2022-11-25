package uebung9.vza.ch.zhaw.friesti1;

import java.util.HashMap;

public class Flight {
	private String flightNumber;
	private HashMap<String,Insasse> insassen = new HashMap<String,Insasse>();

	public Flight(String fN) { 
		this.flightNumber = fN;
	}
	
	// TODO: ergaenzen
	public String getFlightNumber() {
		return this.flightNumber;
	}
	
	public void addInsasse(String id, Insasse i) {
		this.insassen.put(id, i);
	}
	
	public Insasse getInsasse(String id) {
		if(this.insassen.containsKey(id)) {
			return this.insassen.get(id);
		}
		return null;
	}
	
	public boolean hasInsasse(String id) {
		if(this.insassen.containsKey(id)) {
			return true;
		}
		return false;
	}
	
	public void printInsassen() {
		this.insassen.forEach((key, value) -> {
		      value.print();
		    });
	}
	
	public void printInsassenWithId() {
		this.insassen.forEach((key, value) -> {
		    System.out.print(key + ": ");  
			value.print();
		    });
	}
}
