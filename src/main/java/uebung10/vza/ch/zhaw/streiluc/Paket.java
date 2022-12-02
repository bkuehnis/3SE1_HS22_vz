package uebung10.vza.ch.zhaw.streiluc;


public class Paket extends Lieferung {
private double gewicht;
	public Paket(int plz, String empfaenger, double gewicht) {
		super(plz, empfaenger);
		this.gewicht= gewicht;
	}
	public double getGewicht() {
		return gewicht;
	}
	public void print()	{
		System.out.print("Paket");
		System.out.print("Plz"+ getPlz());
		System.out.print("Empfänger"+getEmpfaenger());
		System.out.print("Gewicht"+gewicht);
	}

}
