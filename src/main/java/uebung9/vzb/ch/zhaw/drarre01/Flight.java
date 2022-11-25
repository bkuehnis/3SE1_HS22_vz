package uebung9.vzb.ch.zhaw.drarre01;

import java.util.HashMap;

public class Flight {
	private String flightNumber;
	private HashMap<String,Insasse> insassen = new HashMap<String,Insasse>();

	public Flight(String flightNumber) { 
		
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
		if(insassen.containsKey(id)) {
			return true;
		}
		return false;
		}
	
	public void printInsassen() {
		for (Insasse i: insassen.values()) {
			i.print();
		}
	}
	public void printInsassenWithId() {
		for(String s: insassen.keySet()) {
			System.out.print(s + ": ");
			getInsasse(s).print();
			
			
			
		}
		}
	
}
	

