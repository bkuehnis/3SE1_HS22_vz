package vza.ch.zhaw.weberth6.uebung1;


public class Ueberholweg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double fzA = 4.5;
		double fzB = 15.5;
		double vA = 80;
		double vB = 60;
		double S1 = vA/2;
		double S2 = vB/2;
		double StreckeRelativ = fzA+S1+fzB+S2;
		double GeschwindigkeitRelativ = vA-vB;
		double BenötigteZeit = StreckeRelativ*3.6/GeschwindigkeitRelativ;
		double Ueberholweg = BenötigteZeit*vA/3.6;
		
		
	
		
		System.out.println("Geschwindigkeit A: "+vA);
		System.out.println("Geschwindikeit B: "+vB);
		System.out.println("Länge A: "+fzA);
		System.out.println("Länge B: "+fzB);
		System.out.println("Sicherheitsabstand 1: "+S1);
		System.out.println("Sicherheitsabstand 2: "+S2);
		System.out.println("Relative Strecke: "+StreckeRelativ);
		System.out.println("Relative Geschwindigkeit: "+GeschwindigkeitRelativ);
		System.out.println("Benötigte Zeit: "+BenötigteZeit);
		System.out.println("Überholweg: "+Ueberholweg);
		
		
		
		
		
		
		
	
		

	}

}
