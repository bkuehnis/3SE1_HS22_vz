package vza.ch.zhaw.loretyan.uebung1;


public class Rechner {

	public static void main(String[] args) {

		double fzA = 5; // Länge von deinem Auto (Meter)
		double fzB = 15; // Länge des anderen Autos (Meter)
		double vA = 80; // Deine Geschwindigkeit (km/h)
		double vB = 60; // 	Geschinwigkeit des anderen Autos (km/h)
		
		System.out.println("Geschwindigkeit A: "+vA);
		System.out.println("Geschwindigkeit B: "+vB);
		System.out.println("Länge A: "+fzA);
		System.out.println("Länge B: "+fzB);
		
		double s1 = vA/2;
		double s2 = vB/2;
		
		System.out.println("Sicherheitsabstand 1: "+s1);
		System.out.println("Sicherheitsabstand 2: "+s2);
		
		double rS = fzA+s1+fzB+s2;
		
		System.out.println("Relative Strecke: "+rS+" Meter");
		
		double gR = vA-vB;
		
		System.out.println("Relative Geschwindigkeit: "+gR+" km/h");
		
		double zT = (rS*3.6)/gR;
		
		System.out.println("Benötigte Zeit: "+zT+" Sekunden");
		
		double uW = (zT*vA)/3.6;
		
		System.out.println("Ueberholweg: "+uW+" Meter");
		
	}

}
