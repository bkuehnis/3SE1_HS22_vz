package uebung9.vzb.ch.zhaw.rinitsar;

// c & d & e
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
	// Wieso muss ich id schreiben und nicht Passnummer wie es in der Aufgabe als Key steht?
	public void addInsasse(String id, Insasse insasse) {
		insassen.put(id, insasse);
	}

	public Insasse getInsasse (String id) {
		return insassen.get(id);
	}
	
	public boolean hasInsasse(String id) {
			return insassen.containsKey(id);
		}
	
	public void printInsassen() {
		for(String i: insassen.keySet()) {
			System.out.println(i);
		}
	}
	
	public void printInsassenWithId() {
		for(String s: insassen.keySet()){
			Insasse x = insassen.get(s);
			System.out.print(s + ": ");
			x.print();
		}
	}
	}
	
