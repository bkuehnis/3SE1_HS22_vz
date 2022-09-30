package vzb.ch.zhaw.freiphi2.uebung1;

public class Taschengeld {
	public static void main(String[] args) {
		int preis = 105; // Preis des Produkts in Rappen
		int bezahlt = 500; // Eingeworfener Betrag in Rappen Rückgeld = 395 Rappen
		int Rückgeld = bezahlt - preis;
		int chf5 = Rückgeld / 500;
		int chf2 = (Rückgeld - chf5 * 500) / 200;
		int chf1 = (Rückgeld - chf5 * 500 - chf2 * 200) / 100;
		int chf05 = (Rückgeld - chf5 * 500 - chf2 * 200 - chf1 * 100) / 50;
		int chf02 = (Rückgeld - chf5 * 500 - chf2 * 200 - chf1 * 100 - chf05 * 50) / 20;
		int chf01 = (Rückgeld - chf5 * 500 - chf2 * 200 - chf1 * 100 - chf05 * 50 - chf02 * 20) / 10;
		int chf005 = (Rückgeld - chf5 * 500 - chf2 * 200 - chf1 * 100 - chf05 * 50 - chf02 * 20 - chf01 * 10) / 5;
		System.out.println("5 Fr: " + chf5 + " Stück");
		System.out.println("2 Fr: " + chf2 + " Stück");
		System.out.println("1 Fr: " + chf1 + " Stück");
		System.out.println("50 Rp: " + chf05 + " Stück");
		System.out.println("20 Rp: " + chf02 + " Stück");
		System.out.println("10 Rp: " + chf01 + " Stück");
		System.out.println("5 Rp: " + chf005 + " Stück");
	}
}