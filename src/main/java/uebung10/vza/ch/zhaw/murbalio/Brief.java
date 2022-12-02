package uebung10.vza.ch.zhaw.murbalio;


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

		System.out.println("Brief");
		System.out.println("-PLZ: " + getPlz());
		System.out.println("-Empfänger: " + getEmpfaenger());
		
		String unterschrift;
		if (mitUnterschrift) {
			unterschrift = "ja";
		} else {
			unterschrift = "nein";
		}
		System.out.println("-Unterschrift: " + unterschrift);
		System.out.println("");
	}
}
