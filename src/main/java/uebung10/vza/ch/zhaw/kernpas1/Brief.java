package uebung10.vza.ch.zhaw.kernpas1;


public class Brief extends Lieferung {
	private boolean mitUnterschrift;

	public Brief(int plz, String empfaenger, boolean mitUnterschrift) {
		super(plz, empfaenger);
		this.mitUnterschrift = mitUnterschrift;
	}

	public boolean istMitUnterschrift() {
		return mitUnterschrift;
	}
	
	public void print() {
		System.out.println("\nBrief");
		super.print();
		if (mitUnterschrift) {
		System.out.println("-Unterschrift: ja");
		} else {
			System.out.println("-Unterschrift: nein");
		}
	}
}
