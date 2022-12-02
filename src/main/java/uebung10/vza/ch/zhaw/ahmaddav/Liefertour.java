package uebung10.vza.ch.zhaw.ahmaddav;

import java.util.ArrayList;

public class Liefertour {

	ArrayList<Lieferung> lieferungen = new ArrayList<Lieferung>();

	public void addBrief(int plz, String empfaenger, boolean mitUnterschrift) {
		lieferungen.add(new Brief(plz, empfaenger, mitUnterschrift));
	}

	public void addPaket(int plz, String empfaenger, double gewicht) {
		lieferungen.add(new Paket(plz, empfaenger, gewicht));
	}

	public void print(int plz) {
		for (int i = 0; i < lieferungen.size(); i++) {
			System.out.println(lieferungen.get(i).getPlz());
		}
	}

	public void printAll() {
		for (Lieferung l : lieferungen) {
			l.print();
		}
	}

}