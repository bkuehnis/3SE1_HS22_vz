package uebung6.vza.ch.zhaw.reichraf;

import java.util.Scanner;

public class WerIstEs {

	public static void main(String[] args) {
		Scanner ks = new Scanner(System.in);
		Person p1 = new Person("Alex","schwarz",true,"braun");
		Person p2 = new Person("Alfred","rot",false,"blau");
		Person p3 = new Person("Anita","blond",false,"blau");
		Person p4 = new Person("Anne","schwarz",true,"braun");
		Person p5 = new Person("Maria","braun",false,"braun");
		Person p6 = new Person("Robert","braun",true,"blau");

		p1.printPerson();
		p2.printPerson();
		p3.printPerson();
		p4.printPerson();
		p5.printPerson();
		p6.printPerson();
		p1.stimmtHaarfarbe(ks.nextLine());
		p1.schneideHaare();
		p1.schneideHaare();
		p2.schneideHaare();
		p2.schneideHaare();

	}
}