package uebung10.vza.ch.zhaw.doenmhac;


public class Brief extends Lieferung{
	private boolean mitUnterschrift;
	
	public Brief(int plz, String empfaenger, boolean mitUnterschrift) {
		super(plz, empfaenger);
		this.mitUnterschrift = mitUnterschrift;
	}
	public boolean isMitUnterschrift() {
		return mitUnterschrift;
	}
	public void print() {
		
	}

}
