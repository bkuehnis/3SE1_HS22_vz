package uebung6.vza.ch.zhaw.drmicfil;


public class Person {

		
		private String name;
		private String haarfarbe;
		private boolean kurzeHaare;
		private String augenfarbe;
		
		public Person(String name, String haarfarbe, boolean kurzeHaare, String augenfarbe) {
			
			
			this.name = name;
			this.haarfarbe = haarfarbe;
			this.kurzeHaare = kurzeHaare;
			this.augenfarbe = augenfarbe;
			
		}
		// Aufgabge d) Satz ausgeben
		public  void printPerson() {
			String laenge = "lange";
			if (kurzeHaare) {
				laenge = "kurze";
			}
			System.out.println(name+" hat "+laenge+" "+haarfarbe+"e Haare und "+augenfarbe+"e Augen. ");
		}
		
		public String getName() {			// Getter methode  ACHTUNG BOOLEAN! mit is
			return name;
		}
		
		public String getHaarfarbe() {
			return haarfarbe;
		}
		
		public boolean isKurzeHaare() {
			return kurzeHaare;
		}
		
		public String getAugenfarbe() {
			return augenfarbe;
		}
		
		
		//Aufgabe e
		
		public boolean stimmtHaarfarbe(String haarfarbeRat) {
			System.out.println(this.name+" hat "+ haarfarbeRat+"e" + " Haare " + haarfarbe.equals(haarfarbeRat));
			return haarfarbe.equals(haarfarbeRat);
			
		}

		public void schneideHaare(String kurzeHaareRat) {
			
		String laenge = "";
		if (this.kurzeHaare == true) {
			laenge = "kurz";
		} else { 
			laenge = "lang";
			
		}
		if (kurzeHaareRat.equals("Haarlänge")) {
			System.out.println(this.name + "s" + " Haare wurden geschnitten.");
		} else {
			kurzeHaare = false;
			System.out.println(this.name +"s" + " Haare sind bereits kurz.");
		}
		
		
		
		}
}
