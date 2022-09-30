package vzb.ch.zhaw.mulahham.uebung1;


public class Rechner {

	public static void main(String[] args) {
		
		double fzA = 5; // Länge von deinem Auto (Meter)
		double fzB = 5; // Länge des anderen Autos (Meter)

		double vA = 50; // Deine Geschwindigkeit (km/h)
		double vB = 30; // Geschwindigkeit des anderen Autos(km/h)
		double vRel = vA - vB;

		double s1 = vA / 2; // Sicherheitsabstand vor dem Überholen (Meter)
		double s2 = vB / 2; // Sicherheitsabstand nach dem Überholen (Meter)
		double sRel = fzA + s1 + fzB + s2; // Relativer Abstand zwischen den Fahrzeugen (Meter)
		
		double t = sRel * 3.6 / vRel; // Benötigte Zeit zum Überholen (Sekunden)
		
		double sEff = t * vA / 3.6; // Effektive Strecke beim Überholen (Sekunden)

		
		System.out.println("Geschwindigkeit A: "+vA);
		System.out.println("Geschwindigkeit B: "+vB);
		
		System.out.println("Länge A: "+fzA);
		System.out.println("Länge B: "+fzB);
		
		System.out.println("Sicherheitsabstand 1: "+s1);
		System.out.println("Sicherheitsabstand 2: "+s2);
		
		System.out.println("Relative Strecke: "+sRel+" Meter");
		System.out.println("Relative Geschwindigkeit: "+vRel+" km/h");
		
		System.out.println("Benötigte Zeit: "+t+" Sekunden");
		
		System.out.println("Überholweg: "+sEff+" Meter");
		
		
		
		

	}

}
