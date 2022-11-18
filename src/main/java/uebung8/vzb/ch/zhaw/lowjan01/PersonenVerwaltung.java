package uebung8.vzb.ch.zhaw.lowjan01;

import java.util.ArrayList;

public class PersonenVerwaltung {

	private ArrayList<Person> personen = new ArrayList<Person>();
	private int counter = 0;

	public int getAnzahl() {
		return counter;
	}

	public void addPerson(Person p) {
		personen.add(p);
		counter++;

	}

	public void printNamen() {

	}

	public void printPersonen() {
		for (int i = 0; i < getPersonen().size(); i++) {

			String haare = "lange ";
			if (getPersonen().get(i).isKurzeHaare()) {
				haare = "kurze ";
			}
			System.out.println(getPersonen().get(i).getName() + " hat " + haare + getPersonen().get(i).getHaarfarbe()
					+ "e Haare und " + getPersonen().get(i).getAugenfarbe() + "e Augen.");

		}
	}

	public Person getPerson(int index) {
		return null;
	}

	public Person getPerson(String name) {
		return null;
	}

	
	//// Nicht ganz klar mit der Rückgabe, resp. es wird nicht ausgegeben
	public ArrayList<Person> getAlleMitMerkmal(String merkmal) {

		for (int i = 0; i < getAnzahl(); i++) {
			boolean a = getPersonen().get(i).isKurzeHaare();
			if (false == a && merkmal.contains("lange")) {
				Person y = personen.get(i);
				personen.add(y);
			}

		}
		return null;

	}

	public void removePersonenInListe(ArrayList<Person> toRemove) {

	}

	public void removePersonenNichtInListe(ArrayList<Person> notToRemove) {

	}

	public ArrayList<Person> getPersonen() {
		return personen;

	}

	public Person getPersonen1(int a) {
		return personen.get(a);

	}

	public Person getPersonen2(String a) {

		int counter = 0;

		for (int i = 0; i < getPersonen().size(); i++) {
			counter++;
			String pers11 = getPersonen().get(i).getName();

			if (pers11 == a) {
				return personen.get(counter - 1);

			}

		}

		return null;

	}

	public ArrayList<Person> getPersonenName() {
		for (int i = 0; i < getPersonen().size(); i++) {
			System.out.println(getPersonen().get(i).getName());
		}
		return null;

	}

	public void setPersonen(ArrayList<Person> personen) {
		this.personen = personen;
	}

	public void add(Person person) {
		// TODO Auto-generated method stub

	}
}
