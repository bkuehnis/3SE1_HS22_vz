package uebung9.vza.ch.zhaw.weberth6;

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
	
	public void addInsasse(String id, Insasse p) {
		insassen.put(id ,p);
	}
	
	
	public Insasse getInsasse (String id) {
		if (insassen.containsKey(id)) {
			Insasse k = insassen.get(id);
			return k ;
		} else {
			return null;
		}
		
		
	}
	// TODO: ergaenzen
	
	public boolean hasInsasse (String id) {
		if (insassen.containsKey(id)) {
			return true;
		} else {
			return false;
			}
		}
	
	
	public void printInsassen () {
		
	
	}
	
	public void printInsassenWithId() {
		
		//for (String s: insassen.keySet()) {
		//	Insasse p = insassen.get(s);
		//	System.out.println(p.print());
		//}
		}
	}
	
	


