package uebung9.vzb.ch.zhaw.rechsfil;

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
		if(insassen.containsKey(id)) {
			Insasse a= insassen.get(id);
			return a;
		}
		return null;
	}

	public boolean hasInsasse(String id) {
		if(insassen.containsKey(id)) {
			return true;
		}
		return false;
	}
	
	public void printInsassen() {
		for(Insasse x: insassen.values()) {
			x.print();
		}
	}
	
	
	public void printInsassenWithId() {
		for(String i: insassen.keySet()) {
			System.out.print(i+ ": ");
			insassen.get(i).print();
		}
		

	}
	
	
}
