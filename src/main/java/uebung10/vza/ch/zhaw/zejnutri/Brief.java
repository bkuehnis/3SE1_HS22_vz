package uebung10.vza.ch.zhaw.zejnutri;


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
//		System.out.println("Brief /n -PLZ: "+getPlz()+" /n -Empfaenger: ");
		System.out.println("Brief");
		System.out.println("-PLZ: "+getPlz());
		System.out.println("-Empfaenger: "+getEmpfaenger());
		System.out.println("-Unterschrift"+isMitUnterschrift());
	}
}
