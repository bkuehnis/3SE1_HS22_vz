package uebung10.vzb.ch.zhaw.weberm08;

import java.util.ArrayList;

public class Liefertour {
	private ArrayList<Lieferung> lieferungen = new ArrayList<Lieferung>();
	
	public void addBrief(int plz, String empfaenger, boolean mitUnterschrift) {
		Brief brief = new Brief(plz, empfaenger, mitUnterschrift);
		lieferungen.add(brief);
	}
	
	public void addPaket(int plz, String empfaenger, double gewicht) {
		Paket paket = new Paket(plz, empfaenger, gewicht);
		lieferungen.add(paket);
	}
	
	public void print(int plz) {
		for (Lieferung l : lieferungen) {
			if (l.getPlz() == plz) {
				printFormat(l);
			}
		}
	}
	
	public void printAll() {
		for (Lieferung l : lieferungen) {
			printFormat(l);
		}
	}
	
	public void printFormat(Lieferung l) {
		System.out.println("");
		System.out.println(l.getClass() == Paket.class ? "Paket" : "Brief");
		System.out.println("-PLZ: " + l.getPlz());
		System.out.println("-Empfänger: " + l.getEmpfaenger());
		if (l instanceof Paket){
			Paket p = (Paket)l;
			p.print();
		} else {
			Brief b = (Brief)l;
			b.print();
		}
	}
}
