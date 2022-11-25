package uebung9.vzb.ch.zhaw.mulahham;

import java.util.HashMap;

public class Flight {
	private String flightNumber;
	private HashMap<String,Insasse> insassen = new HashMap<String,Insasse>();

	public Flight(String flightNumber) { 
		this.flightNumber = flightNumber;
	}

	public String getFlightNumber(){
		return flightNumber;
	}

	public void addInsasse(String id, Insasse insasse){
		insassen.put(id, insasse);
	}

	public Insasse getInsasse(String id) {
		return insassen.containsKey(id) ?  insassen.get(id) : null;
	}

	public boolean hasInsasse(String id){
		return insassen.containsKey(id);
	}

	public void printInsassen(){
		for(Insasse i: insassen.values()){
			i.print();
		}
	}

	public void printInsassenWithId(){
		for(String i: insassen.keySet()){
			System.out.print(i + ": ");
			insassen.get(i).print();
		}
	}
}
