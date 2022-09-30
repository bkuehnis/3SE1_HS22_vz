package vza.ch.zhaw.campbjam.uebung1;

public class Rueckgeld {

	public static void main(String[] args) {

		int preis = 105; // Preis des Produkts in Rappen
		int bezahlt = 500; // Eingeworfener Betrag in Rappen
		// Dein Code

		int rueckgeld = bezahlt - preis;

		System.out.println("Preis: \t\t" + preis + " Rappen");
		System.out.println("Erhalten: \t" + bezahlt + " Rappen");
		System.out.println("Rückgeld: \t" + rueckgeld + " Rappen\n");

		int fünfFr = rueckgeld / 500;
		rueckgeld = rueckgeld - fünfFr * 500;

		int zweiFr = rueckgeld / 200;
		rueckgeld = rueckgeld - zweiFr * 200;

		int einFr = rueckgeld / 100;
		rueckgeld = rueckgeld - einFr * 100;

		int fünfzigRappen = rueckgeld / 50;
		rueckgeld = rueckgeld - fünfzigRappen * 50;

		int zwanzigRappen = rueckgeld / 20;
		rueckgeld = rueckgeld - zwanzigRappen * 20;

		int zehnRappen = rueckgeld / 10;
		rueckgeld = rueckgeld - zehnRappen * 10;

		int fünfRappen = rueckgeld / 5;
		rueckgeld = rueckgeld - fünfRappen * 5;

		System.out.println("5 Fr: \t\t" + fünfFr + " Stück");
		System.out.println("2 Fr: \t\t" + zweiFr + " Stück");
		System.out.println("1 Fr: \t\t" + einFr + " Stück");
		System.out.println("50 Rp: \t\t" + fünfzigRappen + " Stück");
		System.out.println("20 Rp: \t\t" + zwanzigRappen + " Stück");
		System.out.println("10 Rp: \t\t" + zehnRappen + " Stück");
		System.out.println("5 Rp: \t\t" + fünfRappen + " Stück");
	}
}