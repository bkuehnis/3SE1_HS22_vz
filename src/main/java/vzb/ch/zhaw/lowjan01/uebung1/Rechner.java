package vzb.ch.zhaw.lowjan01.uebung1;


public class Rechner {

	public static void main(String[] args) {

		double fzA = 5; // Länge von deinem Auto (Meter)
		double fzB = 5; // Länge des anderen Autos (Meter)
		double vA = 120; // Deine Geschwindigkeit (km/h)
		double vB = 80; // Geschwindigkeit des anderen Autos(km/h)

		System.out.println("Geschwindigkeit A: " + vA);
		System.out.println("Geschwindigkeit B: " + vB);
		System.out.println("Laenge A: " + fzA);
		System.out.println("Laenge B: " + fzB);

		// Meine Lösung

		double S1 = vA / 2;
		double S2 = vB / 2;

		System.out.println("Sicherheitsabstand 1: " + S1);
		System.out.println("Sicherheitsabstand 1: " + S2);

		// die Relative Strecke ausrechnen

		double rS = fzA + S1 + fzB + S2;

		System.out.println("Relative Strecke: " + rS + " Meter");

		// die relative Geschwindigkeit ausrechnen

		double rGS = vA - vB;

		System.out.println("Relative Geschwindigkeit: " + rGS + " km/h");

		// die benötigte Zeit um das einte Fahrzeug zu überholen

		double z1 = rS * 3.6 / rGS;

		System.out.println("Benoetigte Zeit: " + z1 + " Sekunden");

		// den Überholweg ausrechnen

		double ueW = z1 * vA / 3.6;

		System.out.println("Ueberholweg: " + ueW + " Meter");

	}

}
