package vza.ch.zhaw.kamaldil.uebung1;


/* 	
 	fzA  = Die Länge deines Autos (Meter)
	fzB = Die Länge des zu überholenden Autos (Meter)
	vA = Deine Geschwindigkeit (km/h)
	vB = Die Geschwindigkeit des zu überholenden Autos (km/h)
	*/

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
// Hier kommt die Lösung der Aufgabe hin...
		
		double S1 = vA/2;
		double S2 = vB/2;

	System.out.println("Sicherheitsabstand 1: " + S1);
	System.out.println("Sicherheitsabstand 2: " + S2);
	

	double Sr = fzA + S1 + fzB + S2;
	System.out.println("relative Strecke: " + Sr + " Meter");
	

	double rG = vA-vB;
	System.out.println("relative Geschwindigkeit: " + rG + " km/h");
	

	double bZ = Sr*3.6/rG;
	System.out.println("benötigte Zeit " + bZ + " Sekunden");
	
	

	double Uw = bZ*vA/3.6;
	System.out.println("Überholweg " + Uw + " Meter");
	}
}

