package uebung9.vzb.ch.zhaw.toddara1;

import java.util.HashMap;

public class Flight {
	private String flightNumber;
	private HashMap<String,Insasse> insassen = new HashMap<String,Insasse>();

	public Flight(String flightNumber) { 
		this.flightNumber = flightNumber;
	}
	
	// TODO: ergaenzen
	public String getFlightNumber() {
		return flightNumber;
	}
	
	public void addInsasse(String id, Insasse insasse) {
		insassen.put(id, insasse);
	}
	
	public Insasse getInsasse(String id) {
		return insassen.get(id); //Hashmaps nutzen wenn key nie mehrmals vorkommt
	}
	
	public boolean hasInsasse(String id) {
		/*if (insassen.get(id) == null) {
			return false;
		} else {
			return true;
		}*/
		return insassen.get(id) != null; //condition als Rückgabewert
	}
	
	public void printInsassen() {
//		//for (String id: insassen.keySet()) {
//			System.out.println(id + ", " + insassen);
//		}
		for (Insasse insasse: insassen.values()) {
			insasse.print();
		}
	}
	
	public void printInsassenWithId() {
		for (String id: insassen.keySet()) {
			System.out.print(id + ": ");
			Insasse insasse = insassen.get(id);
			insasse.print();
			//insassen.get(id).print();
		}
	}
	
	public void printCrew() {
		for (Insasse insasse: insassen.values()) {
			if (insasse instanceof Crew) {
				insasse.print();
			}
		}
	}
	
	public void printFirstClass() {
		for (Insasse insasse: insassen.values()) {
			if (insasse instanceof Passenger) {
				Passenger passenger = (Passenger) insasse;
				if(passenger.isFirstClass()) {
					System.out.println(passenger.getName());
				}
			}
		}
	}
}
