package uebung9.vzb.ch.zhaw.bosluc01;

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
		return insassen.getOrDefault(id, null);
	}

	public boolean hasInsasse(String id) {
		return insassen.containsKey(id);
	}

	public void printInsassen() {
		insassen.values().forEach(Insasse::print);
	}

	public void printInsassenWithId() {
		insassen.forEach((id, insasse) -> {
			System.out.print(id + ": ");
			insasse.print();
		});
	}

	public void printCrew() {
		insassen.values().stream().filter(insasse -> insasse instanceof Crew).forEach(Insasse::print);
	}

	public void printFirstClass() {
		insassen.values().stream().filter(insasse -> insasse instanceof Passenger && ((Passenger) insasse).isFirstClass()).forEach(Insasse::print);
	}
}
