package vza.ch.zhaw.seemaala.uebung1;


public class Rechner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double fzA = 5;
		double fzB = 15;
		double vA = 80;
		double vB = 70;
		double S1 = (vA/2);
		double S2 = (vB/2);
		double RSA = (S1+fzA);
		double RSB = (S2+fzB);
		double Relative = (RSA+RSB);
		double GeschwindigkeitRelativ = (vA-vB);
		double BenoetigteZeit = (Relative*3.6)/GeschwindigkeitRelativ;
		double Ueberholweg = (BenoetigteZeit*vA)/3.6;
		
		
				
		
		
		System.out.println("Geschwindigkeit A: "+vA);
		System.out.println("Geschwindigkeit B: "+vB);
		System.out.println("Laenge A: "+fzA);
		System.out.println("Laenge B: "+fzB);
		System.out.println("Sicherheitsabstand 1: "+S1);
		System.out.println("Sicherheitsabstand 2: "+S2);
		System.out.println("Relative Strecke: "+Relative+(" Meter"));
		System.out.println("Relative Geschwindigkeit: "+GeschwindigkeitRelativ+(" km/h"));
		System.out.println("Benoetigte Zeit: "+BenoetigteZeit+(" Sekunden"));
		System.out.println("Ueberholweg: "+Ueberholweg+(" Meter"));
		
		
		
		
		
		
		
		

	}

}
