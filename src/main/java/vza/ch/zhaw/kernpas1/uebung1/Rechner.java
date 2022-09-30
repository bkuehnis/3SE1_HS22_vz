package vza.ch.zhaw.kernpas1.uebung1;


public class Rechner {

	public static void main(String[] args) {
		
		double fzA = 5; // Länge von deinem Auto (Meter
		double fzB = 5; // Länge des anderen Autos (Meter)
		double vA = 50; // Deine Geschwindigkeit (km/h)
		double vB = 30; // Geschwindigkeit des anderen Autos(km/h)
		double S1 = vA/2; // Sicherheitsabstand S1
		double S2 = vB/2; // Sicherheitsabstand S2
		double SR = fzA+S1+fzB+S2; // StreckeRelativ
		double GR = vA-vB; // Geschwindigkeit Relativ
		double Z= SR*3.6/GR; // Zeit zum Überholen
		double Ü= Z*vA/3.6; // Überholweg
		
		System.out.println("Geschwindigkeit A: "+vA);
		System.out.println("Geschwindigkeit B: "+vB);
		System.out.println("Länge A: "+fzA);
		System.out.println("Länge B: "+fzB);
		System.out.println("Sicherheitsabstand 1: "+S1);
		System.out.println("Sicherheitsabstand 2: "+S2);
		System.out.println("Relative Strecke: "+SR+" Meter");
		System.out.println("Relative Geschwindigkeit: "+GR+" km/h");
		System.out.println("Benötigte Zeit: "+Z+" Sekunden");
		System.out.println("Überholweg: "+Ü+" Meter");
	}

}
