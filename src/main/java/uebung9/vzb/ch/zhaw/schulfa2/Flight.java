package uebung9.vzb.ch.zhaw.schulfa2;

import java.util.HashMap;

public class Flight {
	private String flightNumber;
	private HashMap<String, Insasse> insassen = new HashMap<String, Insasse>();

	public Flight(String flightNumber) {
		this.flightNumber = flightNumber;
	}

	public String getFlightNumber() {
		return this.flightNumber;
	}

	public void addInsasse(String id, Insasse insasse) {
		insassen.put(id, insasse);
	}

	public Insasse getInsasse(String id) {
		return insassen.get(id);
	}

	public boolean hasInsasse(String id) {
		return insassen.containsKey(id);
	}

	public void printInsassen() {
		for (Insasse i : insassen.values()) {
			i.print();
		}
	}

	public void printInsassenWithId() {
		for (String id : insassen.keySet()) {
			System.out.print(id + ": ");
			insassen.get(id).print();
		}
	}

	public void printCrew() {
		for (Insasse i : insassen.values()) {
			if (i instanceof Crew) {
				i.print();
			}
		}
	}

	public void printFirstClass() {
		for (Insasse i : insassen.values()) {
			if (i instanceof Passenger) {
				if (((Passenger) i).isFirstClass()) {
                   System.out.println(i.getName());
				}
			}
		}
	}

}
