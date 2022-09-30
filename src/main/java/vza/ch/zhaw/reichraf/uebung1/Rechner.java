package vza.ch.zhaw.reichraf.uebung1;


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
		 
		 double sa11 = vA/2;
		 double sa12 = vB/2;
		 
		 System.out.println("Sicherheitsabstand 1: "+ sa11);
		 System.out.println("Sicherheitsabstand 2: "+ sa12);
		 
		 
		 double rs = fzA + fzB + sa11 + sa12;
		 System.out.println("Relative Strecke: " + rs + " Meter");
		 
		 double rg = vA - vB;
		 
		 System.out.println("Relative Geschwindigkeit: " + rg +" km/h");
		 
		 double zeit = (rs*3.6)/rg;
		 
		 System.out.println( "Benötigte Zeit: " + zeit + " Sektunden");
		 
		 double üw = (zeit * vA)/3.6;
		 
		 System.out.println("Ueberholweg: " + üw + "Meter");
		 
		 }
	}