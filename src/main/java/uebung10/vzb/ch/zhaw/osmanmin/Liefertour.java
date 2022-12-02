package uebung10.vzb.ch.zhaw.osmanmin;

import java.util.ArrayList;

public class Liefertour {

	private ArrayList<Lieferung> lieferungen = new ArrayList<Lieferung>();

	public void addBrief(int plz, String empfaenger, boolean mitUnterschrift) {
		int i = 0;
		lieferungen.add(i, new Brief(plz, empfaenger, mitUnterschrift));
		i++;
	}

	public void addPaket(int plz, String empfaenger, double gewicht) {
		int i = 0;
		lieferungen.add(i, new Paket(plz, empfaenger, gewicht));
		i++;
	}

	public void print(int plz) {
		for (int i = 0; i < lieferungen.size(); i++) {
			Lieferung b = lieferungen.get(i);
			if (b instanceof Brief) {
				if (lieferungen.get(i).getPlz() == plz) {
					Brief a = (Brief) b;
					System.out.println(" ");
					System.out.println("Brief");
					System.out.println("-PLZ: " + plz);
					System.out.println("-Empfänger: " + lieferungen.get(i).getEmpfaenger());
					if (a.istMitUnterschrift()) {
						System.out.println("-Unterschrift: ja");
					} else {
						System.out.println("-Unterschrift: nein");
					}
				}
			}
		}

		for (int i = 0; i < lieferungen.size(); i++) {
			Lieferung b = lieferungen.get(i);
			if (b instanceof Paket) {
				if (lieferungen.get(i).getPlz() == plz) {
					Paket a = (Paket) b;
					System.out.println(" ");
					System.out.println("Paket");
					System.out.println("-PLZ: " + plz);
					System.out.println("-Empfänger: " + lieferungen.get(i).getEmpfaenger());
					System.out.println("-Gewicht: " + a.getGewicht());
				}
			}
		}
	}

	public void printAll() {
		for (int i = 0; i < lieferungen.size(); i++) {
			Lieferung b = lieferungen.get(i);
			if (b instanceof Brief) {
				Brief a = (Brief) b;
				System.out.println(" ");
				System.out.println("Brief");
				System.out.println("-PLZ: " + a.getPlz());
				System.out.println("-Empfänger: " + lieferungen.get(i).getEmpfaenger());
				if (a.istMitUnterschrift()) {
					System.out.println("-Unterschrift: ja");
				} else {
					System.out.println("-Unterschrift: nein");
				}
			}

		}

		for (int i = 0; i < lieferungen.size(); i++) {
			Lieferung b = lieferungen.get(i);
			if (b instanceof Paket) {
				Paket a = (Paket) b;
				System.out.println(" ");
				System.out.println("Paket");
				System.out.println("-PLZ: " + a.getPlz());
				System.out.println("-Empfänger: " + lieferungen.get(i).getEmpfaenger());
				System.out.println("-Gewicht: " + a.getGewicht());
			}
		}

	}
}