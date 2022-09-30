package vzb.ch.zhaw.landsfre.uebung1;

public class Rechner {

	public static void main(String[] args) {
		
		double fzA = 5; // Länge von deinem Auto (Meter)
		double fzB = 5; // Länge des anderen Autos (Meter)
		double vA = 50; // Deine Geschwindigkeit (km/h)
		double vB = 30; // Geschwindigkeit des anderen Autos(km/h)
		double S1 = vA / 2;
		double S2 = vB / 2;
		double StreckeRelativ = fzA + S1 + fzB + S2;
		double GeschwindigkeitRelativ = vA - vB;
		double Zeit = StreckeRelativ * 3.6 / GeschwindigkeitRelativ;
		double Ueberholweg = Zeit * vA / 3.6;
				
		System.out.println("Geschwindigkeit A: "+vA);
		System.out.println("Geschwindigkeit B: "+vB);
		System.out.println("Länge A: "+fzA);
		System.out.println("Länge B: "+fzB);
		System.out.println("Sicherheitsabstand 1: "+S1);
		System.out.println("sicherheitsabstand 2: "+S2);			
		System.out.println("Relative Strecke: "+StreckeRelativ);	
		System.out.println("RelativeGeschwindigkeit: "+GeschwindigkeitRelativ);
		System.out.println("Benötigte Zeit: "+Zeit);
		System.out.println("Ueberholweg: "+Ueberholweg+" Meter");
			
	}

}
