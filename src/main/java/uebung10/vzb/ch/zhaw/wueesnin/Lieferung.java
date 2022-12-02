package uebung10.vzb.ch.zhaw.wueesnin;


public class Lieferung {
	private int plz;
	private String empfaenger;
	private Brief brief;
	private Paket paket;

	public Lieferung(int plz, String empfaenger, Brief brief) {
		this.plz = plz;
		this.empfaenger = empfaenger;
		this.brief = brief;
	}

	public Lieferung(int plz, String empfaenger, Paket paket) {
		this.plz = plz;
		this.empfaenger = empfaenger;
		this.paket = paket;
	}

	public int getPlz() {
		return plz;
	}

	public Brief getBrief() {
		return brief;
	}

	public Paket getPaktet() {
		return paket;
	}

	public String getEmpfaenger() {
		return empfaenger;
	}

	public void print() {
		System.out.println("-PLZ: " + plz);
		System.out.println("-Empfänger: " + empfaenger);
		if (brief == null)
			paket.print();
		else
			brief.print();
	}
}