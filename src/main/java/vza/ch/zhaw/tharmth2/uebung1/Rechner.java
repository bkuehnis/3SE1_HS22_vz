package vza.ch.zhaw.tharmth2.uebung1;

public class Rechner {

	public static void main(String[] args) {
	
		double fzA = 5;
		double fzB = 5;
		double vA = 50;
		double vB = 30;
		double S1 = vA/2;
		double S2 = vB/2;
		double StreckeRelativ= fzA+S1+fzB+S2;
		double GeschwindigkeitsRelativ = vA - vB;
		double BenoetigteZeit = StreckeRelativ*3.6/GeschwindigkeitsRelativ;
		double Zeit = 9;
		double Ueberholweg = Zeit*vA/3.6;
		
		
		
				
		System.out.println("Geschwindigkeit A: "+vA);
		System.out.println("Geschwindigkeit B: "+vB);
		System.out.println("Laenge A: "+fzA);
		System.out.println("Laenge B: "+fzB);
		System.out.println("Sicherheitsabstand 1: "+S1);
		System.out.println("Sicherheitsabstand 2: "+S2);
		System.out.println("Relative Strecke: "+StreckeRelativ);
		System.out.println("GeschwindigkeitsRelativ: "+GeschwindigkeitsRelativ);
		System.out.println("BenoetigteZeit: "+BenoetigteZeit);
		System.out.println("Ueberholweg: "+Ueberholweg);
					
	}
}
