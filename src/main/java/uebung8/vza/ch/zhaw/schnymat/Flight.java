package uebung8.vza.ch.zhaw.schnymat;

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

	public void addInsasse(String id, Insasse insasse){
		insassen.put(id, insasse);
	}

	public Insasse getInsasse(String id){
		if (insassen.get(id) != null) {
			return insassen.get(id);
		} else {
			return null;
		}

	}

	public boolean hasInsasse(String id){
		if (insassen.get(id) != null) {
			return true;
		} else {
			return false;
		}
	}

	public void printInsassen(){
		for (Insasse insasse : insassen.values()) {
			insasse.print();
		}
	}

	public void printInsassenWithId(){
		for (String insasseKey : insassen.keySet()) {
			if (insassen.get(insasseKey) instanceof Passenger) {
				if (((Passenger)insassen.get(insasseKey)).isFirstClass()) {
					System.out.println(insasseKey + ": " + insassen.get(insasseKey).getName() + ", First Class");
				} else {
					System.out.println(insasseKey + ": " + insassen.get(insasseKey).getName() + ", Economy	");
				}
			} else {
				System.out.println(insasseKey + ": " + insassen.get(insasseKey).getName() + ", " + ((Crew)insassen.get(insasseKey)).getPosition());
			}
		}
	}

	public void printCrew(){
		for (Insasse insasse : insassen.values()) {
			if (insasse instanceof Crew) {
				System.out.println(insasse.getName() + ", " + ((Crew) insasse).getPosition());
			}
		}
	}

	public void printFirstClass(){
		for (Insasse insasse : insassen.values()) {
			if (insasse instanceof Passenger) {
				if (((Passenger) insasse).isFirstClass()) System.out.println(insasse.getName());
			}
		}
	}
}
