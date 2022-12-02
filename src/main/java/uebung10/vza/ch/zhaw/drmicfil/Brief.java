package uebung10.vza.ch.zhaw.drmicfil;


public class Brief extends Lieferung {
	private boolean mitUnterschrift;
	

	public Brief(int plz, String empfaenger, boolean mitUnterschrift) { //super übernimmt das vom parent
			super(plz, empfaenger);
			this.mitUnterschrift = mitUnterschrift;
	}
	
	public boolean isMitUnterschrift() {
		return mitUnterschrift;
	}
	
	public void print() {   //super.print() druckt das vom parent
		super.print();
		System.out.println("Unterschrift: "+isMitUnterschrift());
	}
	
}
