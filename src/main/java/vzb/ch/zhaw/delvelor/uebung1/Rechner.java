package vzb.ch.zhaw.delvelor.uebung1;


public class Rechner {

	public static void main(String[] args) {

		double fzA = 5; // Länge von deinem Auto (Meter)

		double fzB = 5; // Länge des anderen Autos (Meter)

		double vA = 50; // Deine Geschwindigkeit (km/h)

		double vB = 30; // Geschwindigkeit des anderen Autos(km/h)

		double S1 = vA / 2; // Rechnung für Sicherheitsabstand 1

		double S2 = vB / 2; // Rechnung für Sicherheitsabstand 2

		double R = fzA + S1 + fzB + S2; // Rechnung für Relative Strecke
		
		double B = vA - vB; // Rechnung für Relative Geschwindigkeit
		
		double Z = (R*3.6)/B; // Rechnung für Zeit
		
		double U = (Z*vA)/3.6; // Rechnung Überholweg
		

		System.out.println("Geschwindigkeit A: " + vA);
		System.out.println("Geschwindigkeit B: " + vB);
		System.out.println("Länge A: " + fzA);
		System.out.println("Länge B: " + fzB);
		System.out.println("Sicherheitsabstand 1: " + S1);
		System.out.println("Sicherheitsabstand 2: " + S2);
		System.out.println("Relative Strecke: " + R + " Meter");
		System.out.println("Relative Geschwindigkeit: " + B + " Km/h");
		System.out.println("Benötigte Zeit: " + Z + " Sekunden");
		System.out.println("Überholweg " + U + " Meter");

 
	}

}
