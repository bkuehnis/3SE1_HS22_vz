package uebung7.vza.ch.zhaw.chiraant;


public class WerIstEs {
public static void main(String[] args) {
		
		PersonenVerwaltung pv = new PersonenVerwaltung();
		System.out.println("a)");
		System.out.println("Anzahl: "+pv.getAnzahl());
		
		
		
		System.out.println("b)");
		 pv.addPerson(new Person("Tom","schwarz",true,"blau"));
		 pv.addPerson(new Person("Alex","schwarz",true,"braun"));
		 pv.addPerson(new Person("Maria","braun",false,"braun"));
		 pv.addPerson(new Person("Robert","braun",true,"blau"));
		 pv.addPerson(new Person("Bernard","braun",true,"braun"));
		 pv.addPerson(new Person("Anita","blond",false,"blau"));
		 pv.addPerson(new Person("David","blond",true,"blau"));
		 pv.addPerson(new Person("Charles","blond",true,"braun"));
		 pv.addPerson(new Person("Alfred","rot",false,"blau"));
		 pv.addPerson(new Person("Frans","rot",true,"blau"));
		 pv.addPerson(new Person("Bill","rot",true,"braun"));
		 //System.out.println("Anzahl: "+pv.getAnzahl());
		 
		System.out.println("c)");
			//pv.printPersonen();
			
		System.out.println("d)");
		Person p2 = pv.getPerson(2);
		System.out.println(p2.getName());
		System.out.println(p2.getAugenfarbe());
		System.out.println(pv.getPerson(15));
		
		System.out.println("e)");
		Person alfred = pv.getPerson("Alfred");
		System.out.println(alfred.getAugenfarbe());
		System.out.println(alfred.getHaarfarbe());
		System.out.println(pv.getPerson("Hans"));
		
		
		System.out.println("f)");
		//System.out.println(pv.getPerson(1).getMerkmaleAlsCsv());
		//System.out.println(pv.getPerson(3).getMerkmaleAlsCsv());
		//System.out.println(pv.getPerson(5).getMerkmaleAlsCsv());
			
	}


}
