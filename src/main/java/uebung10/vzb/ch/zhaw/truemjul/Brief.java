package uebung10.vzb.ch.zhaw.truemjul;


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
		super.print();
		System.out.println("Unterschrift vorhanden? ");
		if(isMitUnterschrift()){
			System.out.print("ja");
		} else System.out.println("nein");
	}
}
