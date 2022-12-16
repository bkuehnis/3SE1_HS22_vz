package uebung12.vza.ch.zhaw.seemaala;


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
