package uebung10.vzb.ch.zhaw.toddara1;


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
		System.out.println("Brief");
		super.print();
		//System.out.println("-PLZ: " + super.getPlz());
		//System.out.println("-Empfänger: " + super.getEmpfaenger());
		
	
		String unterschrift = null;
		if (mitUnterschrift == true) {
			unterschrift = "ja";
		} else {
			unterschrift = "nein";
			
		}
		System.out.println("-Unterschrift: " + unterschrift);
		System.out.println();
	}
}
