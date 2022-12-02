package uebung10.vzb.ch.zhaw.merkjoe1;


public class Brief extends Lieferung {
	private boolean mitUnterschrift;
	
	public Brief(int plz, String empfaenger, boolean mitUnterschrift) {
		super(plz, empfaenger);
		this.mitUnterschrift = mitUnterschrift;
	}
	
	public boolean isMitUNterschrift() {
		return mitUnterschrift;
	}
	
	public void print() {
		System.out.println("\n"+"Brief");
		super.print();
		if(mitUnterschrift == true) {
			System.out.println("-Unterschrift: ja");
		}else {
			System.out.println("-Unterschrift: nein");
		}	
	}
}
