package uebung9.vza.ch.zhaw.zuercja2;

import java.util.HashMap;

public class Flight {
	private String flightNumber;
	private HashMap<String,Insasse> insassen = new HashMap<String,Insasse>();

	public Flight(String flightNumber) { 
		this.flightNumber=flightNumber;
	}
	public String getFlightNumber(){
		return flightNumber;
	}
	
	public void addInsasse(String id, Insasse in) {
		insassen.put(id,in);
	}
	
	public Insasse getInsasse(String id) {
		Insasse i = insassen.get(id);
		 return i;
	}
	
	public boolean hasInsasse(String id) {
		if(insassen.containsKey(id)) {
			return true;
		}
		return false;
	}
	
	public void printInsassen() {
		for(Insasse in: insassen.values()) {
			in.print();
		}
	}
	
	public void printInsassenWithId() {
		for(String s: insassen.keySet()) {
			for(Insasse in: insassen.values()) {
			System.out.println(s+": "); in.print();
		
		}
	}
	
	
	}
	}



