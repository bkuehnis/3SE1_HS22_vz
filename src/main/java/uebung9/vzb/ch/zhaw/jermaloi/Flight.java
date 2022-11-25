package uebung9.vzb.ch.zhaw.jermaloi;

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

	public void addInsasse(String id, Insasse insasse){
		insassen.put(id, insasse);
	}

	public Insasse getInsasse(String id){
		return insassen.get(id);
	}

	public boolean hasInsasse(String id){
		return insassen.containsKey(id);
	}

	public void printInsassen(){
		insassen.forEach((k, i) -> i.print());
	}

	public void printInsassenWithId(){
		insassen.forEach((k, i) -> {
			System.out.print(k + ": ");
			i.print();
		});
	}

	public void printCrew(){
		insassen.forEach((k, i) -> {
			if (i instanceof Crew){
				i.print();
			}
		});
	}

	public void printFirstClass(){
		insassen.forEach((k, i) -> {
			if (i instanceof Passenger){
				Passenger p = (Passenger) i;
				if(p.isFirstClass()){
					System.out.println(p.getName());
				}
			}
		});
	}

}
