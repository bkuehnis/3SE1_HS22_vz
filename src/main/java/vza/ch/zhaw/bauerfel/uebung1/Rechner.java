package vza.ch.zhaw.bauerfel.uebung1;


public class Rechner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double fzA = 5; // (Meter)
		double fzB = 5; // (Meter)
		double vA = 50; // (Km/h)
		double vB = 30; // (Km/h)

		System.out.println("Geschwindigkeit A: " + vA);
		System.out.println("Geschwindigkeit B: " + vB);
		System.out.println("Laenge A: " + fzA);
		System.out.println("Laenge B: " + fzB);

		double s1 = vA / 2;
		double s2 = vB / 2;
		System.out.println("Sicherheitsabstand 1: " + s1);
		System.out.println("Sicherheitsabstand 2: " + s2);

		double sr = fzA + s1 + fzB + s2;
		System.out.println("Relative Strecke: " + sr + " Meter");

		double rg = vA - vB;
		System.out.println("Relative Geschwindigkeit: " + rg + " Km/h");

		double t = sr * 3.6 / rg;
		System.out.println("Benoetigte Zeit: " + t + " Sekunden");

		double üw = t * vA / 3.6;
		System.out.println("Ueberholweg: " + üw + " Meter");
	}

}
