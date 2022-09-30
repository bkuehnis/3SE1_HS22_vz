package vza.ch.zhaw.eglofpau.uebung1;


public class Rechner {

	public static void main(String[] args) {
		double fzA = 5;
		double fzB = 5;
		double vA = 50;
		double vB = 30;
		
		System.out.println("Geschwindigkeit A: "+vA);
		System.out.println("Geschwindigkeit B"+vB);
		System.out.println("Länge A: "+fzA);
		System.out.println("Länge B: "+fzB);
		
		double s1 = vA / 2;
		double s2 = vB / 2;
		double RS1 = fzA + s1 + fzB + s2;
		double RG = vA - vB;
		double BZ = RS1 * 3.6 / RG;
		double U = BZ * vA / 3.6;
		
		
		System.out.println("Sicherheitsabstand 1: "+s1);
		System.out.println("Sicherheitsabstand 2: "+s2);
		System.out.println("Relative Strecke: "+RS1+" Meter");
		System.out.println("Realtive GEschwindigkeit: "+RG+" km/h");
		System.out.println("Benötigte Zeit: "+BZ+" Sekunden");
		System.out.println("Ueberholweg: "+U+" Meter");
		
	}

}
