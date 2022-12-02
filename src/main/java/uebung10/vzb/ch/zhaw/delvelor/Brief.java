package uebung10.vzb.ch.zhaw.delvelor;


public class Brief extends Lieferung {

	private boolean mitUnterschrift;

	public Brief(int plz, String empfaenger, boolean mitUnterschrift) {
		super(plz, empfaenger);
		this.mitUnterschrift = mitUnterschrift;

	}

	public boolean isMitUnterschrift() {
		if (mitUnterschrift == true) {
			return true;
		} else {
			return false;
		}

	}

	public void print() {
		super.print();
		if (mitUnterschrift == true) {
			System.out.println("Unterschrift: " + "ja");
		} else if (mitUnterschrift == false) {
			System.out.println("Unterschrift: " + "nein");
		}

	}

}
