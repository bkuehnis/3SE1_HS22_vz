package vza.ch.zhaw.zuercja2.uebung1;


public class Rechner {

	public static void main(String[] args) {
		
		double FzA = 5;  // länge meines Autos (Meter)
		double FzB = 15; // länge anderes Auto (Meter)
		double vA = 80;  // geschwindigkeit meines Autos (Kmh)
		double vB = 70;  // geschwindigkeit anderes Autos (Kmh)
		double Sa1 = vA/2; // sicherheitsabstand 1
		double Sa2 = vB/2; // sicherheitsabstand 2
		double SR = FzA + Sa1 + FzB + Sa2; // Strecke Relativ
		double VR = vA-vB; // Geschwindigkeit Relativ
		double Z = SR*3.6/VR; //benötigte Zeit
		double UW = Z*vA/3.6; // Ueberholweg
		
		System.out.println("Geschwindigkeit A: "+ vA);
		System.out.println("Geschwindigkeit B: "+ vB);
		System.out.println("Laenge A: "+ FzA);
		System.out.println("Laenge B: "+ FzB);
		System.out.println("Sicherheitsabstand 1: "+ Sa1);
		System.out.println("Sicherheitsabstand 2: "+ Sa2);
		System.out.println("Relative Strecke: "+ SR+" Meter");
		System.out.println("Relative Geschwindigkeit: "+ VR+" km/h");
		System.out.println("Benoetigte Zeit: "+ Z+" Sekunden");
		System.out.println("Ueberholweg: "+ UW+" Meter");
			

	}

}
