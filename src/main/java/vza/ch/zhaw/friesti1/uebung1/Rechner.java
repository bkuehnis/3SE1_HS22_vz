package vza.ch.zhaw.friesti1.uebung1;


public class Rechner {
	 public static void main(String[] args) {
		 double fzA = 5; // Länge von deinem Auto (Meter)
		 double fzB = 5; // Länge des anderen Autos (Meter)
		 double vA = 120; // Deine Geschwindigkeit (km/h)
		 double vB = 80; // Geschwindigkeit des anderen Autos(km/h)
		 System.out.println("Geschwindigkeit A: "+vA);
		 System.out.println("Geschwindigkeit B: "+vB);
		 System.out.println("Länge A: "+fzA);
		 System.out.println("Länge B: "+fzB);
		 // Hier kommt die Lösung der Aufgabe hin...
		 
		 double saA = vA / 2;
		 double saB = vB / 2;
		 double rs = fzA + saA + fzB + saB;
		 double rg = vA - vB;
		 double time = rs * 3.6 / rg;
		 double ueW = time * vA / 3.6;
		 System.out.println("Sicherheitsabstand 1: "+ saA);
		 System.out.println("Sicherheitsabstand 2: "+ saB);
		 System.out.println("Relative Strecke: "+ rs + " Meter");
		 System.out.println("Relative Geschwindigkeit: "+ rg + " km/h");
		 System.out.println("Benötigte Zeit: "+ time + " Sekunden");
		 System.out.println("Ueberholweg: "+ ueW + " Meter");
	 }
}
