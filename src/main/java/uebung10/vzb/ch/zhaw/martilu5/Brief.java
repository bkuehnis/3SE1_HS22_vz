package uebung10.vzb.ch.zhaw.martilu5;


public class Brief extends Lieferung {
	private boolean mitUnterschrift;

	public Brief(int plz, String empfaenger, boolean mitUnterschrift) {
		super(plz, empfaenger);
		this.mitUnterschrift = mitUnterschrift;
	}
	
	public boolean isMitUnterschrift() {
		if (mitUnterschrift == true) {
			return true;
		} else {
			return false;
		}
	}
	
	public void print() {
		System.out.println("\n"+"Brief");
		super.print();
		if (mitUnterschrift == true) {
			System.out.println("-Unterschrift: ja"+"\n");
		}else {
			System.out.println("-Unterschrift: nein"+"\n");
		}
		
	}
}
