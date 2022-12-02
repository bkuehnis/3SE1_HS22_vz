package uebung10.vza.ch.zhaw.zuercja2;

import java.util.ArrayList;


public class Liefertour {
	
	ArrayList<Lieferung> lieferungen = new ArrayList<Lieferung>();
	
	public void addBrief(int plz,String empfaenger,boolean unterschrift) {
		lieferungen.add(new Brief(plz,empfaenger,unterschrift));
	}
	
	public void addPaket(int plz,String empfaenger,double gewicht) {
		lieferungen.add(new Paket(plz,empfaenger,gewicht));
	}
	
	public void print(int plz) {
		for (Lieferung e: lieferungen) {
			if (e.getPlz()==plz) {
				e.print();
			}
		}
	}
	public void printAll() {
		for(Lieferung e: lieferungen) {
			e.print();
		}
	}
	



}
