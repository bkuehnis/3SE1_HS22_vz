package uebung10.vza.ch.zhaw.reichraf;


public class Brief extends Lieferung{

	private boolean mitUnterschrit;
	
	public Brief(int plz, String empfaenger, boolean mitUnterschrift) {
		super(plz,empfaenger);
		this.mitUnterschrit = mitUnterschrift;
	}
	
	public boolean isMitUnterschrift() {
		return mitUnterschrit;
	}
	
	public void print() {
		System.out.println("Brief");
		super.print();
		String antwort= "";
		if(mitUnterschrit) {
			antwort= "ja";
		System.out.println("-Unterschrift:" + antwort);
		} else {
			antwort= "nein";
			System.out.println("-Unterschrift:" + antwort);
		}
	}
	
}

