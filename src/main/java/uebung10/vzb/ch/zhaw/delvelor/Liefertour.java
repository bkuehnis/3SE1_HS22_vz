package uebung10.vzb.ch.zhaw.delvelor;

import java.util.ArrayList;
import java.util.HashMap;

public class Liefertour {

	private ArrayList<Lieferung> Lieferungen = new ArrayList<Lieferung>();

	public void addBrief(int plz, String empfaenger, boolean mitUnterschrift) {
		Brief a = new Brief(plz, empfaenger, mitUnterschrift);
		Lieferungen.add(a);

	}

	public void addPaket(int plz, String empfaenger, double gewicht) {
		Paket b = new Paket(plz, empfaenger, gewicht);
		Lieferungen.add(b);

	}

	public void print(int plz) {
		System.out.println("PLZ: " + plz);
	}

	public void printAll() { 
		for (Lieferung l: Lieferungen) {
			l.print();
		}
		System.out.println("\t1");
	}

}
