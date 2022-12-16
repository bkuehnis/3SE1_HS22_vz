package uebung12.vzb.ch.zhaw.kanliroj;


public class Verbindung {
	private Flughafen ziel;
	private double preis;
	
	public Verbindung(Flughafen ziel, double preis) {
		this.ziel = ziel;
		this.preis = preis;
	}

	public Flughafen getZiel() {
		return ziel;
	}

	public double getPreis() {
		return preis;
	}
}
