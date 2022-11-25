package uebung9.vzb.ch.zhaw.martilu5;

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
		insassen.put(id,insasse);
	}

	public Insasse getInsasse(String id) {
		if (insassen.containsKey(id)) {
			return insassen.get(id);
		}else {
			return null;
		}
		
	}
	
	public boolean hasInsasse(String id) {
		if (insassen.containsKey(id)) {
			return true;
		} else {
			return false;
		}
		
	}
	
	public void printInsassen() {
		for (Insasse i: insassen.values()) {
			i.print();
		}
	}
	
	public void printInsassenWithId() {
			for (String s: insassen.keySet()) {
			System.out.print(s+": "); getInsasse(s).print();
		}
	}
	

}
