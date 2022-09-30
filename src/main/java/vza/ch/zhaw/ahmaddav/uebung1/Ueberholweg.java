package vza.ch.zhaw.ahmaddav.uebung1;


public class Ueberholweg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double fzA = 5; // Länge von deinem Auto (Meter)
		double fzB = 5; // Länge des anderen Autos (Meter)
		double vA = 120; // Deine Geschwindigkeit (km/h)
		double vB = 80; // Geschwindigkeit des anderen Autos(km/h)
		 
		 System.out.println("Geschwindigkeit A: "+vA);
		 System.out.println("Geschwindigkeit B: "+vB);
		 System.out.println("Länge A: "+fzA);
		 System.out.println("Länge B: "+fzB);

		double S1 = vA / 2;
		double S2 = vB / 2;
		
		
		System.out.println("Sicherheitsabstand 1: " +  S1);
		System.out.println("Sicherheitsabstand 2: " +  S2);
		
		double RelativeStrecke = fzA + S1 + fzB + S2;
		System.out.println("Relative Strecke: " + RelativeStrecke + " Meter");
		
		
	double GR = vA - vB;
	System.out.println("Relative Geschwindigkeit: " + GR + " km/H");
	
	double BZ = (RelativeStrecke / GR)*3.6;
	System.out.println("Benötigte Zeit: " + BZ + " Sekunden");
		
	double UW = (BZ / 3.6) * vA;
	System.out.println("Ueberholweg: " + UW + " Meter");
		
		
		
		
	}

}
