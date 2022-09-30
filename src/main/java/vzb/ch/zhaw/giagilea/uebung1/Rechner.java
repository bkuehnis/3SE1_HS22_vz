package vzb.ch.zhaw.giagilea.uebung1;


public class Rechner {
	
	public static void main (String[] args) {
		
		double fzA = 5; // Länge von deinem Auto (Meter)
		 double fzB = 5; // Länge des anderen Autos (Meter)
		 double vA = 50; // Deine Geschwindigkeit (km/h)
		 double vB = 30; // Geschwindigkeit des anderen Autos(km/h)
		 
		 double s1 = vA/2; // Berechnung Sicherheitsabstand 1
		 double s2 = vB/2; // Berechnung Sicherheitsabstand 2
		 double sR = fzA+s1+fzB+s2; // Berechnung relative Strecke
		 double gR = vA - vB; // Berechnung relative Geschwindigkeit
		 double uZ = (sR*3.6)/gR; // Berechnung Überholdauer
		 double uW = (uZ*vA)/3.6; // Berechnung Überholweg
		 
		 System.out.println("Geschwindigkeit A: "+vA);
		 System.out.println("Geschwindigkeit B: "+vB);
		 System.out.println("Länge A: "+fzA);
		 System.out.println("Länge B: "+fzB);
		 System.out.println("Sicherheitsabstand 1: "+ s1);
		 System.out.println("Sicherheitsabstand 2: "+ s2);
		 System.out.println("Relative Strecke: "+ sR);
		 System.out.println("Relative Geschwindigkeit: "+gR+" km/h");
		 System.out.println("Benötigte Zeit: "+uZ+" Sekunden");
		 System.out.println("Ueberholweg: "+uW+" Meter");
		 // Hier kommt die Lösung der Aufgabe hin..
		 
	}
}
