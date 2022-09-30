package vzb.ch.zhaw.giagilea.uebung1;


public class Rueckgeld {

	public static void main(String[] args) {
		int preis = 105; // Preis des Produkts in Rappen
		int bezahlt = 500; // Eingeworfener Betrag in Rappen
		
		int rueckGeld = bezahlt-preis;
		System.out.println(rueckGeld);
		
		int fünfFr = rueckGeld/500;
		rueckGeld -= fünfFr*500;
		int zweiFr = rueckGeld/200;
		rueckGeld -= zweiFr*200;
		int einFr = rueckGeld/100;
		rueckGeld -= einFr*100;
		int fünfzigRp = rueckGeld/50;
		rueckGeld -= fünfzigRp*50;
		int zwanzigRp = rueckGeld/20;
		rueckGeld -= zwanzigRp*20;
		int zehnRp = rueckGeld/10;
		rueckGeld -= zehnRp*10;
		int fünfRp = rueckGeld/5;
		rueckGeld -= fünfRp*5;
		
		
		
		// Dein Code
		System.out.println("5 Fr: "+fünfFr);
		System.out.println("2 Fr: "+zweiFr);
		System.out.println("1 Fr: "+einFr);
		System.out.println("50 Rp: "+fünfzigRp);
		System.out.println("20 Rp: "+zwanzigRp);
		System.out.println("10 Rp: "+zehnRp);
		System.out.println("5 Rp: "+fünfRp);
	}

}
