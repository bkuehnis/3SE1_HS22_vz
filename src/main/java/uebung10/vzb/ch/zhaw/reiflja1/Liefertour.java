package uebung10.vzb.ch.zhaw.reiflja1;

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
		for (Lieferung lieferung : lieferungen) {
			if (lieferung.getPlz() == plz) {
				if (lieferung instanceof Brief) {
					Brief b = (Brief) lieferung;
					b.print();
				}
				if (lieferung instanceof Paket) {
					Paket p = (Paket) lieferung;
					p.print();
				}
			}
		}
	}

	public void printAll() {
		for (Lieferung lieferung : lieferungen) {
			if (lieferung instanceof Brief) {
				Brief b = (Brief) lieferung;
				b.print();
			}
			if (lieferung instanceof Paket) {
				Paket p = (Paket) lieferung;
				p.print();
			}
		}
	}

}
