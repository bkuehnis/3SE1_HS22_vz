package uebung10.vza.ch.zhaw.kamaldil;


public class Lieferung {
	
	private int plz;
	private String empfaenger;
	
	public Lieferung (int plz, String empfaenger) {
		this.plz=plz;
		this.empfaenger=empfaenger;
	}
	
	public int getPlz() {
		return this.plz;
	}
	
	public String getEmpfaenger(){
		return this.empfaenger;
	}
	
	public void print() {
		System.out.println("Empfänger: " + empfaenger);
		System.out.println("PLZ: " + plz);	
	}

}
