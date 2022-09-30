package vzb.ch.zhaw.osmanmin.uebung1;


public class Rechner {
	public static void main(String[] args) {
	
	double fzA = 5;
	double fzB = 5;
	double vA = 120;
	double vB = 80;
	double S1 = vA/2;
	double S2 = vB/2;
	double StreckeR = fzA+S1+fzB+S2;
	double GeschwR = vA-vB;
	double Zeit = StreckeR*3.6/GeschwR;
	
	System.out.println("Geschwindigkeit A: "+vA);
	System.out.println("Geschwindigkeit B: "+vB);
	System.out.println("Laenge A: "+fzA);
	System.out.println("Laenge B: "+fzB);
	System.out.println("Sicherheitsabstand 1: "+S1);
	System.out.println("Sicherheitsabstand 2: "+S2);
	System.out.println("Relative Strecke: "+StreckeR+" Meter");
	System.out.println("Relative Geschwindigkeit: "+GeschwR+ " km/h");
	System.out.println("Benötigte Zeit: "+Zeit+ " Sekunden");
	System.out.println("Ueberholweg: "+Zeit*vA/3.6+" Meter");
	
	}
}
