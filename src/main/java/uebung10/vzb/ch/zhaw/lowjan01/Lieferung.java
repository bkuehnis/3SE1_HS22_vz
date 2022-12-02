package uebung10.vzb.ch.zhaw.lowjan01;


public class Lieferung {

	private int plz;
	private String empfaenger;

	public Lieferung(int plz, String empfaenger, double gewicht) {
		this.plz = plz;
		this.empfaenger = empfaenger;
	}

	public Lieferung(int plz2, String empfaenger2, boolean mitUnterschrift) {
		// TODO Auto-generated constructor stub
	}

	public int getPlz() {
		return plz;
	}

	public String getEmpfaenger() {
		return empfaenger;
	}

	public void print() {

	}

}
