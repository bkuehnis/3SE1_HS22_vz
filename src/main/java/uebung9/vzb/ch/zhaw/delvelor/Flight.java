package uebung9.vzb.ch.zhaw.delvelor;

import java.util.HashMap;

public class Flight {
	private String flightNumber;
	private HashMap<String, Insasse> insassen = new HashMap<String, Insasse>();

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
		if (insassen.containsKey(id) == true) {
			return insassen.get(id);
		} else {
			return null;

		}

	}

	public boolean hasInsasse(String id) {
		if (insassen.containsKey(id) == true) {
			return insassen.get(id) != null;
		} else {
			return false;
		}
	}

	public void printInsassen() {
		for (Insasse s : insassen.values()) {
			if (s instanceof Crew) {
				s.print();
			} else if (s instanceof Passenger) {
				s.print();
			}
		}

	}

	public void printInsassenWithId() {
		for (String k : insassen.keySet()) {
			if (insassen.get(k) instanceof Crew) {
				System.out.println(k + ": ");
			} else if (insassen.get(k) instanceof Passenger) {
				System.out.println(k + ": ");
			} 
			
			// Den Namen und die Position kann ich nicht programmieren!


		}
	}

}
