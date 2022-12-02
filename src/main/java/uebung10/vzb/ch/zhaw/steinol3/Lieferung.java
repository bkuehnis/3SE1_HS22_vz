package uebung10.vzb.ch.zhaw.steinol3;

public class Lieferung {
	private int plz;
	private String empfaenger;
	
	public Lieferung(int plz, String empfaenger) {
		this.plz = plz;
		this.empfaenger = empfaenger;
	}

	public int getPlz() {
		return plz;
	}

	public String getEmpfaenger() {
		return empfaenger;
	}
	
	public void print() {
		System.out.println("-PLZ: "+plz);
		System.out.println("-Empfänger: "+ empfaenger);
	}
}
