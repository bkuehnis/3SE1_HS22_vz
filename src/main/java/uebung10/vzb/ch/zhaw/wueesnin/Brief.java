package uebung10.vzb.ch.zhaw.wueesnin;


public class Brief {

	private boolean mitUnterschrift;

	public Brief(int plz, String empfaenger, boolean mitUnterschrift) {
		this.mitUnterschrift = mitUnterschrift;
	}

	public boolean isMitUnterschrift() {
		return mitUnterschrift;
	}

	public void print() {
		System.out.println("-Unterschrift: " + (mitUnterschrift ? "Ja" : "Nein"));
	}
}
