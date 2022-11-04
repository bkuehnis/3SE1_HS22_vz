package uebung6.vza.ch.zhaw.gavindom;


public class Personenverwaltung {

	public static void main(String[] args) {
		Person p1 = new Person("Hans",1970);
		Person p2 = new Person("Roby",2019);
		
		System.out.println(p1.name+": "+p1.getjahrgang());
		
		
		p1.print();
		p2.print();
		
		int alter1 = p1.getAlterImJahr(2022);
		int alter2 = p2.getAlterImJahr(2022);
			
		
		System.out.println (alter1+", "+alter2);
	//	System.out.println (p2.name+": "+p2.jahrgang);

	}

}
