package vza.ch.zhaw.streiluc.uebung1;


public class UeberholwegZeit {

	public static void main(String[] args) {
		double fzA = 4.5; // Länge von deinem Auto (Meter)
		double fzB = 15.5; // Länge des anderen Autos (Meter)
		double vA = 80; // Deine Geschwindigkeit (km/h)
		double vB = 60; // Geschwindigkeit des anderen Autos(km/h)
		
		double s1 = vA/2;
		double s2 = vB/2;
		double streckeRelativ= fzA+s1+fzB+s2;
		double relativeGeschwindigkeit = vA-vB;
		double zeit = (streckeRelativ*3.6)/relativeGeschwindigkeit;
		double uweg= (zeit*vA)/3.6;
		
		System.out.println("Geschwindigkeit A: "+vA);
		System.out.println("Geschwindigkeit B: "+vB);
		System.out.println("Länge A: "+fzA);
		System.out.println("Länge B: "+fzB);
		System.out.println("Sicherheitsabstand 1: "+s1);
		System.out.println("Sicherheitsabstand 2: "+s2);
		System.err.println("Relative Strecke :"+streckeRelativ);
		System.out.println("Relative Geschwindigkeit: "+relativeGeschwindigkeit);
		System.out.println("Zeit: "+zeit);
		System.out.println("Ueberholweg: "+uweg);


	}

}
