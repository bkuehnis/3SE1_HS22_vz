package vzb.ch.zhaw.durmibet.uebung1;


public class Rechner {
		 public static void main(String[] args) {
		 double fzA = 5; // Länge von deinem Auto (Meter)
		 double fzB = 5; // Länge des anderen Autos (Meter)
		 double vA = 50; // Deine Geschwindigkeit (km/h)
		 double vB = 30; // Geschwindigkeit des anderen Autos(km/h)
		 System.out.println("Geschwindigkeit A: "+vA);
		 System.out.println("Geschwindigkeit B: "+vB);
		 System.out.println("Länge A: "+fzA);
		 System.out.println("Länge B: "+fzB);
		 double s1 = 40; // Sicherheitsabstand 1 (Meter)
		 double s2 = 30; // Sicherheitsabstand 2 (Meter)
		 System.out.println("Sicherheitsabstand 1: "+(vA/2));
		 System.out.println("Sicherheitsabstand 2: "+(vB/2));
		 double StreckeRelativ = 95; // Strecke die zurückgelegt wird um still zu stehen (Meter)
		 System.out.println("Relative Strecke: "+(fzA+vA/2+fzB+vB/2));
		 double GeschwindigkeitRelativ = 10; // Geschwindigkeitsdifferenz (km/h)
		 System.out.println("Relative Geschwindigkeit: "+(vA-vB));
		 double Zeit = 34.2; // Zeit zum Überholen (Sekunden)
		 System.out.println("Benötigte Zeit: "+((fzA+vA/2+fzB+vB/2)*3.6/(vA-vB)));
		 double Ueberholweg = 760.0; // effektiver Ueberholweg (Meter)
		 System.out.println("Ueberholweg: "+((fzA+vA/2+fzB+vB/2)*3.6/(vA-vB)*vA/3.6));
		 
		 
		 
		 }
}
