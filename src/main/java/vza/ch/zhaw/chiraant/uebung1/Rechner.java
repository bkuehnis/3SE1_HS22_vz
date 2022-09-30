package vza.ch.zhaw.chiraant.uebung1;


public class Rechner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double fzA = 5; // Länge von deinem Auto (Meter)
		double fzB = 5; // Länge des anderen Autos (Meter)
		double vA = 120; // Deine Geschwindigkeit (km/h)
		double vB = 80; // Geschwindigkeit des anderen Autos(km/h)
		double s1= vA/2; // Strecke 1
		double s2= vB/2; // Strecke 2
		double fzL = fzA+fzB; // Fahrzeuglänge addiert
		double fzLS = fzL + s1 +s2; // Gesamte Strecke
		double vAs = vA/3.6; //Geschwindigkeit A in m/s
		double vBs = vB/3.6; //Geschwindigkeit B in m/s
		double vDif = vAs-vBs; //Relative geschwindigkeit
		double tS = fzLS/vDif; // Zeit in Sekunden
		double uH = tS*vA/3.6; //ueberholweg
		System.out.println("Geschwindigkeit A: "+vA);
		System.out.println("Geschwindigkeit B: "+vB);
		System.out.println("Länge A: "+fzA);
		System.out.println("Länge B: "+fzB);
		System.out.println("Sicherheitsabsstand 1: "+s1);
		System.out.println("Sicherheitsabsstand 2: "+s2);
		System.out.println("Relative Strecke:" +fzLS);
		System.out.println("Relative Geschwindigkeit: "+vDif*3.6);
		System.out.println("Benötigte Zeit: "+tS);
		System.out.println("Ueberholweg: "+uH);
		
	}

}
