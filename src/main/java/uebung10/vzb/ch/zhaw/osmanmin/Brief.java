package uebung10.vzb.ch.zhaw.osmanmin;


public class Brief extends Lieferung {
	
	private boolean mitUnterschrift;
	
	public Brief(int plz, String empfaenger, boolean mitUnterschrift) {
		super(plz, empfaenger);
		this.mitUnterschrift = mitUnterschrift;
	}
	
	public boolean istMitUnterschrift() {
		if(mitUnterschrift) {
			return true;
		} else {
			return false;
		}
	}
	
	public void print() {
		
	}

}
