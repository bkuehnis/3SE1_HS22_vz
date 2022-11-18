package uebung8.vzb.ch.zhaw.anderni2;

import java.util.ArrayList;

public class PersonenVerwaltung {

    private ArrayList<Person> personen = new ArrayList<Person>();

    //Test 1
    public int getAnzahl() {
        return personen.size();
    }

    //Test 1 Add
    public void addPerson(Person p) {
        personen.add(p);
    }

    // Test 2
    public void printNamen() {
        for (Person p : personen) {
            System.out.println(p.getName());
        }
    }

    // Test 3
    public void printPersonen() {
        for (Person p : personen) {
            if (p.isKurzeHaare()) {
                System.out.println(p.getName() + " hat kurze " + p.getHaarfarbe() + "e Haare und " + p.getAugenfarbe() + "e Augen");
            } else {
                System.out.println(p.getName() + " hat lange " + p.getHaarfarbe() + "e Haare und " + p.getAugenfarbe() + "e Augen");
            }
        }
    }

    // Test 4
    public Person getPerson(int index) {
        if (index > this.personen.size() || index < 0) {
            return null;
        }
        return this.personen.get(index);

    }

    // Test 5
    public Person getPerson(String name) {
        for (Person p : this.personen) {
            if (p.getName().equals(name)) {
                return p;
            }
        }
        return null;
    }

    //Test 6
    public ArrayList<Person> getAlleMitMerkmal(String merkmal) {
        ArrayList<Person> getAlleMitMerkmal = new ArrayList<>();
        for (Person p : this.personen) {
            if (p.getMerkmaleAlsCsv().contains(merkmal)) {
                getAlleMitMerkmal.add(p);
            }
        }
        return getAlleMitMerkmal;
    }


    // Test 7
    public void removePersonenInListe(ArrayList<Person> toRemove) {
        ArrayList<Person> removePersonen = new ArrayList<Person>();
        for(Person p : toRemove) {
            this.personen.remove(p);
        }
    }

    // Test 7.2
    public void removePersonenNichtInListe(ArrayList<Person> notToRemove) {
            this.personen = notToRemove;
        }
    }

