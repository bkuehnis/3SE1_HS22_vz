package vzb.ch.zhaw.celikezg.uebung1;


public class Rechner {

	public static void main(String[] args) {
		double fzA = 5;
		double fzB = 5;
		double vA = 50;
		double vB = 30;
		
		double rS = fzA+(vA/2)+fzB+(vB/2);
		double rG = vA-vB;
		double Zeit = rS*3.6/rG;
		double Weg = Zeit*vA/3.6;
		
		System.out.println("Geschwindigkeit A: "+vA);
		System.out.println("Geschwindigkeit B; "+vB);
		System.out.println("Laenge A: "+fzA);
		System.out.println("Laenge B: "+fzB);
		
		System.out.println("Sicherheitsabstand 1: "+vA/2);
		System.out.println("Sicherheitsabstand 2: "+vB/2);
		
		System.out.println("Relative Strecke: "+rS+" Meter");
		System.out.println("Relative Geschwindigkeit: "+rG+" km/h");
		System.out.println("Benoetigte Zeit: "+Zeit+" Sekunden");
		System.out.println("Ueberholweg: "+Weg+" Meter");
		

	}

}
