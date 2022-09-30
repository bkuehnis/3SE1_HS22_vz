package vza.ch.zhaw.stettjoe.uebung1;


public class Uebung1 {

	public static void main(String[] args) {
		double fzA = 5; //Länge von deinem Auto (Meter)
		double fzB = 5; //Länge des anderen Autos (Meter)
		double vA = 50; //Deine Geschwindigkeit (km/h)
		double vB = 30; //Geschwindigkeit des anderen Autos (km/h)
		
		System.out.println("Geschwindigkeit A: "+vA);
		System.out.println("Geschwindigkeit B: "+vB);
		System.out.println("Laenge A: "+fzA);
		System.out.println("Laenge B: "+fzB);
		
		double s1 = vA/2;
		double s2 = vB/2;
		
		System.out.println("Sicherheitsabstnad 1: "+s1);
		System.out.println("Sicherheitsabstnad 2: "+s2);
		
		double rs = fzA + fzB + s1 + s2;
		System.out.println("Relative Strecke: "+rs);
		
		double rg = vA - vB;
		System.out.println("Relative Geschwindigkeit: "+rg);
		
		double z = (rs * 3.6)/rg;
		System.out.println("Zeit: "+z);
		
		double uw = (z * vA)/3.6;
		System.out.println("Ueberholweg: "+uw);

	}

}
