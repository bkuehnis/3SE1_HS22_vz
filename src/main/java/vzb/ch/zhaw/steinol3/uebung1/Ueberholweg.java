package vzb.ch.zhaw.steinol3.uebung1;


public class Ueberholweg {
	public static void main(String[] args) {
		
	double fzA = 5; // Länge von deinem Auto (Meter)
	double fzB = 5; // Länge des anderen Autos (Meter)
	double vA = 50; // Deine Geschwindigkeit (km/h)
	double vB = 30; // Geschwindigkeit des anderen Autos(km/h)
	double s1 = vA / 2;
	double s2 = vB / 2;
	double sr = fzA + fzB + s1 + s2;
	double rg = vA - vB;
	double time = (sr * 3.6) / rg;
	double distance = (time * vA) / 3.6;
	System.out.println("Geschwindigkeit A: "+vA);
	System.out.println("Geschwindigkeit B: "+vB);
	System.out.println("Länge A: "+fzA);
	System.out.println("Länge B: "+fzB);
	System.out.println("Sicherheitsabstand 1: " + s1);
	System.out.println("Sicherheitsabstand 2: " + s2);
	System.out.println("Relative Strecke: " + sr);
	System.out.println("Relative Geschwindigkeit: " + rg);
	System.out.println("Relative Zeit: " + time + " Sekunden");
	System.out.println("Ueberholweg: " + distance + " Meter");
	// Hier kommt die Lösung der Aufgabe hin...
		}
	}