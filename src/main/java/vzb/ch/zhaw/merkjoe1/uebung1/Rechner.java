package vzb.ch.zhaw.merkjoe1.uebung1;

public class Rechner {

	public static void main(String[] args) {
		
		double fzA = 5; 	// Länge von deinem Auto (Meter)
		double fzB = 5; 	// Länge des anderen Autos (Meter)
		double vA = 50; 	// Deine Geschwindigkeit (km/h)
		double vB = 30; 	// Geschwindigkeit des anderen Autos(km/h)
		double sa1 = 0;		// Sicherheitsabstand 1
		double sa2 = 0;		// Sicherheitsabstand 2
		double relStr = 0;	// Streckenrelativ
		double relGes = 0;	// Relative Geschwindigkeit
		double t = 0;		// Zeit
		double uehweg = 0;	// Überholweg
		
		// Operations
		
		sa1 = vA / 2;
		sa2 = vB / 2;
		relStr = fzA + fzB + sa1 + sa2;
		relGes = vA - vB;
		t = relStr * 3.6 / relGes;
		uehweg = t * vA / 3.6;
		
		// Console output
		
		System.out.println("Geschwindigkeit A: "+vA);
		System.out.println("Geschwindigkeit B: "+vB);
		System.out.println("Laenge A: "+fzA);
		System.out.println("Laenge B: "+fzB);
		System.out.println("Sicherheitsabstand 1: "+sa1);
		System.out.println("Sicherheitsabstand 2: "+sa2);	
		System.out.println("Relative Strecke: "+(fzA+fzB+sa1+sa2));
		System.out.println("Relative Geschwindigkeit: "+relGes);
		System.out.println("Benötigte Zeit: "+t);
		System.out.println("Ueberholweg: "+uehweg);
	}

}
	