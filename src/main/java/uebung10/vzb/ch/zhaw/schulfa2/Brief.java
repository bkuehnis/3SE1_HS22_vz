package uebung10.vzb.ch.zhaw.schulfa2;


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
		System.out.println("");
		System.out.println("Brief");
		super.print();
		String frage = (mitUnterschrift) ? "ja" : "nein";
		System.out.println("-Unterschrift: " + frage);
	}

}
