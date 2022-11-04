package uebung6.vzb.ch.zhaw.martilu5;


public class WerIstEs {

	public static void main(String[] args) {
		 Person p1 = new Person("Alex","schwarz",true,"braun");
		 Person p2 = new Person("Alfred","rot",false,"blau");
		 Person p3 = new Person("Anita","blond",false,"blau");
		 Person p4 = new Person("Anne","schwarz",true,"braun");
		 Person p5 = new Person("Maria","braun",false,"braun");
		 Person p6 = new Person("Robert","braun",true,"blau");

		 System.out.println(p1.getName()+" Augen: "+p1.getAugenfarbe());
		 System.out.println(p2.getName()+" Haarfarbe: "+p2.getHaarfarbe());
		 System.out.println(p3.getName()+" kurze Haare: "+p3.isKurzeHaare());
		 System.out.println(" ");
		 
		 p4.printPerson();
		 p5.printPerson();
		 p6.printPerson();
		 System.out.println(" ");
		 
		 System.out.println(p1.getName()+" hat braune Haare: "+p1.stimmtHaarfarbe());
		 System.out.println(p3.getName()+" hat braune Haare: "+p3.stimmtHaarfarbe());
		 System.out.println(p5.getName()+" hat braune Haare: "+p5.stimmtHaarfarbe());
		 System.out.println(" ");
		 
		 System.out.println(p2.getName()+"s Haare "+p2.schneideHaare());
		 System.out.println(p4.getName()+"s Haare "+p4.schneideHaare());
		 System.out.println(p6.getName()+"s Haare "+p6.schneideHaare());
		 System.out.println(" ");
		 }

}
