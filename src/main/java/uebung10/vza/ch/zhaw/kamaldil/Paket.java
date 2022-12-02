package uebung10.vza.ch.zhaw.kamaldil;


public class Paket extends Lieferung{

	private double gewicht;
	
	public Paket (int plz, String empfaenger, double gewicht) {
		super(plz, empfaenger);
		this.gewicht = gewicht;
	}
	
	public double getGewicht() {
		return this.gewicht;
	}
	
	public void print() {
		System.out.println("Paket");
		System.out.println("Empfänger: " + getEmpfaenger());
		System.out.println("PLZ: " + getPlz());
		System.out.println("Gewicht: " + gewicht);
	}
}
