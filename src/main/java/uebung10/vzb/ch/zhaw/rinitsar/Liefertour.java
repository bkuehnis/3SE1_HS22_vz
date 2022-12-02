package uebung10.vzb.ch.zhaw.rinitsar;

import java.util.ArrayList;

public class Liefertour {
	
	private ArrayList<Lieferung> lieferungen = new ArrayList<Lieferung>();
	
	public void addBrief (int plz, String empfaenger, boolean mitUnterschrift) {
		lieferungen.add(new Brief (plz, empfaenger, mitUnterschrift));
}
	public void addPaket (int plz, String empfaenger, double gewicht) {
		lieferungen.add(new Paket (plz, empfaenger, gewicht));
}
	public void print(int plz) {
		for(Lieferung l : lieferungen) {
			System.out.println(l.getPlz());
		}
	}
	
	//Bei mir wird immer nur das was ich als Letztes eingegeben habe ausgegeben und nicht alles
	public void printAll() {
		for(Lieferung l: lieferungen) {
			l.print();
		}
	}
}
