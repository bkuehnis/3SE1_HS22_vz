package uebung10.vza.ch.zhaw.gavindom;


public class Brief extends Lieferung {
	
	private boolean mitUnterschrift;
	
	public Brief(int plz, String empfaenger, boolean mitUnterschrift) {
		super(plz, empfaenger);
		this.mitUnterschrift=mitUnterschrift;
	}
	
	public boolean isMitUnterschrift() {
		return mitUnterschrift;
	}

	public void print() {
		super.print();
		if (mitUnterschrift == true) {
			System.out.println("Unterschrift: " + "ja");
		} else {
			System.out.println("Unterschrift: " + "nein");
		}
		
	}
}
