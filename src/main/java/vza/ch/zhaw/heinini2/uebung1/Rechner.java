package vza.ch.zhaw.heinini2.uebung1;


public class Rechner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double fzA = 5; // Länge von deinem Auto (Meter)
		double fzB = 5; // Länge des anderen Autos (Meter)
		double vA = 50; // Deine Geschwindigkeit (km/h)
		double vB = 30; // Geschwindigkeit des anderen Autos(km/h)
		
		
		System.out.println("Geschwindigkeit A: "+vA);
		System.out.println("Geschwindigkeit B: "+vB);
		System.out.println("Länge A: "+fzA);
		System.out.println("Länge B: "+fzB);
		// Hier kommt die Lösung der Aufgabe hin..
		double sA1 = vA/2;
		double sA2 = vB/2;
		System.out.println("Sicherheitsabstand 1: "+sA1);
		System.out.println("Sicherheitsabstand 2: "+sA2);
		
		double StreckeRelativ = fzA+sA1+fzB+sA2;
		System.out.println("Relative Strecke: "+StreckeRelativ+" Meter");
		
		double vRelativ = vA-vB;
		System.out.println("Relative Geschwindigkeit: "+vRelativ+" km/h");
		
		double zeit = StreckeRelativ* 3.6 / vRelativ;
		System.out.println("Benötigte Zeit: "+zeit+" Sekunden");
		
		double ueberholweg= zeit*vA/3.6;
		System.out.println("Ueberholweg: "+ueberholweg+" Meter");
		
	}

}
