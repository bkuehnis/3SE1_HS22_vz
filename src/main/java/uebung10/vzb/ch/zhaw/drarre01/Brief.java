package uebung10.vzb.ch.zhaw.drarre01;


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
		String unterschrieben = "Nein";
		if (isMitUnterschrift()) {
			unterschrieben = "Ja";
		}
		System.out.println("Brief");
		super.print();
		System.out.println("Unterschrift: " + unterschrieben);
	}

}
