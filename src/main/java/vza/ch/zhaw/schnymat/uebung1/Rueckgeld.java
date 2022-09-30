package vza.ch.zhaw.schnymat.uebung1;


public class Rueckgeld {
	
	public static void main(String[] args) {
		 int preis = 105; // Preis des Produkts in Rappen
		 int bezahlt = 500; // Eingeworfener Betrag in Rappen
		 // Dein Code
		 
		 int rueckgeld = bezahlt - preis;
		 
		System.out.println("Preis: " + preis + " Rappen");
		System.out.println("Erhalten: " + bezahlt + " Rappen");		 
		System.out.println("Rückgeld: " + rueckgeld + " Rappen");	
		
		System.out.println("\n");
		
		int fünf = 0;
		int zwei = 0;
		int eins = 0;
		int fünfzig = 0;
		int zwanzig = 0;
		int zehner = 0;
		int fünfer = 0;
		
		fünf = rueckgeld / 500;
		rueckgeld %= 500;
		zwei = rueckgeld / 200;
		rueckgeld %= 200;
		eins = rueckgeld / 100;
		rueckgeld %= 100;
		fünfzig = rueckgeld / 50;
		rueckgeld %= 50;
		zwanzig = rueckgeld / 20;
		rueckgeld %= 20;
		zehner = rueckgeld / 10;
		rueckgeld %= 10;
		fünfer = rueckgeld / 5;
		rueckgeld %= 5;
		
		System.out.println("5 Fr. " + fünf);
		System.out.println("2 Fr. " + zwei);
		System.out.println("1 Fr. " + eins);
		System.out.println("50 Rp. " +  fünfzig);
		System.out.println("20 Rp. " +  zwanzig);
		System.out.println("10 Rp. " +  zehner);
		System.out.println("5 Rp. " +  fünfer);
		
		 
		 
		 

		 
		 }

}
