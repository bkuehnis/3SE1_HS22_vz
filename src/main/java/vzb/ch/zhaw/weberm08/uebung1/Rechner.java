package vzb.ch.zhaw.weberm08.uebung1;


public class Rechner {
	
	 public static void main(String[] args) {
		 double fzA = 5; // Länge von deinem Auto (Meter)
		 double fzB = 15; // Länge des anderen Autos (Meter)
		 double vA = 80; // Deine Geschwindigkeit (km/h)
		 double vB = 70; // Geschwindigkeit des anderen Autos(km/h)
		 double s1; //Sicherheitsabstand vor dem Überholen
		 double s2; //Sicherheitsabstand nach dem Überholen
		 double relativeStrecke;
		 double relativeGeschwindigkeit;
		 double zeit;
		 double ueberholweg;
		 
		 System.out.println("Geschwindigkeit A: "+vA);
		 System.out.println("Geschwindigkeit B: "+vB);
		 System.out.println("Länge A: "+fzA);
		 System.out.println("Länge B: "+fzB);
		 
		 
		 // Hier kommt die Lösung der Aufgabe hin...
		 s1 = vA / 2;
		 s2 = vB / 2;
		 
		 System.out.println("Sicherheitsabstand 1: " + s1);
		 System.out.println("Sicherheitsabstand 2: " + s2);

		 relativeStrecke = fzA + s1 + fzB + s2;
		 System.out.println("Relative Strecke: " + relativeStrecke + " Meter");
		 
		 relativeGeschwindigkeit = vA - vB;
		 System.out.println("Relative Geschwindigkeit: " + relativeGeschwindigkeit + " km/h");
		 
		 zeit = (relativeStrecke * 3.6) / relativeGeschwindigkeit;
		 System.out.println("Benötigte Zeit: " + zeit + " Sekunden");
		 
		 ueberholweg = (zeit * vA) / 3.6;
		 System.out.println("Ueberholweg: " + ueberholweg + " Meter");
		 
	 }
}
