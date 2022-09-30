package vza.ch.zhaw.kuralsar.uebung1;


public class Ueberholweg {

	public static void main(String[] args) {
	double fzA = 5;	// Länge von deinem Auto (Meter)
	double fzB = 15; // Länge des anderen Autos (Meter)
	double vA = 80; // Deine Geschwindigkeit (km/h)
	double vB = 70; // Geschwindigkeit des anderen Autos (km/h)
	
	System.out.println("Geschwindigkeit A: "+vA);
	 System.out.println("Geschwindigkeit B: "+vB);
	 System.out.println("Länge A: "+fzA);
	 System.out.println("Länge B: "+fzB);

	 
	 //Aufgabe c)
	 
	 double S1 = vA/2; // Sicherheitsabstand 1
	 double S2 = vB/2; // Sicherheitsabstand 2
	 
	 System.out.println("Sicherheitsabstand 1: " +S1);
	 System.out.println("Sicherheitsabstand 2: " +S2);
	 
	 //Aufgabe d)
	 
	 double StreckeRelativ = fzA + S1 + fzB + S2; // Relative Strecke
	 System.out.println("Relative Strecke: " +StreckeRelativ );
	 
	 //Aufgabe e)
	 
	 double GeschwindigkeitRelativ = vA - vB; // Relative Geschwindigkeit
	 System.out.println("Relative Geschwindigkeit: " +GeschwindigkeitRelativ);
	 
	 //Aufgabe f)
	 
	 double Zeit = StreckeRelativ * 3.6 / GeschwindigkeitRelativ; // Zeit
	 System.out.println("Benötigte Zeit: " +Zeit);
	 
	 //Aufgabe g)
	 
	 double Ueberholweg = Zeit * vA / 3.6; // Ueberholweg
	 System.out.println("Ueberholweg: " +Ueberholweg);
	
	} 

}
