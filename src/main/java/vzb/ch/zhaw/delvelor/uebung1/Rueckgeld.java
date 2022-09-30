package vzb.ch.zhaw.delvelor.uebung1;


public class Rueckgeld {

	public static void main(String[] args) {
		
	int preis = 65; // Preis des Produktes in Rappen
	
	int bezahlt = 250; // Eingeworfener Betrag in Rappen
	
	int rueck = bezahlt - preis; // Rückgeld in Rappen für die Anzeige
	
	int rueck2 = bezahlt - preis; // Rückgeld zum Rechnen in Rappen
	
	int a = 500; // 5Fr
	
	int A = rueck2/a;
	
	rueck2 = rueck2 - A*a;
	
	int b = 200; // 2Fr
	
	int B = rueck2/b;
	
	rueck2 = rueck2 - B*b;
	
	int c = 100; // 1Fr
	
	int C = rueck2/c;
	
    rueck2 = rueck2 - C*c;
	
	int d = 50; // 50Rp
	
	int D = rueck2/d;
	
	rueck2 = rueck2 - D*d;
	
	int e = 20; // 20Rp
	
	int E = rueck2/e;
	
	rueck2 = rueck2 - E*e;
	
	int f = 10; // 10Rp
	
	int F = rueck2/f;
	
	rueck2 = rueck2 - F*f;
	
	int g = 5; // 5Rp
	
	int G = rueck2/g;
	
	rueck2 = rueck2 - G*g;
	
	
	System.out.println("Preis: " + preis + " Rappen");
	System.out.println("Bezahlt: " + bezahlt + " Rappen");
	System.out.println("Rückgeld: " + rueck + " Rappen");
	System.out.println("5 Fr: " + A + " Stück");
	System.out.println("2 Fr: " + B + " Stück");
	System.out.println("1 Fr: " + C + " Stück");
	System.out.println("50 Rp: " + D + " Stück");
	System.out.println("20 Rp: " + E + " Stück");
	System.out.println("10 Rp: " + F + " Stück");
	System.out.println("5 Rp: " + G + " Stück");
	
	}

}
