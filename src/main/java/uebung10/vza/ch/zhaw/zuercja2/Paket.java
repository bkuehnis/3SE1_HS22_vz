package uebung10.vza.ch.zhaw.zuercja2;


public class Paket extends Lieferung{
	private double gewicht;
	
	public Paket(int plz,String empfaenger,double gewicht) {
		super(plz,empfaenger);
		this.gewicht = gewicht;
	}
	public double getGewicht() {
		return gewicht;
	}
	public void print() {
		System.out.println("-PLZ: "+ getPlz());
		System.out.println("-Empfaenger: "+ getEmpfaenger());
		System.out.println("-Gewicht: "+ getGewicht()); 
		System.out.println(" ");
	}



}
