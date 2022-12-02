package uebung10.vza.ch.zhaw.streiluc;


public class Brief extends Lieferung {
private boolean mitUnterschrift;
	public Brief(int plz,String empfaenger, boolean mitUnterschrift) {
	super(plz, empfaenger);
	this.mitUnterschrift= mitUnterschrift;
	}
	public boolean istMitunterschrift() {
		if(mitUnterschrift) {
			return true;
		}else {
			return false;
		}
	}
	public void print() {
		System.out.print("Brief");
		System.out.print("Plz"+ getPlz());
		System.out.print("Empfänger"+ getEmpfaenger());
		System.out.print("mit Unterschrift"+ mitUnterschrift);
	}

}
