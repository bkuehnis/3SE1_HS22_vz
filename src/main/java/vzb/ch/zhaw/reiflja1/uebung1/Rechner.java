package vzb.ch.zhaw.reiflja1.uebung1;


public class Rechner {

	public static void main(String[] args) {
		double fzA = 5; // Länge von deinem Auto (Meter)
		double fzB = 5; // Länge des anderen Autos (Meter)
		double vA = 50; // Deine Geschwindigkeit (km/h)
		double vB = 30; // Geschwindigkeit des anderen Autos(km/h)

		double S1 = vA / 2;
		double S2 = vB / 2;
		double streckeRelativ = fzA + S1 + fzB + S2;
		double geschwindigkeitRelativ = vA - vB;
		double zeit = streckeRelativ * 3.6 / geschwindigkeitRelativ;
		double ueberhohlweg = zeit * vA / 3.6;

		System.out.println("Geschwindigkeit A: " + vA);
		System.out.println("Geschwindigkeit B: " + vB);
		System.out.println("Länge A: " + fzA);
		System.out.println("Länge B: " + fzB);
		System.out.println();
		System.out.println("Sicherheitsabstand 1: " + S1);
		System.out.println("Sicherheitsabstand 2: " + S2);
		System.out.println("Relative Strecke: " + streckeRelativ + " Meter");
		System.out.println("Relative Geschwindigkeit: " + geschwindigkeitRelativ + " km/h");
		System.out.println("Benötigte Zeit: " + zeit + " Sekunden");
		System.out.println("Ueberhohlweg: " + ueberhohlweg + " Meter");
	}

}
