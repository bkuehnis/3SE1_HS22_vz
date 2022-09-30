package vza.ch.zhaw.oezkasin.uebung1;


public class Rechner {

	public static void main(String[] args) {
		
		double fzA = 5;
		double fzB = 5;
		double vA = 50;
		double vB = 30;
		
		System.out.println("Geschwindigkeit A: "+vA);
		System.out.println("Geschwindigkeit B: "+vB);
		System.out.println("Länge A: "+fzA);
		System.out.println("Länge B: "+fzB);
		
		double s1 = vA / 2;
		double s2 = vB / 2;
		
		System.out.println("Sicherheitsabstand 1: "+s1);
		System.out.println("Sicherheitsabstand 2: "+s2);
		
		double StreckeRelativ = fzA + s1 + fzB + s2;
		System.out.println("Relative Strecke: "+StreckeRelativ);
		
		double GeschwindigkeitRelativ = vA - vB;
		System.out.println("Relative Geschwindigkeit: "+GeschwindigkeitRelativ+" km/h");
		
		double Zeit = StreckeRelativ * 3.6 / GeschwindigkeitRelativ;
		System.out.println("Benötigte Zeit: "+Zeit+" Sekunden");
		
		double Ueberholweg = Zeit * vA / 3.6;
		System.out.println("Ueberholweg: "+Ueberholweg+" Meter");
	}

}
