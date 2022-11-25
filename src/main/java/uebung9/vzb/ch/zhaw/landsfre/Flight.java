package uebung9.vzb.ch.zhaw.landsfre;

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
		for(String s: insassen.keySet()) {
			if(insassen.containsKey(id)) {
				return insassen.get(id);
			}
		}
		return null;
	}
	
	public boolean hasInsasse(String id) {
		for (Insasse i: insassen.values()) {
			if(insassen.containsKey(id)) {
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
		for (String s: insassen.keySet()) {
			Insasse a = insassen.get(s);
			System.out.print(s+": ");
			a.print();
			
		}
	}
	
	public void printCrew() {
		for (Insasse i: insassen.values()) {
			if (i instanceof Crew) {
				i.print();
			}
		}
	}

}
