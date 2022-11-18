package uebung8.vzb.ch.zhaw.bosluc01;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class PersonenVerwaltung {

	private ArrayList<Person> personen = new ArrayList<Person>();  

	public int getAnzahl() {
		return personen.size();
	}

	public void addPerson(Person p) {
		personen.add(p);
	}
	
	public void printNamen() {
		personen.forEach(p -> System.out.println(p.getName()));
	}
	
	public void printPersonen() {
		personen.forEach(Person::printPerson);
	}
	
	public Person getPerson(int index) {
		return index < 0 || index >= getAnzahl() ? null : personen.get(index);
	}
	
	public Person getPerson(String name) {
		return personen.stream().filter(p -> p.getName().equals(name)).findAny().orElse(null);
	}
	
	public ArrayList<Person> getAlleMitMerkmal(String merkmal) {
		return personen.stream().filter(p -> p.getMerkmaleAlsCsv().contains(merkmal)).collect(Collectors.toCollection(ArrayList::new));
	}
	
	public void removePersonenInListe(ArrayList<Person> toRemove) {
		personen.removeAll(toRemove);
	}
	
	public void removePersonenNichtInListe(ArrayList<Person> notToRemove) {
		personen.removeIf(p -> !notToRemove.contains(p));
	}
}
