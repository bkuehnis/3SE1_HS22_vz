package uebung9.vza.ch.zhaw.drmicfil;

import java.util.HashMap;

public class Flight {
	
	private String id;
	
	private String flightNumber;
	private HashMap<String,Insasse> insassen = new HashMap<String,Insasse>();

	public Flight(String flightNumber) { 
		this.flightNumber = flightNumber;
	}
	
	public String getFlightNumber() {
		return flightNumber;
	}
	
	public void addInsasse (String id, Insasse xy) { //ufgab c id no obe deklariere!!
		insassen.put(id, xy); //eif put methode, uf id wird im hintergrund zuegriffe
	}
	
	public Insasse getInsasse(String id) {  //gib alli use wo e verdammti id hend
		return insassen.get(id);
	}
	
	public boolean hasInsasse(String id) {  //ufgab d) referenz wird prüeft ob id vorhande
		if (insassen.containsKey(id)) {
			return true;
		}else {
			return false;
		}
	}
	
	public void printInsassen() { //ufgab e) mit values chönd alli infos useglese werde ohni id
		for (Insasse xy : insassen.values()) {
			xy.print();
		}
	}
	
	public void printInsassenWithId() { //gib alli infos use mit id 
		for (String id : insassen.keySet()) {
			System.out.print(id+" :");
			insassen.get(id).print();
		}
	}


}
