package uebung7.vzb.ch.zhaw.anderni2;

//import org.w3c.dom.ls.LSOutput;

public class PersonenVerwaltung {


    // erfasste personen (maximal 30)
    private Person[] personen = new Person[30];

    // aktuelle Anzahl erfasster Personen
    private int anzahl = 0;

    public int getAnzahl() {
        return anzahl;
    }

    public void addPerson(Person p) {
        personen[anzahl] = p;
        anzahl = anzahl + 1;
    }

    //e
    public void printPersonen() {
        for (int i = 0; i < anzahl; i++) {
            personen[i].printPerson();
        }
    }

    //d
    public Person getPerson(int index) {
        return personen[index];
    }

    //e ---> IgnoreCase von einer Website, wie wäre das sonst gegangen?
    public Person getPerson(String name) {
        for (int i = 0; i < anzahl; i++) {
            if (personen[i].getName().equalsIgnoreCase(name)) {
                return personen[i];
            }
        }
        return null;
    }

    //f
    public int getAnzahlMitMerkmal(String merkmal){
        int count = 0;
        for(int i = 0 ; i < anzahl; i++) {
            if (personen[i].getMerkmaleAlsCsv().contains(merkmal)) {
                count++;}
        } return count;
    }


}









