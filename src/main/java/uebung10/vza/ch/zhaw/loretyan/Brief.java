package uebung10.vza.ch.zhaw.loretyan;


public class Brief extends Lieferung {

	private boolean mitUnterschrift;

	public Brief(int plz, String empfaenger, boolean mitUnterschrift) {
		super(plz, empfaenger);
		this.mitUnterschrift = mitUnterschrift;
	}

	public boolean isMitUnterschrift() {
		return mitUnterschrift;
	}

	@Override
	public void print() {
		System.out.println("");
		System.out.println("Brief");
		System.out.println("-PLZ: " + getPlz());
		System.out.println("-Empfänger: " + getEmpfaenger());
		System.out.println("-Unterschrift: " + (mitUnterschrift ? "ja" : "nein"));
	}

}
