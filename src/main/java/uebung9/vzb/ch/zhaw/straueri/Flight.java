package uebung9.vzb.ch.zhaw.straueri;

import java.util.HashMap;

public class Flight {
	private String flightNumber;
	private HashMap<String,Insasse> insassen = new HashMap<String,Insasse>();

	public Flight(String flightNumber) { 
		this.flightNumber = flightNumber;
	}
	// TODO: ergaenzen
	public String getFlightNumber(){
		return flightNumber;
	}
	
	public void addInsasse(String id, Insasse insasse) {
		insassen.put(id,insasse);
		
	}
	
	public Insasse getInsasse(String id) {
		return insassen.get(id);
	}
	
	public boolean hasInsasse(String id) {
		return insassen.containsKey(id);
	}
	
	public void printInsassen() {
		for (Insasse o: insassen.values()) {
			o.print();
		}
	}
		
	public void printInsassenWithId() {
		for (String s: insassen.keySet()) {
			System.out.print(s+": ");
			insassen.get(s).print();
		}
	}
}
