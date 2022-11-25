package uebung9.vzb.ch.zhaw.giagilea;

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
		if (insassen.containsKey(id)) {
			return insassen.get(id);
		} else {
			return null;
		}
	}
	
	public boolean hasInsasse(String id) {
		if (insassen.containsKey(id)) {
			return true;
		}
		return false;
	}
	
	public void printInsassen() {
		for (Insasse i: insassen.values()) {
			if (i instanceof Crew) {
				i.print();
			} else if (i instanceof Passenger) {
				i.print();
			}
		}
	}
	
	public void printInsassenWithId() {
		for (String i: insassen.keySet()) {
			if (insassen.get(i) instanceof Crew) {
				System.out.print(i+": ");
				insassen.get(i).print();
			} else if (insassen.get(i) instanceof Passenger) {
				System.out.print(i+": ");
				insassen.get(i).print();
			}
		}
	}
	
	public void printCrew() {
		for (Insasse i: insassen.values()) {
			if (i instanceof Crew) {
				i.print();
			}
		}
	}
	
	public void printFirstClass() {
		for (Insasse i: insassen.values()) {
			if (i instanceof Passenger) {
				if (((Passenger) i).isFirstClass() == true) {
					System.out.println(i.getName());
				}
			}
		}
	}

}
