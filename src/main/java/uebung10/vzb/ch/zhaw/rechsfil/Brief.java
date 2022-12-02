package uebung10.vzb.ch.zhaw.rechsfil;

public class Brief extends Lieferung{

    private boolean mitUnterschrift;

    public Brief(int plz, String empfaenger, boolean mitUnterschrift) {
        super(plz, empfaenger);
        this.mitUnterschrift = mitUnterschrift;
    }

    public boolean isMitUnterschrift() {
        return mitUnterschrift;
    }

    @Override
    public void print() {
        System.out.println("");
        System.out.println("Brief");
        System.out.println("-PLZ: " + getPlz());
        System.out.println("-Empf‰nger: " + getEmpfaenger());
        System.out.println("-Unterschrift: " + (mitUnterschrift ? "ja" : "nein"));
    }
}
