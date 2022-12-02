package uebung10.vzb.ch.zhaw.durmibet;

public class Brief extends Lieferung {

	private boolean mitUnterschrift;

	public Brief(int plz, String empfaenger, boolean mitUnterschrift) {
		super(plz, empfaenger);
		this.mitUnterschrift = mitUnterschrift;
	}

	public boolean isMitUnterschrift() {
		if (mitUnterschrift == true) {
			return true;
		}
		return false;
	}

	public void print() {
		String unterschrieben = "Nein";
		if (isMitUnterschrift() == true) {
			unterschrieben = "Ja";
		}
		super.print();
		System.out.println("-Unterschrift: " + unterschrieben);
	}

}