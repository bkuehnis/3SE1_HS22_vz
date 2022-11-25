package uebung9.vza.ch.zhaw.murbalio;

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
		return insassen.get(id);
	}
	public boolean hasInsasse(String id) {
		return insassen.containsKey(id) ;
	}
	public void printInsassen() {
		for(Insasse s: insassen.values()) {
			s.print();	
		}
	}
	public void printInsassenWithId() {
		for(String s: insassen.keySet()) {
			Insasse i = insassen.get(s);
			System.out.print(s+": ");
			i.print();
			}
		}
	}
