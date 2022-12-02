package uebung10.vzb.ch.zhaw.toddara1;

import java.util.ArrayList;

public class Liefertour {
	
	private ArrayList<Lieferung> lieferungen = new ArrayList<Lieferung>();
	
	public void addBrief(int plz, String empfaenger, boolean mitUnterschrift) {
		Brief brief = new Brief(plz, empfaenger, mitUnterschrift);
		lieferungen.add(brief);
	}
	
	public void addPaket(int plz, String empfaenger, double gewicht) {
		//Lieferung lieferung = new Lieferung(plz, empfaenger);
		
		Paket paket = new Paket(plz, empfaenger, gewicht);
		lieferungen.add(paket); // wegen extends weiss java dass paket eine Lieferugn ist
		
	}
	
	public void print(int plz) {
		for (Lieferung lieferung : lieferungen) {
			if(lieferung.getPlz() == plz) {
				lieferung.print();
			}
		}
		
	}
	
	public void printAll() {
		for(Lieferung lieferung : lieferungen) {
			lieferung.print();
		
		}
		
	}
	
	

}
