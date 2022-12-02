package uebung10.vza.ch.zhaw.weberth6;


public class Brief extends Lieferung  {
	private boolean mitUnterschrift;
	
	public Brief(int plz, String empfaenger, boolean mitUnterschrift) {
		super(plz, empfaenger);
		this.mitUnterschrift = mitUnterschrift;
	}
	
	
	
	public boolean isMitUnterschrift() {
		return mitUnterschrift;
	}
	
	public void print() {
		System.out.println("");
		System.out.println("Brief");
		super.print();
		if (mitUnterschrift) {
			System.out.println("-Unterschrift: Ja");
		} else {
			System.out.println("-Unterschrift: Nein");
		}
		
	}

}
