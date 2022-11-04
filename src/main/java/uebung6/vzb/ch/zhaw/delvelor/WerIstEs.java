package uebung6.vzb.ch.zhaw.delvelor;


public class WerIstEs {

	public static void main(String[] args) {
		
		Person p1 = new Person("Alex", "schwarz", true, "braun");
		Person p2 = new Person("Alfred", "rot", false, "blau");
		Person p3 = new Person("Anita", "blond", false, "blau");
		Person p4 = new Person("Anne", "schwarz", true, "braun");
		Person p5 = new Person("Maria", "braun", false, "braun");
		Person p6 = new Person("Robert", "braun", true, "blau");
		
		
		//System.out.println(p1.name + " Augen: " + p1.augenfarbe);
		//System.out.println(p2.name + " Haarfarbe: " + p2.haarfarbe);
		//System.out.println(p3.name + " kurze Haare: " + p3.kurzeHaare);
		
		System.out.println(p1.getName() + " Augen: " + p1.getaugenfarbe());
		System.out.println(p2.getName() + " Haarfarbe: " + p2.gethaarfarbe());
		System.out.println(p3.getName() + " kurze Haare: " + p3.iskurzeHaare());
		
		System.out.println("");
		
		p1.printPerson();
		p2.printPerson();
		p3.printPerson();
		p4.printPerson();
		p5.printPerson();
		p6.printPerson();
		
		System.out.println("");
		
		p1.stimmtHaarfarbe("Gelb");
		p2.stimmtHaarfarbe("Violet");
		p3.stimmtHaarfarbe("blond");
		p4.stimmtHaarfarbe("schwarz");
		p5.stimmtHaarfarbe("blau");
		p6.stimmtHaarfarbe("braun");
		
		System.out.println("");
		
		p1.schneideHaare();
		p2.schneideHaare();
		p3.schneideHaare();
		p4.schneideHaare();
		p5.schneideHaare();
		p6.schneideHaare();
		
		
	}
}
