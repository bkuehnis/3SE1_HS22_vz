package uebung6.vza.ch.zhaw.baechni2;


public class WerIstEs {

	public static void main(String[] args) {
		//a)
		Person p1 = new Person("Alex","schwarz",true,"braun");
		Person p2 = new Person("Alfred","rot",false,"blau");
		Person p3 = new Person("Anita","blond",false,"blau");
		Person p4 = new Person("Anne","schwarz",true,"braun");
		Person p5 = new Person("Maria","braun",false,"braun");
		Person p6 = new Person("Robert","braun",true,"blau");


		// c) anpassung
		System.out.println(p1.getName()+ " Augen: "+p1.getaugenfarbe());
		System.out.println(p2.getName()+ " Haarfarbe: "+ p2.getHaarfarbe());
		System.out.println(p3.getName()+ " kurze Haare: "+p3.isKurzeHaare());

		// d) print 
		p4.printPerson();
		p5.printPerson();
		p6.printPerson();

		// e) haarfarbe	
		p1.stimmtHaarfarbe("schwarz");
		System.out.println("Alex hat schwarze Haare: "+ p1.stimmtHaarfarbe("schwarz"));
		p1.stimmtHaarfarbe("blond");
		System.out.println("Alex hat blonde Haare: "+ p1.stimmtHaarfarbe("blond"));

		// f) leider gescheitert
	//	p5.schneideHaare(true);
	}

}
