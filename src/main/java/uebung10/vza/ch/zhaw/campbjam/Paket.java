package uebung10.vza.ch.zhaw.campbjam;


public class Paket extends Lieferung {

	private double gewicht;

	public Paket(int plz, String empfaenger, double gewicht) {
		super(plz, empfaenger);
		this.gewicht = gewicht;
	}

	public double getGewicht() {
		return gewicht;
	}

	public void print() {
		System.out.println("\nPaket");
		super.print();

		System.out.println("-Gewicht: " + gewicht);
	}
}
