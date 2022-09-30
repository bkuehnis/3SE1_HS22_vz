package vza.ch.zhaw.gavindom.uebung1;


public class Rechner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 double fzA = 5; // Länge von deinem Auto (Meter)
		 double fzB = 5; // Länge des anderen Autos (Meter)
		 double vA = 50; // Deine Geschwindigkeit (km/h)
		 double vB = 30; // Geschwindigkeit des anderen Autos(km/h)
		 double s1 = vA / 2;
		 double s2 = vB / 2;
		 double StreckeRelativ = fzA + s1 + fzB + s2;
		 double GeschwindigkeitRelativ = vA - vB;
		 double Zeit = (StreckeRelativ * 3.6) / GeschwindigkeitRelativ;
		 double Ueberholweg = (Zeit * vA) / 3.6;
		 
		 System.out.println("Geschwindigkeit A: "+vA);
		 System.out.println("Geschwindigkeit B: "+vB);
		 
		 System.out.println("Länge A: "+fzA);
		 System.out.println("Länge B: "+fzB);
		 
		 System.out.println("Sicherheitsabstand 1: "+ s1);
		 System.out.println("Sicherheitsabstand 2: "+ s2);
		 
		 System.out.println("Relative Strecke: " + StreckeRelativ + " Meter");
		 
		 System.out.println("Relative Geschwindigkeit: "+ GeschwindigkeitRelativ + " km/h");
		 System.out.println("Benoetigte Zeit: "+ Zeit + " Sekunden");
		 
		 System.out.println("Ueberholweg: "+ Ueberholweg + " Meter");
	}

}
