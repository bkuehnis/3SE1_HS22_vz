package vzb.ch.zhaw.truemjul.uebung1;


public class Rechner {

	public static void main(String[] args) { 
			double fzA = 5; // Länge von deinem Auto (Meter)
			double fzB = 5; // Länge des anderen Autos (Meter)
			double vA = 50; // Deine Geschwindigkeit (km/h)
			double vB = 30; // Geschwindigkeit des anderen Autos(km/h)
			
			double vA1 = (vA / 2);
			double vA2 = (vB / 2);
			double sRel = fzA + vA1 + fzB + vA2;
			
			double Geschwrel = vA - vB;
			
			double Benz = (sRel * 3.6) / Geschwrel;
			
			double UEweg = (Benz * vA) / 3.6;
			
			System.out.println("Geschwindigkeit A: "+vA);
			System.out.println("Geschwindigkeit B: "+vB);
			System.out.println("Länge A: "+fzA);
			System.out.println("Länge B: "+fzB);
			
			System.out.println("Sicherheitsabstand 1 : "+ vA1);
			System.out.println("Sicherheitsabstand 2 : "+ vA2);
			
			System.out.println("Relative Strecke: "+ sRel + " Meter");
			
			System.out.println("Relative Geschwindigkeit :"+ Geschwrel + " Km/h");
			
			System.out.println("Benötigte Zeit : " + Benz + " Sekunden");
			
			System.out.println("Ueberhohlweg : " + UEweg + " Meter");
			
			// Hier kommt die Lösung der Aufgabe hin...
			
		// TODO Auto-generated method stub

	}

}
