package vza.ch.zhaw.kernpas1.uebung1;


public class Zusatzaufgabe {

	public static void main(String[] args) {
		int preis = 105; // Preis des Produkts in Rappen
		int bezahlt = 500; // Eingeworfener Betrag in Rappen
		int rückgeld = bezahlt - preis; // Rückgeld
		int [] m = new int[7];
		
		for (int i = 0; i <= 6 ; i++ ) {	
		m[i] = 0;
		}
		
		int Rest = rückgeld;
		
		while (Rest>=500) {
			m[0]++;
			Rest -= 500;
		} 
			while (Rest>= 200) {
				m[1]++;
				Rest-= 200;
			}
			while (Rest>= 100) {
				m[2]++;
				Rest-= 100;
			}
			while (Rest>= 50) {
				m[3]++;
				Rest-= 50;
			}
			while (Rest>= 20) {
				m[4]++;
				Rest-= 20;
			}
			while (Rest>= 10) {
				m[5]++;
				Rest-= 10;
			}
			while (Rest>= 5) {
				m[6]++;
				Rest-= 5;
			}
		
		System.out.println("Preis: "+preis+" Rappen");
		System.out.println("Erhalten: "+bezahlt+" Rappen");
		System.out.println("Rückgeld: "+rückgeld+" Rappen\n");
		
		System.out.println("5 Fr: "+m[0]+" Stück");
		System.out.println("2 Fr: "+m[1]+" Stück");
		System.out.println("1 Fr: "+m[2]+" Stück");
		System.out.println("50 Rp: "+m[3]+" Stück");
		System.out.println("20 Rp: "+m[4]+" Stück");
		System.out.println("10 Rp: "+m[5]+" Stück");
		System.out.println("5 Rp: "+m[6]+" Stück");
				
		

	}

}
