package uebung6.vzb.ch.zhaw.merkjoe1;


public class Person {

		private String name;
		private String haarfarbe;
		private boolean kurzeHaare;
		private String augenfarbe;
		
		Person(String name, String haarfarbe, boolean kurzeHaare, String augenfarbe){
			this.name = name;
			this.haarfarbe = haarfarbe;
			this.kurzeHaare = kurzeHaare;
			this.augenfarbe = augenfarbe;
	}
		public void printPerson() {
			if(kurzeHaare) {
				String kurz = " hat kurze Haare";
				System.out.println(name + kurz + " und " + augenfarbe + "e Augen.");
			}
			else {
				String lang = " hat lange Haare";
				System.out.println(name + lang + " und " + augenfarbe + "e Augen.");
			}
		}
		
		public String getName() {
			return name;
		}
		public String getHaarfabe() {
			return haarfarbe;
		}
		public boolean iskurzeHaare() {
			return kurzeHaare;
		}
		public String getAugenfarbe() {
			return augenfarbe;
		}
		
		
		public void setName(String name) {
			this.name = name;
		}
		public void setHaatfarbe(String haarfarbe) {
			this.haarfarbe = haarfarbe;
		}
		public void iskurzeHaare(boolean kurzeHaare) {
			this.kurzeHaare = kurzeHaare;
		}
		public void setAugenfarbe(String augenfarbe) {
			this.augenfarbe = augenfarbe;
		}
		
		public boolean stimmtHaarfarbe(String haarfarbe) {
			if(haarfarbe.equals(this.haarfarbe)) {
				return true;
			}else {
				return false;
			}
		}
		
		public String schneideHaare() {
			if(kurzeHaare == false) {
				iskurzeHaare(true);
				return name + " Haare wurden geschnitten.";
			}
			else {
				return name + " Haare sind bereits kurz.";
			}
			
		}
}