package uebung10.vzb.ch.zhaw.bosluc01;

import java.util.ArrayList;

public class Liefertour {

  private ArrayList<Lieferung> lieferungen = new ArrayList<>();

  public void addPaket(int plz, String empfaenger, double gewicht) {
    lieferungen.add(new Paket(plz, empfaenger, gewicht));
  }

  public void addBrief(int plz, String empfaenger, boolean mitUnterschrift) {
    lieferungen.add(new Brief(plz, empfaenger, mitUnterschrift));
  }

  public void printAll() {
    lieferungen.forEach(Lieferung::print);
  }

  public void print(int plz) {
    lieferungen.stream().filter(lieferung -> lieferung.getPlz() == plz).forEach(Lieferung::print);
  }

}
