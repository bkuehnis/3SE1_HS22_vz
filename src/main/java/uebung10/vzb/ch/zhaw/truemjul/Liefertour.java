package uebung10.vzb.ch.zhaw.truemjul;

import java.util.ArrayList;

public class Liefertour {
	private ArrayList<Lieferung> l = new ArrayList<Lieferung>();
	
	public void addBrief(int plz, String empfaenger, boolean unterschrift) {
		l.add(new Brief(plz, empfaenger, unterschrift));
	}
	
	public void addPaket(int plz, String empfaenger, double gewicht) {
		l.add(new Paket(plz, empfaenger, gewicht));
	}
	
	public void print(int plz) {
		for(Lieferung r : l)
		if(r.getPlz() == plz) {
			r.print();
			if(r instanceof Paket) {
				((Paket) r).print();
			}
			else if(r instanceof Brief) {
				((Brief)r).print();
			}
		} else
			System.out.println("Nothing found");
}

public void printAll() {
	for (Lieferung r : l) {
		System.out.println(r.getPlz() + r.getEmpfaenger());
		if (r instanceof Paket) {
			((Paket) r).print();
		} else if (r instanceof Brief) {
			((Brief)r).print();
		}
	}
}
}
