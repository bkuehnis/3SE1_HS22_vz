package vzb.ch.zhaw.schulfa2.uebung1;


public class Rueckgeld {

	public static void main(String[] args) {
		int preis = 135; // Preis des Produkts in Rappen
		int bezahlt = 500; // Eingeworfener Betrag in Rappen

		int rueckGeld = bezahlt - preis;
		int tempRueckGeld;

		System.out.println("Preis:    " + preis + " Rappen");
		System.out.println("Erhalten: " + bezahlt + " Rappen");
		System.out.println("Rückgeld: " + rueckGeld + " Rappen");
		System.out.println(" ");
		
		int funfFr = rueckGeld / 500;
		tempRueckGeld = rueckGeld % 500;

		int zweiFr = tempRueckGeld / 200;
		tempRueckGeld %= 200;

		int einFr = tempRueckGeld / 100;
		tempRueckGeld %= 100;

		int füfzRp = tempRueckGeld / 50;
		tempRueckGeld %= 50;

		int zwanzigRp = tempRueckGeld / 20;
		tempRueckGeld %= 20;

		int zehnRp = tempRueckGeld / 10;
		tempRueckGeld %= 10;

		int fuefRp = tempRueckGeld / 5;

		System.out.println("5 Fr:  " + funfFr + " Stück");
		System.out.println("2 Fr:  " + zweiFr + " Stück");
		System.out.println("1 Fr:  " + einFr + " Stück");
		System.out.println("50 Rp: " + füfzRp + " Stück");
		System.out.println("20 Rp: " + zwanzigRp + " Stück");
		System.out.println("10 Rp: " + zehnRp + " Stück");
		System.out.println("5 Rp:  " + fuefRp + " Stück");
	}
}
