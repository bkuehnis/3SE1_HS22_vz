package uebung9.vzb.ch.zhaw.strubili;

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
	public void addInsasse (String id, Insasse insasse) {
		insassen.put(id, insasse);
	}
	public Insasse getInsasse (String id) {
			if (insassen.containsKey(id)) {
				return insassen.get(id);
			}
		return null;
	}
	public boolean hasInsasse (String id) {
		if (insassen.containsKey(id)) {
			return true;
		}
		return false;
	}
	public void printInsassen() {
		for (Insasse I: insassen.values()) {
			I.print();
		}
	}
	public void printInsassenWithId() {
		for (Map.Entry<String, Insasse>entry: insassen.entrySet()) {
			System.out.print(entry.getKey()+": ");
			entry.getValue().print();
		}
	}
}
