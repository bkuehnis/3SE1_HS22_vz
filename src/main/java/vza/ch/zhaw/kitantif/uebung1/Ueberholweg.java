package vza.ch.zhaw.kitantif.uebung1;


public class Ueberholweg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double fzA = 5;  //Länge Fahrzeug A
		double fzB = 15;  //Länge Fahrzeug B
		double vA = 80;  //Geschwindigkeit A
		double vB = 70;  // Geschwindigkeit B
		
		double s1 = vA/2; //Sicherheitsabstand 1 FZ A
		double s2 = vB/2;  // Sicherheitsabstand 2 FZ B
		
		double rs = fzA + s1 + fzB + s2; // Relativestrecke
		
		double rg = vA-vB; //Relative Geschwindigkeit
		
		double bz = (rs * 3.6) / rg;  // Benötigte Zeit
		
		double uw = (vA * bz) / 3.6;  //Ueberholweg 
		
		System.out.println("Geschwindigkeit A: "+vA);
		System.out.println("Geschwindigkeit B: "+vB);
		System.out.println("Länge A: "+fzA);
		System.out.println("Länge B: "+fzB);
        System.out.println("Sicherheitsabstand 1: "+s1);
        System.out.println("Sicherheitsabstand 2: "+s2);
        System.out.println("Relativestrecke: "+rs);
        System.out.println("Relativegeschwindigkeit: "+rg);
        System.out.println("Benötigte Zeit: "+bz);
        System.out.println("Ueberholweg: "+uw);
        
		
	}

}
