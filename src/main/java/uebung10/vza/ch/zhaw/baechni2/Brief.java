package uebung10.vza.ch.zhaw.baechni2;


public class Brief {
	private boolean mitUnterschrift;

	public Brief(int plz, String empfaenger, boolean mitUnterschrift) {
		
		this.mitUnterschrift = mitUnterschrift;

	}

	public boolean istMitUnterschrift(){
		return mitUnterschrift;
	}

	public void print() {

	}
}
