package uebung10.vza.ch.zhaw.friesti1;


public class Brief extends Lieferung {
	public boolean mitUnterschrift;

	public Brief(int plz, String empf, boolean unterschr) {
		super(plz, empf);
		mitUnterschrift = unterschr;
	}

	public void print() {
		System.out.println();
		System.out.println("Brief");
		System.out.print("-PLZ: ");
		System.out.println(getPlz());
		System.out.print("-Empfänger: ");
		System.out.println(getEmpfaenger());
		System.out.print("-Unterschrift: ");
		System.out.println(isMitUnterschrift() ? "ja" : "nein");
		System.out.println();
	}

	public boolean isMitUnterschrift() {
		return mitUnterschrift;
	}
}
