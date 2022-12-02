/*
package uebung10.vzb.ch.zhaw.strubili;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

class PersonenVerwaltungTest {

	private PersonenVerwaltung pv;

	@BeforeEach
	void setUp() {
		pv = new PersonenVerwaltung();
		pv.addPerson(new Person("Tom", "schwarz", true, "blau"));
		pv.addPerson(new Person("Alex", "schwarz", true, "braun"));
		pv.addPerson(new Person("Maria", "braun", false, "braun"));
		pv.addPerson(new Person("Robert", "braun", true, "blau"));
		pv.addPerson(new Person("Bernard", "braun", true, "braun"));
		pv.addPerson(new Person("Anita", "blond", false, "blau"));
		pv.addPerson(new Person("David", "blond", true, "blau"));
		pv.addPerson(new Person("Charles", "blond", true, "braun"));
		pv.addPerson(new Person("Alfred", "rot", false, "blau"));
		pv.addPerson(new Person("Frans", "rot", true, "blau"));
		pv.addPerson(new Person("Bill", "rot", true, "braun"));
	}

	@Test
	void testGetAnzahl() {
		PersonenVerwaltung personenVerwaltung = new PersonenVerwaltung();
		assertEquals(0, personenVerwaltung.getAnzahl());

		personenVerwaltung.addPerson(new Person("Tom", "schwarz", true, "blau"));

		assertEquals(1, personenVerwaltung.getAnzahl());

		personenVerwaltung.addPerson(new Person("Tom", "schwarz", true, "blau"));
		personenVerwaltung.addPerson(new Person("Tom", "schwarz", true, "blau"));

		assertEquals(3, personenVerwaltung.getAnzahl());

		assertEquals(11, pv.getAnzahl());
	}

	@Test
	void test5() {
		System.out.println("\nTest 5");
		Person p3 = pv.getPerson("Frans");
		assertNotNull(p3);
		assertEquals("Frans", p3.getName());
		assertEquals("blau", p3.getAugenfarbe());
		assertNull(pv.getPerson("Ulf"));		
}

	@Test
	void test6() {
		System.out.println("\nTest 6");
		System.out.println("- alle mit langen Haaren:");
		ArrayList<Person> langeHaare = pv.getAlleMitMerkmal("lange Haare");
		assertNotNull(langeHaare);
		assertEquals(3, langeHaare.size());
			
		System.out.println("- alle mit braunen Augen:");
		ArrayList<Person> brauneAugen = pv.getAlleMitMerkmal("braune Augen");
		if (brauneAugen != null) {
			for (Person l : brauneAugen) {
				System.out.println(l.getName());
			}
		} else {
			System.out.println("Fehler bei getAlleMitMerkmal braune Augen");
		}
	}
}
*/