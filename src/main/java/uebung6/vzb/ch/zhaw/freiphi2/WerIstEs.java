package uebung6.vzb.ch.zhaw.freiphi2;

public class WerIstEs {
	public static void main(String[] args) {
		Person p1 = new Person("Alex", "schwarz", true, "braun", "schwarz");
		Person p2 = new Person("Alfred", "rot", false, "blau", "blau");
		Person p3 = new Person("Anita", "blond", false, "blau", "blond");
		Person p4 = new Person("Anne", "schwarz", true, "braun", "schwarz");
		Person p5 = new Person("Maria", "braun", false, "braun", "blond");
		Person p6 = new Person("Robert", "braun", true, "blau", "blond");
		System.out.println(p1.getName() + " Augen: " + p1.getAugenfarbe());
		System.out.println(p2.getName() + " Haarfarbe: " + p2.getHaarfarbe());
		System.out.println(p3.getName() + " kurze Haare: " + p3.isKurzeHaare());
		p4.printPerson();
		p5.printPerson();
		p6.printPerson();
		System.out.println(p1.getName()+ " hat " +p1.input1+ "e Haare: "+  p1.stimmtHaarfarbe(p1.input1));
		p5.schneideHaare();
		System.out.println(p5.isKurzeHaare());
	}
}
