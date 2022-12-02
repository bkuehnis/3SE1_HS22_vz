package uebung10.vza.ch.zhaw.zuercja2;


public class Brief extends Lieferung{
	private boolean mitUnterschrift;
	
	public Brief(int plz,String empfaenger,boolean unterschrift) {
		super(plz,empfaenger);
		mitUnterschrift = unterschrift;
		
	}
	public boolean isMitUnterschrift() {
		return mitUnterschrift;
	}
	public void print() {
		System.out.println("-PLZ: "+getPlz());
		System.out.println("-Empfaenger: "+getEmpfaenger());
		System.out.print("Unterschrift: ");
		System.out.println(isMitUnterschrift()? "ja" : "nein");
		System.out.println(" ");
	}

	

}
