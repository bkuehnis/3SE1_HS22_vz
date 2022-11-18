package uebung8.vzb.ch.zhaw.weberm08;


public class Person {

	public String name;
	public String haarFarbe;
	public boolean laenge;
	public String augenfarbe;
	
	public Person(String name2, String haarFarbe2, boolean laenge2, String augenFarbe2) {
		this.name = name2;
		this.haarFarbe = haarFarbe2;
		this.laenge = laenge2;
		this.augenfarbe = augenFarbe2;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getHaarfarbe() {
		return haarFarbe;
	}

	public void setHaarFarbe(String haarFarbe) {
		this.haarFarbe = haarFarbe;
	}

	public boolean isLaenge() {
		return laenge;
	}

	public void setLaenge(boolean laenge) {
		this.laenge = laenge;
	}

	public String getAugenfarbe() {
		return augenfarbe;
	}

	public void setAugenFarbe(String augenFarbe) {
		this.augenfarbe = augenFarbe;
	}
	
	public String getMerkmaleAlsCvs() {
		String converterLaenge = laenge == true ? "kurze" : "lange";
		return converterLaenge + " Haare," + haarFarbe.toString() + "e Haare," + augenfarbe.toString() + "e Augen";
	}
}
