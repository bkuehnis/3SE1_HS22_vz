package uebung10.vzb.ch.zhaw.anderni2;

public class Brief extends Lieferung {
    private final boolean mitUnterschrift;

    public Brief(int plz, String empfaenger, boolean mitUnterschrift) {
        super(plz, empfaenger);
        this.mitUnterschrift = mitUnterschrift;
    }

    public boolean isMitUnterschrift() {
        return true;
    }

    public void print() {

        String janein = "nein";
        if (isMitUnterschrift()) {
            janein = "ja";
        }

        System.out.println();
        System.out.println("Brief");
        super.print();
        System.out.println("-Unterschrift: " + janein);
    }
}
