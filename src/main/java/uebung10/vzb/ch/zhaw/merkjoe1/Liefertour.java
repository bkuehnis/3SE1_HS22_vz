package uebung10.vzb.ch.zhaw.merkjoe1;

import java.util.ArrayList;

public class Liefertour {
	ArrayList<Lieferung> lieferung = new ArrayList<Lieferung>();
	
	public void addBrief(int plz, String empfaenger, boolean mitUterschrift) {
		lieferung.add(new Brief(plz, empfaenger, mitUterschrift));
	}
	
	public void addPaket(int plz, String empfaenger, Double gewicht) {
		lieferung.add(new Paket(plz, empfaenger, gewicht));
	}
	
	public void print(int plz) {
		for (Lieferung l1: lieferung) {
			if(plz == l1.getPlz()) {
				l1.print();
			}
		}
	}
	
	public void printAll() {
		for (Lieferung l1: lieferung) {
				l1.print();
		}
	}
}
