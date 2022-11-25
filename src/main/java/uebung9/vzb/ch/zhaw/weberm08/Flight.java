package uebung9.vzb.ch.zhaw.weberm08;

import java.util.HashMap;
import java.util.Map;

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
		try {
			return insassen.get(id);
		} catch (Exception e){
			return null;
		}
	}
	
	public boolean hasInsasse(String id) {
		return insassen.containsKey(id);
	}
	
	public void printInsassen() {
		for (Map.Entry<String, Insasse> i : insassen.entrySet()) {
			insassen.get(i.getKey()).print();
		}
	}
	
	public void printInsassenWithId() {
		for (Map.Entry<String, Insasse> i : insassen.entrySet()) {
			System.out.print(i.getKey() + ": ");
			insassen.get(i.getKey()).print();
		}
	}

}
