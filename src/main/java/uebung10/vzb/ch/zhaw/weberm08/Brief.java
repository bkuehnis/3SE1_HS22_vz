package uebung10.vzb.ch.zhaw.weberm08;


public class Brief extends Lieferung {
private boolean mitUnterschrift;

public Brief(int plz, String empfaenger, boolean mitUnterschrift) {
	super(plz, empfaenger);
	this.mitUnterschrift = mitUnterschrift;
}

public boolean isMitUnterschrift() {
	return mitUnterschrift;
}

public void print() {
	System.out.println("-Brief: " + isMitUnterschrift());
}

}
