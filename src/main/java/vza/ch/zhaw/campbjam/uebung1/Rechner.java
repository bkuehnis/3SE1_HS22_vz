package vza.ch.zhaw.campbjam.uebung1;

public class Rechner {

	public static void main(String[] args) {

		double fzA = 5; // Länge von deinem Auto (Meter)
		double fzB = 5; // Länge des anderen Autos (Meter)
		double vA = 120; // Deine Geschwindigkeit (km/h)
		double vB = 80; // Geschwindigkeit des anderen Autos(km/h)

		System.out.println("Geschwindigkeit A: " + vA);
		System.out.println("Geschwindigkeit B: " + vB);
		System.out.println("Länge A: " + fzA);
		System.out.println("Länge B: " + fzB);

		// Hier kommt die Lösung der Aufgabe hin...

		double s1 = vA / 2;
		double s2 = vB / 2;

		double streckeRelativ = fzA + fzB + s1 + s2;
		double geschwindigkeitRelativ = vA - vB;

		double zeit = streckeRelativ * 3.6 / geschwindigkeitRelativ;

		double ueberholweg = zeit * vA / 3.6;

		System.out.println("Sicherheitsabstand 1: " + s1);
		System.out.println("Sicherheitsabstand 1: " + s2);
		System.out.println("Relative Strecke: " + streckeRelativ + " Meter");
		System.out.println("Relative Geschwindigkeit: " + geschwindigkeitRelativ + " km/h");
		System.out.println("Benötigte Zeit: " + zeit + " Sekunden");
		System.out.println("Ueberholweg: " + ueberholweg + " Meter");
	}
}