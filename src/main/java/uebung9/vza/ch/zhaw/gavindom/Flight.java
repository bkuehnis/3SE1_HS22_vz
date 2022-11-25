package uebung9.vza.ch.zhaw.gavindom;

import java.util.HashMap;

public class Flight {
	private String flightNumber;
	private boolean hasInsasse;
	
	private HashMap<String,Insasse> insassen = new HashMap<String,Insasse>();
//c
	public Flight(String flightNumber) { 
		this.flightNumber = flightNumber;
	}
	
	public String getFlightNumber() {
		return flightNumber;
	}
	
	public void addInsasse(String id, Insasse insasse) {
		insassen.put(id, insasse);
	}
	
	public Insasse getInsasse (String id) {
	if (insassen.containsKey(id))	{	
		return insassen.get(id);
			} else {
		return null; 
		} 
	}
	
//d	
	public boolean hasInsasse (String id ) {
			if (insassen.containsKey(id)){
			return true;
		} else {
			return false; 
		}
	}
//e	
	public void printInsassen() {
	for (Insasse k : insassen.values())	{
		if (k instanceof Crew) {
		k.print();
		} else {
		k.print();
		}
	}
	}
	
	public void printInsassenWithId() {
	for (String s: insassen.keySet()) {
		System.out.print(s + " ");
		Insasse k = insassen.get(s);
		k.print();
		
	}
	}
}