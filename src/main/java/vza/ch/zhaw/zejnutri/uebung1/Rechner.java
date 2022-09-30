package vza.ch.zhaw.zejnutri.uebung1;


public class Rechner {

	public static void main(String[] args) {
		
		double fzA = 5;		// Länge von deinem Auto (Meter)
		double fzB = 5;	// Länge des anderen Auos (Meter)
		double vA = 50;		// Deine Geschwindigkeit (km/h)
		double vB = 30;		// Geschwindigkeit des anderen Autos (km/h)
		
		System.out.println("Geschwindigkeit A: "+vA);
		System.out.println("Geschwindigkeit B: "+vB);
		System.out.println("Länge A: "+fzA);
		System.out.println("Länge B: "+fzB);
		
		double S1 = vA/2;	// Sicherheitsabstand von deinem Auto (Meter)
		double S2 = vB/2;	// Sicherheitsabstand des anderen Autos (Meter)
		
		System.out.println("Sicherheitsabstand 1: "+S1);
		System.out.println("Sicherheitsabstand 2: "+S2);
		
		double StreckeRelativ = fzA + S1 + fzB + S2;
		System.out.println("Relative Strecke: "+StreckeRelativ+" Meter");
		
		double GeschwindigkeitRelativ = vA - vB;
		System.out.println("Relative Geschwindigkeit: "+GeschwindigkeitRelativ+" km/h");
		
		double Zeit = StreckeRelativ * 3.6/GeschwindigkeitRelativ;
		System.out.println("Zeit: "+Zeit+" Sekunden");
		
		double Ueberholweg = Zeit * vA / 3.6;
		System.out.println("Ueberholweg: "+Ueberholweg+" Meter");
		
		
		
		
		
		
	}

}
