package uebung10.vzb.ch.zhaw.martilu5;

import java.util.ArrayList;

public class Liefertour{
	private ArrayList<Lieferung> lieferung = new ArrayList<Lieferung>();
	
	public void addBrief(int plz, String empfaenger, boolean mitUnterschrift) {
		Brief b = new Brief(plz,empfaenger, mitUnterschrift);
		lieferung.add(b);
	}
	
	public void addPaket(int plz, String empfaenger, double gewicht) {
		Paket p = new Paket(plz,empfaenger, gewicht);
		lieferung.add(p);
	}
	
	public void print(int plz) {
		for (Lieferung l: lieferung) {
			if (l.getPlz() == plz) {
				l.print();
			}
		}
		
	}
	
	public void printAll() {
		for (Lieferung l: lieferung) {
			l.print();
		}
	}
}
