package uebung10.vzb.ch.zhaw.jermaloi;

import java.util.ArrayList;
import java.util.List;

public class Liefertour {

    private List<Lieferung> lieferungen = new ArrayList<>();

    public void addBrief(int plz, String empfaenger, boolean mitUnterschrift) {
        lieferungen.add(new Brief(plz, empfaenger, mitUnterschrift));
    }

    public void addPaket(int plz, String empfaenger, double gewicht) {
        lieferungen.add(new Paket(plz, empfaenger, gewicht));
    }

    public void print(int plz) {
        lieferungen.forEach(lieferung -> {
            if (lieferung.getPlz() == plz) {
                lieferung.print();
            }
        });
    }

    public void printAll() {
        lieferungen.forEach(Lieferung::print);
    }
}
