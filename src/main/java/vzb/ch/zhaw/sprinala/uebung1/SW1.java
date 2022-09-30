package vzb.ch.zhaw.sprinala.uebung1;

public class SW1 {
    public static void main(String[] args) {
        double fzA = 5; // Länge von deinem Auto (Meter)
        double fzB = 5; // Länge des anderen Autos (Meter)
        double vA = 50; // Deine Geschwindigkeit (km/h)
        double vB = 30; // Geschwindigkeit des anderen Autos(km/h)

        double S1 = vA/2; // Sicherheitsabstand vor dem Überholen
        double S2 = vB/2; // Sicherheitsabstand nach dem Überholen

        double StreckeRelativ = fzA+S1+fzB+S2; //berechnet das Streckenrelativ
        double GeschwindigkeitRelativ = vA-vB; //Geschwindigkeit Unterschied von Fahrzeug A zu B
        double Zeit = StreckeRelativ*3.6/GeschwindigkeitRelativ; // Überholzeit berechnen
        double Ueberholweg = Zeit*vA/3.6; //Überholweg berechnen


        System.out.println("Geschwindigkeit A: "+vA);
        System.out.println("Geschwindigkeit B: "+vB);
        System.out.println("Länge A: "+fzA);
        System.out.println("Länge B: "+fzB);
        System.out.println("Sicherheitsabstand 1: "+S1);
        System.out.println("Sicherheitsabstand 2: "+S2);
        System.out.println("Relative Strecke: " +StreckeRelativ);
        System.out.println("Relative Geschwindigkeit "+GeschwindigkeitRelativ+" km/h");
        System.out.println("Benötigte Zeit "+Zeit+" Sekunden");
        System.out.println("Überholweg "+Ueberholweg+ " Meter");
        // Hier kommt die Lösung der Aufgabe hin...
    }
}