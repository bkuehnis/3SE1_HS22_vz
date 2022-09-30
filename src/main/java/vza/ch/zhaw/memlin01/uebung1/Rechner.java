package vza.ch.zhaw.memlin01.uebung1;


public class Rechner {

	public static void main(String[] args) {
		
		double fzA = 5;
		double fzB = 5;
		double vA = 50;
		double vB = 30;
		double S1 = vA/2;
		double S2 = vB/2;
		double RelativeStrecke =  (fzA + S1 + fzB + S2);
		double RelativeG = (vA - vB);
		double Zeit = ((RelativeStrecke * 3.6)/RelativeG);
		double Ueberhohlweg = ((Zeit * vA) / 3.6);
		
		System.out.println("Geschwindigkeit A: " + vA);
		System.out.println("Geschwindigkeit B: "+vB);
		System.out.println("Länge A: "+fzA);
		System.out.println("Länge B: "+fzB);
		System.out.println("Sicherheitsabstand 1: " + S1);
		System.out.println("Sicherheitsabstand 2: " + S2);
		System.out.println("Relative Strecke: " + RelativeStrecke + " Meter");
		System.out.println("Relative Geschwindigkeit: " + RelativeG + " km/h");
		System.out.println("Benötigte Zeit: " + Zeit + " Sekunden");
		System.out.println("Ueberhohlweg: " + Ueberhohlweg + " Meter");
		
	}

}
