package uebung12.vza.ch.zhaw.doenmhac;

import java.util.ArrayList;

public class Flughafen {
	private String name;
	private String kuerzel;
	private ArrayList<Verbindung> verbindungen;
	
	public Flughafen(String name, String kuerzel) {
		this.name = name;
		this.kuerzel = kuerzel;
		verbindungen = new ArrayList<Verbindung>();
	}
	
	public void addVerbindung(Verbindung v) {
		verbindungen.add(v);
	}

	public String getName() {
		return name;
	}

	public String getKuerzel() {
		return kuerzel;
	}

	public ArrayList<Verbindung> getVerbindungen() {
		return verbindungen;
	}
}
