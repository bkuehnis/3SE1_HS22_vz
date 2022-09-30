package vzb.ch.zhaw.anderni2.uebung1;

public class application {
	public static void main(String[] agbs) {
		
        double fzA = 4.5; // Länge von deinem Auto (Meter)
        double fzB = 15.5; // Länge des anderen Autos (Meter)
        double vA = 80; // Deine Geschwindigkeit (km/h)
        double vB = 60; // Geschwindigkeit des anderen Autos(km/h)
        double S1 = vA / 2; //Rechnung für Sicherheitsabstand 1
        double S2 = vB / 2; //Rechnung für Sicherheitsabstand 2
        double R = fzA + S1 + fzB + S2; //rechnung für Relative Strecke
        double RG = vA - vB; //Rechnung für relative Geschwindigkeit
        double RZ = (R * 3.6) / RG; //Rechnung für relative Zeit
        double UW = (RZ * vA) / 3.6; //Rechnung für Überholweg


        System.out.println("Geschwindigkeit A: " + vA + " km/h");
        System.out.println("Geschwindigkeit B: " + vB + " km/h");
        System.out.println("Länge A: " + fzA + " Meter");
        System.out.println("Länge B: " + fzB + " Meter");
        System.out.println("Sicherheitsabstand 1: " + S1 + " Meter");
        System.out.println("Sicherheitsabstand 2: " + S2 + " Meter");
        System.out.println("relative Strecke: " + R + " Meter");
        System.out.println("relative Geschwindigkeit: " + RG + " km/h");
        System.out.println("Benötigte Zeit: " + RZ + "s");
        System.out.println("Überholweg: " + UW + " Meter");
	}

}
