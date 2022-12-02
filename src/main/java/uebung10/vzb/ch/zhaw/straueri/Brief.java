package uebung10.vzb.ch.zhaw.straueri;


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
		System.out.println("\nBrief");
		super.print();
		System.out.println("-Unterschrift: ");
		if (mitUnterschrift) {
			System.out.println("ja");
		} else {
			System.out.println("nein");
		}
	}

}
