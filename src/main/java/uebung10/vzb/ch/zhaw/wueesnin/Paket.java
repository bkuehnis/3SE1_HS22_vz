package uebung10.vzb.ch.zhaw.wueesnin;


public class Paket {

	private double gewicht;

	public Paket(int plz, String empfaenger, double gewicht) {
		this.gewicht = gewicht;
	}

	public double getGewicht() {
		return gewicht;
	}

	public void print() {
		System.out.println("-Gewicht: " + gewicht);
	}
}
