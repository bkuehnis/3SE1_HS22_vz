package uebung9.vzb.ch.zhaw.merkjoe1;

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
		insassen.put(id,insasse);								//i.o
	}
	
	public Insasse getInsasse(String id){
		for(String i: insassen.keySet()) {
			if(i == id) {
				Insasse in = insassen.get(i);
				return in;
			}
		}
		return null;
	}
	
	public boolean hasInsasse(String id) {
		for(String i: insassen.keySet()) {
			if(i == id) {
				return true;
			}
		}
		return false;
	}
	
	public void printInsassen() {
		for(Insasse j: insassen.values()){
			j.print();
		}
		
	}
	
	public void printInsassenWithId() {	
		for(String i: insassen.keySet()) {
			Insasse j = insassen.get(i);
			System.out.print(i+": ");
			j.print();
		}
	}
}
