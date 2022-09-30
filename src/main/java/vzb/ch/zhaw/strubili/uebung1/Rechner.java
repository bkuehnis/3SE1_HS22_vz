package vzb.ch.zhaw.strubili.uebung1;


public class Rechner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double fzA = 5; 					//Länge von deinem Auto (Meter)
		double fzB = 5; 					//Länge des anderen Autos (Meter)
		double vA = 50;						//Deine Geschwndigkeit (km/h)
		double vB = 30;						//Geschwindigkeit des anderen Autos (km/h)
		double s1 = vA/2;					//Sicherheitsabstand 1
		double s2 = vB/2;					//Sicherheitsabtand 2
		double sr = fzA + s1 + fzB + s2;	//relative Strecke
		double gr = vA - vB;				//relative Geschwindigkeit
		double Zeit = (sr*3.6)/gr;			//Zeit zum Überholen
		double Uw = (Zeit*vA)/3.6;			//Überholweg
		
		
		System.out.println("Geschwindigkeit A: "+vA);
		System.out.println("Geschwindigkeit B: "+vB);
		System.out.println("Länge A: "+fzA);
		System.out.println("Länge B: "+fzB);
		System.out.println("Sicherheitsabstand 1:"+s1);
		System.out.println("Sicherheitsabstand 2:"+s2);
		System.out.println("Relative Strekce: "+sr+" Meter");
		System.out.println("Relative Strecke: "+gr+" km/h");
		System.out.println("Benötigte Zeit: "+Zeit+" Sekunden");
		System.out.println("Ueberholweg: "+Uw+" Meter");
		
		

	}

}
