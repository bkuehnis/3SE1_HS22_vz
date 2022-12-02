package uebung10.vza.ch.zhaw.reichraf;

import java.util.ArrayList;


public class Liefertour {
	ArrayList<Lieferung>lieferung = new ArrayList<Lieferung>();

	public void addBrief(int plz, String empfaenger, boolean mitUnterschrift) {

		lieferung.add(new Brief(plz,empfaenger,mitUnterschrift));

	}
	public void addPaket(int plz, String empfaenger, double gewicht) {

		lieferung.add(new Paket(plz,empfaenger,gewicht));

	}


	public void print(int plz) {
		for (Lieferung x: lieferung) {
			if (x.getPlz()==plz) {
				x.print();
			}
		}
	}

	public  void printAll() {
		for (Lieferung x: lieferung) {
			x.print();
		}
	}
}
