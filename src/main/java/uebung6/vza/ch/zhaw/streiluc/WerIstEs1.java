package uebung6.vza.ch.zhaw.streiluc;

import java.util.jar.Attributes.Name;

public class WerIstEs1 {


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
		
		
		p1.printPerson();
		p2.printPerson();
		p3.printPerson();
		p4.printPerson();
		p5.printPerson();
		p6.printPerson();

			System.out.println(p1.getName()+ " hat schwarze Haare "+p1.stimmtHaarfarbe());
			System.out.println(p2.getName()+ " hat schwarze Haare "+p2.stimmtHaarfarbe());
			System.out.println(p3.getName()+ " hat schwarze Haare "+p3.stimmtHaarfarbe());
			System.out.println(p4.getName()+ " hat schwarze Haare "+p4.stimmtHaarfarbe());
			System.out.println(p5.getName()+ " hat schwarze Haare "+p5.stimmtHaarfarbe());
			System.out.println(p6.getName()+ " hat schwarze Haare "+p6.stimmtHaarfarbe());
			
			System.out.println(p1.getName()+"s " + p1.schneideHaare());
			System.out.println(p2.getName()+"s " + p2.schneideHaare());
			System.out.println(p3.getName()+"s " + p3.schneideHaare());
			System.out.println(p4.getName()+"s " + p4.schneideHaare());
			System.out.println(p5.getName()+"s " + p5.schneideHaare());
			System.out.println(p6.getName()+"s " + p6.schneideHaare());
		

	}


	
}
