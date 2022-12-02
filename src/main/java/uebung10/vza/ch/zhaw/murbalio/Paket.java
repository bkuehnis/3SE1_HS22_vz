package uebung10.vza.ch.zhaw.murbalio;


public class Paket extends Lieferung{
	private double gewicht;

	public Paket(int plz, String empfaenger, double gewicht) {
		super(plz, empfaenger);
		this.gewicht = gewicht;
	}

	public double getGewicht() {
		return gewicht;
	}
	public void print() {
		System.out.println("Paket");
		System.out.println("-PLZ: "+getPlz());
		System.out.println("-Empfänger: "+getEmpfaenger());
		System.out.println("-Gewicht: "+getGewicht());
		System.out.println("");
	}
	
}
