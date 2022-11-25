package uebung9.vza.ch.zhaw.seemaala;

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
		Insasse i = insassen.get(id);
		return i;

	}
	public boolean hasInsasse(String id) {
		if(insassen.containsKey(id));{
			return true;
		}
		 //return false;
	}
	public void printInsassen() {
		for(Insasse i : insassen.values()) {
			System.out.println(i.getName()+" ,"+i.getPosition()+i.getClass());
	}
	}
	public void printInsassenWithId() {
		for(Insasse i : insassen.values()) {
			System.out.println(": "+i.getName()+" ,"+i.getPosition()+i.getClass());
		}
	}






}
