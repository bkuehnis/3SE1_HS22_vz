package vzb.ch.zhaw.bosluc01.uebung1;

public class Rechner {
	public static void main(String[] args) {
		double fzA = 5; // Länge von deinem Auto (Meter)
		double fzB = 15; // Länge des anderen Autos (Meter)
		double vA = 80; // Deine Geschwindigkeit (km/h)
		double vB = 70; // Geschwindigkeit des anderen Autos(km/h)
		System.out.println("Geschwindigkeit A: " + vA);
		System.out.println("Geschwindigkeit B: " + vB);
		System.out.println("Länge A: " + fzA);
		System.out.println("Länge B: " + fzB);
		
		double saA = vA / 2.0;
		double saB = vB / 2.0;
		System.out.println("Sicherheitsabstand 1: " + saA);
		System.out.println("Sicherheitsabstand 2: " + saB);
		
		double dRel = fzA + saA + fzB + saB;
		System.out.println("Relative Strecke:" + dRel + " Meter");
		
		double vRel = vA - vB;
		System.out.println("Relative Geschwindigkeit: " + vRel + " km/h");
		
		double t = (dRel * 3.6) / vRel;
		System.out.println("Benötigte Zeit: " + t + " Sekunden");
		
		double d = (t * vA) / 3.6;
		System.out.println("Ueberholweg: " + d + " Meter");
	}
}