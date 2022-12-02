package uebung10.vzb.ch.zhaw.toddara1;


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
		System.out.println("Paket");
		super.print();
		//System.out.println("-PLZ: " + super.getPlz()); // in mutterklasse schon codiert
		//System.out.println("-Empfänger: " + super.getEmpfaenger());
		System.out.println("-Gewicht: " + gewicht);
		System.out.println();
	}
}
