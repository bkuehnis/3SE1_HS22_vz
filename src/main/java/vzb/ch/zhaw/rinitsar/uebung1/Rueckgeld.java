package vzb.ch.zhaw.rinitsar.uebung1;

public class Rueckgeld {
	public static void main(String[] args) {
		
		int preis = 105; // Preis des Produkts in Rappen
		int erhalten = 500; // Eingeworfener Betrag in Rappen
		int retour = erhalten - preis; // Rueckgeld in Rappen
		
		System.out.println("Preis: " + preis + " Rappen" );
		System.out.println("Erhalten: " + erhalten + " Rappen");
		System.out.println("Rueckgeld: " + retour + " Rappen");
		
		int fuenf = retour/500; // 5 Franken
		int zwei = retour%500/200; // 2 Franken
		int ein = retour%500%200/100; // 1 Franken
		int fuenfzig = retour%500%200%100/50; // 50 Rappen
		int zwanzig = retour%500%200%100%50/20; // 20 Rappen
		int zehn = retour%500%200%100%50%20/10; // 10 Rappen
		int fue = retour%500%200%100%50%20%10/5; // 5 Rappen
		
		System.out.println("5 Fr: " + fuenf + " Stueck");
		System.out.println("2 Fr: "+ zwei + " Stueck");
		System.out.println("1 Fr: "+ ein + " Stueck");
		System.out.println("50 Rp: "+ fuenfzig + " Stueck");
		System.out.println("20 Rp: "+ zwanzig + " Stueck");
		System.out.println("10 Rp: "+ zehn + " Stueck");
		System.out.println("5 Rp: "+ fue + " Stueck");
	
		// Dein Code
	}
}
