package vza.ch.zhaw.baechni2.uebung1;


public class Rechner {

	public static void main(String[] args) {
		double fzA = 5; // Länge von deinem Auto (Meter)
		double fzB = 15; // Länge des anderen Autos (Meter)
		double vA = 80; // Deine Geschwindigkeit (km/h)
		double vB = 70; // Geschwindigkeit des anderen Autos(km/h)
		System.out.println("Geschwindigkeit A: "+vA);
		System.out.println("Geschwindigkeit B: "+vB);
		System.out.println("Länge A: "+fzA);
		System.out.println("Länge B: "+fzB);
		
		// Lösung unten hin
		double S1 = vA/2; //Sicherheitsabstand 1
		double S2 = vB/2; // Sicherheitsabstand 2
		System.out.println("Sicherheitsabstand 1: "+ S1);
		System.out.println("Sicherheitsabstand 2: "+ S2);
		
		// d)
		double StreckeRelativ = fzA+S1+fzB+S2;
		System.out.println("Relative Strecke: "+ StreckeRelativ);
		
		// e)
		double GeschwindigkeitRelativ = vA-vB;
		System.out.println("Relative Geschwindigkeit: "+ GeschwindigkeitRelativ);
		
		// f)
		double Zeit = (StreckeRelativ * 3.6)/GeschwindigkeitRelativ;
		System.out.println("Benötigte Zeit: "+ Zeit);
		
		// g)
		double Ueberholweg = (Zeit*vA)/3.6;
		System.out.println("Ueberholweg: "+Ueberholweg);	
		
	}
}