package uebung10.vzb.ch.zhaw.durmibet;

import java.util.ArrayList;

public class Liefertour {

	ArrayList<Lieferung> lieferungen = new ArrayList<Lieferung>();

	public void addBrief(int plz, String empfaenger, boolean mitUnterschrift) {
		Brief b = new Brief(plz, empfaenger, mitUnterschrift);
		lieferungen.add(b);
	}

	public void addPaket(int plz, String empfaenger, double gewicht) {
		Paket p = new Paket(plz, empfaenger, gewicht);
		lieferungen.add(p);
	}

	public void print(int plz) {
		for (Lieferung l : lieferungen) {
			if (l.getPlz() == lieferungen.get(0).getPlz()) {
				l.print();
			}
		}
	}

	public void printAll() {
		for (Lieferung l : lieferungen) {
			l.print();
		}
	}

}