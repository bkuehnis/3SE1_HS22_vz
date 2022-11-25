package uebung9.vza.ch.zhaw.reichraf;

import java.awt.print.Printable;
import java.util.HashMap;

public class Flight {
	private String flightNumber;
	private HashMap<String,Insasse> insassen = new HashMap<String,Insasse>();

	public Flight(String flightNumber) { 
		this.flightNumber= flightNumber;
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
		if (insassen.containsKey(id)) {
			return true;
		}else {		
			return false;
		}
	}
	
	public void printInsassen() {
		for(String x: insassen.keySet()) {
				getInsasse(x).print();
			}
		}
	
	
	public void printInsassenWithId() {
		for (String x: insassen.keySet()) {
			System.out.print(x + ": ");				
			getInsasse(x).print();
		}
	}
}

// TODO: ergaenzen


