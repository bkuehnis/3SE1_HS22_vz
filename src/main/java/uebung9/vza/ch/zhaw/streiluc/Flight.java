package uebung9.vza.ch.zhaw.streiluc;

import java.util.HashMap;
import java.util.Objects;

public class Flight {
	private String flightNumber;
	private HashMap<String,Insasse> insassen = new HashMap<String,Insasse>();
	

	public Flight(String flightNumber) {
		
		this.flightNumber = flightNumber;
	}


	public String getFlightNumber() {
		return flightNumber;
	}
}
//Bin ab hier nicht mehr weiter gekommen. Das Wissen zu den Hashmaps hat mir irgendwie gefehlt, da ich letzte Woche verpasst habe
	/*public void addInsasse(String id, Insasse insasse) {
		insassen.put(id, insasse);
	}
	public Insasse getInsasse(String id) {
		if(insassen.equals(id)) {
		return insassen.get(id);
		}
		return null;
		}
		
	}*/

	// TODO: ergaenzen

