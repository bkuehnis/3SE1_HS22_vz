package uebung10.vzb.ch.zhaw.wueesnin;

import java.util.ArrayList;

public class Liefertour {
	private ArrayList<Lieferung> lieferungen = new ArrayList<>();

	public void addBrief(int plz, String empfaenger, boolean mitUnterschrift) {
		Brief brief = new Brief(plz, empfaenger, mitUnterschrift);
		lieferungen.add(new Lieferung(plz, empfaenger, brief));

	}

	public void addPaket(int plz, String empfaenger, double gewicht) {
		Paket paket = new Paket(plz, empfaenger, gewicht);
		Lieferung l = new Lieferung(plz, empfaenger, paket);
		lieferungen.add(l);
	}

	public void print(int plz) {
		for (Lieferung lieferung : lieferungen) {
			if (plz == lieferung.getPlz()) {
				lieferung.print();
				System.out.println();
			}
		}
	}

	public void printAll() {
		for (Lieferung lieferung : lieferungen) {
			lieferung.print();
			System.out.println();
		}
	}
}