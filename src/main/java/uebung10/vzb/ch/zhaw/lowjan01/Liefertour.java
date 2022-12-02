package uebung10.vzb.ch.zhaw.lowjan01;

import java.util.ArrayList;

public class Liefertour {

	private ArrayList<Lieferung> lieferungen;
	
	Lieferung lieferung; // Unidirektionale Assoziation

	public void addBrief(int plz, String empfaenger, int mitUnterschrift) {
		lieferungen = new ArrayList<Lieferung>();
		boolean mitUnterschrifta = false;
		if (mitUnterschrift == 1) {
			mitUnterschrifta = true;
		} else if (mitUnterschrift == 2) {
			mitUnterschrifta = false;
		}
		lieferungen.add(new Brief(plz, empfaenger, mitUnterschrifta));
	}

	public void addPaket(int plz, String empfaenger, double gewicht) {
		lieferungen = new ArrayList<Lieferung>();
		lieferungen.add(new Paket(plz, empfaenger, gewicht));
	}

	public void print(int plz) {
		System.out.println("PLZ: " + plz);
	}

	public void printAll() {
		for (int i = 0; i < lieferungen.size(); i++) {
			System.out.println("Paket ");
			System.out.println("-PLZ: " + lieferungen.get(i).getPlz());
			System.out.println("-Empfänger: " + lieferungen.get(i).getEmpfaenger());
//			System.out.println("-Empfänger: "+lieferungen.get(i).getGewicht());
		}
	}
}
