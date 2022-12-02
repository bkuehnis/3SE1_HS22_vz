package uebung10.vzb.ch.zhaw.reiflja1;


public class Brief extends Lieferung {

	private boolean mitUnterschrift;

	public Brief(int plz, String empfaenger, boolean mitUnterschrift) {
		super(plz, empfaenger);
		this.mitUnterschrift = mitUnterschrift;
	}

	public boolean isMitUnterschrift() {
		return mitUnterschrift;
	}

	public void print() {
		String mitUnterschriftOutput = "nein";
		if (mitUnterschrift) {
			mitUnterschriftOutput = "ja";
		}
		System.out.println("Brief");
		super.print();
		System.out.println("-Unterschrift: " + mitUnterschriftOutput + "\n");
	}
}
