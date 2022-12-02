package uebung10.vza.ch.zhaw.gavindom;

import java.util.ArrayList;

public class Liefertour {
	private ArrayList<Lieferung> lieferungen = new ArrayList<Lieferung>();
	
	public void addBrief (int plz, String empfaenger, boolean mitUnterschrift) {
		lieferungen.add(new Brief(plz, empfaenger, mitUnterschrift));
	}
	public void addPaket (int plz, String empfaenger, double gewicht) {
		lieferungen.add(new Paket(plz, empfaenger, gewicht));

	}
	public void print (int plz) {
		for (int i = 0; i < lieferungen.size(); ++i) {
		 if (lieferungen.get(i).getPlz() == plz) {
			 lieferungen.get(i).print();
			 System.out.println();
		 }
		}
		
		}
	
	public void printAll() {
		
		System.out.println();
	int i = 0;
	while (i < lieferungen.size()) {
	lieferungen.get(i).print();
	i++;
	}
		}
	}

