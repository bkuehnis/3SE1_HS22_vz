package vza.ch.zhaw.vuchl001.uebung1;


public class Rechner {

	public static void main(String[] args) {
		 double fzA = 4.5; // Länge von deinem Auto (Meter)
		 double fzB = 15.5; // Länge des anderen Autos (Meter)
		 double vA = 80; // Deine Geschwindigkeit (km/h)
		 double vB = 60; // Geschwindigkeit des anderen Autos(km/h)
		 System.out.println("Geschwindigkeit A: "+vA);
		 System.out.println("Geschwindigkeit B: "+vB);
		 System.out.println("Länge A: "+fzA);
		 System.out.println("Länge B: "+fzB);
		 // Hier kommt die Lösung der Aufgabe hin...
		 double S1 = vA/2;
		 double S2 = vB/2;
		 System.out.println("Sicherheitsabstand 1: "+S1);
		 System.out.println("Sicherheitsabstand 2: "+S2);
		 double StreckeRelativ = fzA + S1 + fzB + S2;
		 System.out.println("Relative Strecke: " + StreckeRelativ);
		 double GeschwindigkeitRelativ = vA - vB;
		 System.out.println("Relative Geschwindigkeit: " + GeschwindigkeitRelativ + "km/h");
		 double Zeit = StreckeRelativ * 3.6 / GeschwindigkeitRelativ;
		 System.out.println("Benötigte Zeit: " + Zeit + " Sekinden");
		 double Ueberholweg = Zeit * vA / 3.6;
		 System.out.println("Ueberholweg: " + Ueberholweg + " Meter");
		 
	 }

}
