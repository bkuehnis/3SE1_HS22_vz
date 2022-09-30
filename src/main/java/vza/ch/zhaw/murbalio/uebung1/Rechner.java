package vza.ch.zhaw.murbalio.uebung1;


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
		 System.out.println("Sicherheitsabstand 1: "+(vA/2));
		 System.out.println("Sicherheitsabstand 2: "+(vB/2));
		
		 double S1 = (vA/2);
		 double S2 = (vB/2);
		 
		 System.out.println("Relative Strecke: "+(fzA+S1+fzB+S2)+" Meter");
		 System.out.println("Relative Geschwindigkeit: "+(vA-vB)+" km/h");
		 
		 double StreckeRelativ = (fzA+S1+fzB+S2);
		 double GeschwindigkeitRelativ = (vA-vB);
		 
		 System.out.println("Benötigte Zeit: "+((StreckeRelativ*3.6)/GeschwindigkeitRelativ)+" Sekunden");
		 
		 double Zeit = StreckeRelativ*3.6/GeschwindigkeitRelativ;
		 
		 System.out.println("Ueberholweg: "+(Zeit*vA/3.6)+" Meter");
		 
		 
		 
		 
		
		 
		 
		 // Hier kommt die Lösung der Aufgabe hin...

	}

}
