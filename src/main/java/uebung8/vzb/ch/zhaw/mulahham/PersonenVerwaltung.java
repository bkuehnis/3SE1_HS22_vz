package uebung8.vzb.ch.zhaw.mulahham;

import java.util.ArrayList;

public class PersonenVerwaltung {

    private ArrayList<Person> personen = new ArrayList<Person>();

    public int getAnzahl() {
        return personen.size();
    }

    public void addPerson(Person p) {
        personen.add(p);
    }

    public void printNamen() {
        for(Person p: personen){
            System.out.println(p.getName());
        }
    }

    public void printPersonen() {
        for (Person p: personen){
            p.printPerson();
        }
    }

    public Person getPerson(int index) {
        if (index < personen.size()){
            return personen.get(index);
        }
        return null;
    }

    public Person getPerson(String name) {
        for (Person p: personen){
            if (p.getName().equals(name)) {
                return p;
            }
        }
        return null;
    }

    public ArrayList<Person> getAlleMitMerkmal(String merkmal) {
        ArrayList<Person> personenMitMerkmal = new ArrayList<Person>();

        for(Person p: personen){
            if (p.getMerkmaleAlsCsv().contains(merkmal)){
                personenMitMerkmal.add(p);
            }
        }

        if (personenMitMerkmal.size() > 0){
            return personenMitMerkmal;
        }
        return null;
    }

    public void removePersonenInListe(ArrayList<Person> toRemove) {
        personen.removeAll(toRemove);
    }

    public void removePersonenNichtInListe(ArrayList<Person> notToRemove) {
        personen.retainAll(notToRemove);
    }
}
