package vzb.ch.zhaw.wueesnin.uebung1;


public class Rechner {

	public static void main(String[] args) {
		// Pflichtaufgabe
		double fzA = 5; // Länge von deinem Auto (Meter)
		double fzB = 15; // Länge des anderen Autos (Meter)
		double vA = 80; // Deine Geschwindigkeit (km/h)
		double vB = 70; // Geschwindigkeit des anderen Autos(km/h)
		double s1 = vA / 2; // Sicherheitsabstand 1 (Meter)
		double s2 = vB / 2; // Sicherheitsabstand 2 (Meter)
		double rS = fzA + s1 + fzB + s2; // Relative Strecke (Meter)
		double rG = vA - vB; // Relative Strecke (km/h)
		double bZ = (rS * 3.6) / rG; // Benötigte Zeit (Sekunden)
		double uW = (bZ * vA) / 3.6; // Zeit Überholweg (Sekunden)

		System.out.println("Geschwindigkeit A: " + vA);
		System.out.println("Geschwindigkeit B: " + vB);
		System.out.println("Länge A: " + fzA);
		System.out.println("Länge B: " + fzB);
		System.out.println("Sicherheitsabstand 1: " + s1);
		System.out.println("Sicherheitsabstand 2: " + s2);
		System.out.println("Relative Strecke: " + rS + " Meter");
		System.out.println("Relative Geschwindigkeit: " + rG + " km/h");
		System.out.println("Benötigte Zeit: " + bZ + " Sekunden");
		System.out.println("Überholweg: " + uW + " Meter");

	}

}
