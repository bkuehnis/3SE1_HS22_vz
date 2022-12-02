package uebung10.vzb.ch.zhaw.straueri;

import java.util.ArrayList;

public class Liefertour {

	
	private ArrayList<Lieferung> lieferungen = new ArrayList<Lieferung>();
	 
	public void addBrief(int plz, String empfaenger, boolean mitUnterschrift) {
		lieferungen.add(new Brief(plz, empfaenger, mitUnterschrift));
	}
	
	public void addPaket(int plz, String empfaenger, double gewicht) {
		lieferungen.add(new Paket(plz, empfaenger, gewicht));
	}
	
	public void print(int plz) {
		for (Lieferung x: lieferungen) {
			if(x.getPlz() == plz) {
				x.print();
			}
		}
	}
	
	public void printAll() {
		for (Lieferung x: lieferungen) {
			x.print();
		}
		
	}

}
