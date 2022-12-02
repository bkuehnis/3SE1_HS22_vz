package uebung10.vza.ch.zhaw.friesti1;


public class Paket extends Lieferung {
	public double gewicht;

	public Paket(int plz, String empf, double gew) {
		super(plz, empf);
		gewicht = gew;
	}

	public void print() {
		System.out.println();
		System.out.println("Paket");
		System.out.print("-PLZ: ");
		System.out.println(getPlz());
		System.out.print("-Empfänger: ");
		System.out.println(getEmpfaenger());
		System.out.print("-Gewicht: ");
		System.out.println(getGewicht());
		System.out.println();
	}

	public double getGewicht() {
		return gewicht;
	}
}
