package uebung6.vza.ch.zhaw.kernpas1;

public class WerIstEs {

	public static void main(String[] args) {
		Person p1 = new Person("Alex","schwarz",true,"braun");
		Person p2 = new Person("Alfred","rot",false,"blau");
		Person p3 = new Person("Anita","blond",false,"blau");
		Person p4 = new Person("Anne","schwarz",true,"braun");
		Person p5 = new Person("Maria","braun",false,"braun");
		Person p6 = new Person("Robert","braun",true,"blau");
		
		// Aufgabe b) + c)
		System.out.println(p1.getName()+" Augen: "+p1.getAugenfarbe());
		System.out.println(p2.getName()+" Haarfarbe: "+p2.getHaarfarbe());
		System.out.println(p3.getName()+" kurze Haare: "+p3.isKurzeHaare()+"\n");
		
		// Aufgabe d)
		p4.printPerson();
		p5.printPerson();
		p6.printPerson();
		
		// Aufgabe e)
		System.out.println("\n"+p1.getName()+" hat schwarze Haare: "+p1.stimmtHaarfarbe("schwarz"));
		System.out.println(p1.getName()+" hat blonde Haare: "+p1.stimmtHaarfarbe("blond"));
		System.out.println(p2.getName()+" hat schwarze Haare: "+p2.stimmtHaarfarbe("schwarz"));
		System.out.println(p2.getName()+" hat rote Haare: "+p2.stimmtHaarfarbe("rot"));
		System.out.println(p3.getName()+" hat schwarze Haare: "+p3.stimmtHaarfarbe("schwarz"));
		System.out.println(p3.getName()+" hat blonde Haare: "+p3.stimmtHaarfarbe("blond"));
	
		// Aufgabe f)
		System.out.println("\n"+p1.schneideHaare()+".");
		System.out.println(p2.schneideHaare()+".");
		System.out.println(p3.schneideHaare()+".");
		System.out.println(p4.schneideHaare()+".");
		System.out.println(p5.schneideHaare()+".");
		System.out.println(p6.schneideHaare()+".");
	}
}