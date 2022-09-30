package vzb.ch.zhaw.schulfa2.uebung1;


public class Rechner {

	public static void main(String[] args) {

		double fzA = 5; // Länge von deinem Auto (Meter)
		double fzB = 5; // Länge des anderen Autos (Meter)
		double vA = 50; // Deine Geschwindigkeit (km/h)
		double vB = 30; // Geschwindigkeit des anderen Autos(km/h)
		System.out.println("Geschwindigkeit A: " + vA);
		System.out.println("Geschwindigkeit B: " + vB);
		System.out.println("Länge A: " + fzA);
		System.out.println("Länge B: " + fzB);

		double s1, s2;

		s1 = vA / 2;
		s2 = vB / 2;

		double relStrck = fzA + s1 + fzB + s2;
		double vRel = vA - vB;
		double time = relStrck * 3.6 / vRel;
		double UberWeg = time * vA / 3.6;

		System.out.println("Sicherheitsabstand 1: " + s1);
		System.out.println("Sicherheitsabstand 2: " + s2);
		System.out.println("RelativeStreche: " + relStrck + " Meter");
		System.out.println("Relative Geschwindigkeit: " + vRel + " km/h");
		System.out.println("Benötigte Zeit: " + time + " Sekunden");
		System.out.println("Ueberholweg: " + UberWeg + " Meter");
	}

}
