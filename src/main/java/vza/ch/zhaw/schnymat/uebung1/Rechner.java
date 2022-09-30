package vza.ch.zhaw.schnymat.uebung1;


public class Rechner {
	
	public static void main(String[] args) {
		 double fzA = 5; // Länge von deinem Auto (Meter)
		 double fzB = 5; // Länge des anderen Autos (Meter)
		 double vA = 50; // Deine Geschwindigkeit (km/h)
		 double vB = 30; // Geschwindigkeit des anderen Autos(km/h)
		 System.out.println("Geschwindigkeit A: "+vA);
		 System.out.println("Geschwindigkeit B: "+vB);
		 System.out.println("Länge A: "+fzA);
		 System.out.println("Länge B: "+fzB);

		 // Hier kommt die Lösung der Aufgabe hin...
		
		 double s1 = (vA/2); // Sicherheitsabstand Auto 1
		 double s2 = (vB/2); // Sicherheitsabstand Auto 2
		 System.out.println("Sicherheitsabstand 1: " + s1);
		 System.out.println("Sicherheitsabstand 2: "+ s2);
		 
		 // Hier wird die relative Strecke berechnet und ausgegeben.
		 double relStrecke = fzA + s1 + fzB + s2;
		 System.out.println("Relative Strecke: "+ relStrecke + " Meter");
		 
		 // Hier wird die relative Geschwindigkeit berechent und ausgegeben.
		 double relGeschw = vA - vB;
		 System.out.println("Relative Geschwindigkeit: "+ relGeschw + " km/h");
		 
		 //Hier wird die Zeit die zum Ueberholen gebraucht wird berechnet.
		 
		 double ueberholZeit = (relStrecke * 3.6) / relGeschw;
		 
		 System.out.println("Benötigte Zeit: "+ ueberholZeit + " Sekunden");
		 
		 //Hier wird der effektive Ueberholweg berechnet
		 double ueberholWeg = (ueberholZeit * vA) / 3.6;
		 System.out.println("Ueberholweg: " + ueberholWeg + " Meter");
		 }
}
