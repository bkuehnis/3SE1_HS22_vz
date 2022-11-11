package uebung7.vzb.ch.zhaw.bosluc01;

import java.util.Arrays;

public class PersonenVerwaltung {

  private Person[] personen = new Person[30];

  private int anzahl = 0;

  public int getAnzahl() {
    return anzahl;
  }
  
  public Person[] getAlleMitMerkmal(String merkmal) {
    return Arrays.stream(personen).filter(p -> p != null && Arrays.stream(p.getMerkmaleAlsArray()).anyMatch(merkmal::equals)).toArray(Person[]::new);
  }
  
  public int getAnzahlMitMerkmal(String merkmal) {
    return getAlleMitMerkmal(merkmal).length;
  }

  public void addPerson(Person person) {
    if (anzahl == personen.length) return; // Bereits 30 Personen
    personen[anzahl++] = person;
  }
  
  public Person getPerson(int index) {
    return index < 0 || index >= anzahl ? null : personen[index];
  }
  
  public Person getPerson(String name) {
    return Arrays.stream(personen).filter(p -> p != null && p.stimmtName(name)).findFirst().orElse(null);
  }

  public void printPersonen() {
    for (int i = 0; i < anzahl; i++)
      personen[i].printPerson();
  }

}
