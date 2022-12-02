package uebung10.vza.ch.zhaw.friesti1;

import java.util.ArrayList;

public class Liefertour {
	public ArrayList<Lieferung> lieferungen = new ArrayList<Lieferung>();

	public void addBrief(int plz, String empf, boolean unterschr) {
		lieferungen.add(new Brief(plz, empf, unterschr));
	}

	public void addPaket(int plz, String empf, double gew) {
		lieferungen.add(new Paket(plz, empf, gew));
	}
	
	public void print(int plz) {
		for(Lieferung lf : lieferungen) {
			if(lf.getPlz() == plz) {
				lf.print();
			}
		}
	}
	
	public void printAll() {
		for(Lieferung lf : lieferungen) {
			lf.print();
		}
	}
}
