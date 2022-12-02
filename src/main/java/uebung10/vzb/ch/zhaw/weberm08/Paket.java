package uebung10.vzb.ch.zhaw.weberm08;


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
	System.out.println("-Gewicht: " + gewicht);
}
}
