package uebung10.vza.ch.zhaw.friesti1;


public class Lieferung {
	public int postleitzahl;
	public String empfaenger;
	public Lieferung(int plz, String empf) {
		postleitzahl = plz;
		empfaenger = empf;
	}
	
	public void print() {
		
	}
	
	public int getPlz() {
		return postleitzahl;
	}
	
	public String getEmpfaenger() {
		return empfaenger;
	}
}
