package uebung10.vzb.ch.zhaw.lowjan01;


public class Brief extends Lieferung {

	private boolean mitUnterschrift;

	public Brief(int plz, String empfaenger, boolean mitUnterschrift) {
		super(plz, empfaenger, mitUnterschrift);
		this.mitUnterschrift = mitUnterschrift;

	}

	public boolean isMitUnterschrift() {
		return mitUnterschrift;
	}
	
	public void print() {

	}

}
