package uebung10.vza.ch.zhaw.kuralsar;


public class Brief extends Lieferung {
	
	private boolean mitUnterschrift;
	
	public Brief(int plz, String empfaenger, boolean mitUnterschrift) {
		super(plz, empfaenger);
		this.mitUnterschrift = mitUnterschrift;
	}
	
	public boolean isMitUnteschrift() {
		return mitUnterschrift;
	}
	public void print() {
		super.print();
	}
}
