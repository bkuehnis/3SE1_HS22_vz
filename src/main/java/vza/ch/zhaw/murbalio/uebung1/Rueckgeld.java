package vza.ch.zhaw.murbalio.uebung1;


public class Rueckgeld {

	 public static void main(String[] args) {
		 int preis = 295; // Preis des Produkts in Rappen
		 int bezahlt = 500; // Eingeworfener Betrag in Rappen
		 int rueckgeld = (bezahlt-preis);
		 
		 
		 System.out.println("Preis: "+preis+" Rappen");
		 System.out.println("Erhalten: "+bezahlt+" Rappen");
		 System.out.println("Rückgeld: "+rueckgeld+" Rappen");
		 
		 int RG500 = rueckgeld/500;
		 
		 System.out.println("5 Fr: "+(RG500));
		 
		 int RG200 = ((rueckgeld-(RG500*500))/200);
		 
		 System.out.println("2 Fr: "+(RG200));
		 
		 int RG100 = ((rueckgeld-(RG500*500)-(RG200*200))/100);
		 
		 System.out.println("1 Fr: "+(RG100));
		 
		 int RG50 = ((rueckgeld-(RG500*500)-(RG200*200)-(RG100*100))/50);
		 
		 System.out.println("50 Rp: "+(RG50));
		 
		 int RG20 = ((rueckgeld-(RG500*500)-(RG200*200)-(RG100*100)-(RG50*50))/20);
		 
		 System.out.println("20 Rp: "+(RG20));
		 
		 int RG10 = ((rueckgeld-(RG500*500)-(RG200*200)-(RG100*100)-(RG50*50)-(RG20*20))/10);
		 
		 System.out.println("10 Rp: "+(RG10));
		 
		 int RG5 = ((rueckgeld-(RG500*500)-(RG200*200)-(RG100*100)-(RG50*50)-(RG20*20)-(RG10*10))/5);
		 
		 System.out.println("5 Rp: "+(RG5));
		 
		 
		 
		 
	}

}
