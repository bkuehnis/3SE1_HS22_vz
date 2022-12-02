package uebung10.vza.ch.zhaw.heinini2;


public class Brief extends Lieferung {

	private boolean mitUnterschrift;

	public Brief(int plz, String empfaenger,boolean mitUnterschrift) {
		super(plz, empfaenger);
		this.mitUnterschrift = mitUnterschrift;
		
	}

	public boolean isMitUnterschrift() {
		return mitUnterschrift;
	}
	
	public void print() {
		System.out.println("\rBrief");
		System.out.println("-PLZ: "+getPlz());
		System.out.println("-Empfänger: "+getEmpfaenger());
		
		if (mitUnterschrift) {
			System.out.println("-Unterschrift: ja");
		} else {
			System.out.println("-Unterschrift: nein");
		}
	}
	
	

}
