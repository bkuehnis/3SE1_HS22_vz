package vzb.ch.zhaw.drarre01.uebung1;


public class Rechner {

	public static void main(String[] args) {
		
		double fzA = 5;
		double fzB = 5;
		double vA = 50;
		double vB = 30;
		
		double s1 = vA/2;
		double s2 = vB/2;
		
		double streckeRelativ = fzA + s1 + fzB + s2;
		
		double vRelativ = vA - vB;
		double zeit = streckeRelativ * 3.6 /vRelativ;
		double ueberholweg = zeit*vA/3.6;
		
		
		
		
		
		System.out.println("Geschwindigkeit A: "+vA);
		System.out.println("Geschwindigkeit B: "+vB);
		System.out.println("Länge A: "+fzA);
		System.out.println("Länge B: "+fzB);
		System.out.println("Sicherheitsabstand 1: "+s1+" Meter");
		System.out.println("Sicherheitsabstand 2: "+s2+" Meter");
		System.out.println("Relative Strecke: "+ streckeRelativ+" Meter");
		System.out.println("Relative Geschwindigkeit: "+vRelativ+" km/h");
		System.out.println("Benötigte Zeit: "+zeit+" Sekunden");
		System.out.println("Ueberholweg: "+ueberholweg+" Meter");
		
		
		

	}

}
