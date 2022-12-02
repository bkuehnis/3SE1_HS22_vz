package uebung10.vzb.ch.zhaw.bosluc01;


public class Brief extends Lieferung {

  private boolean mitUnterschrift;

  public Brief(int plz, String empfaenger, boolean mitUnterschrift) {
    super(plz, empfaenger);
    this.mitUnterschrift = mitUnterschrift;
  }

  public boolean getMitUnterschrift() {
    return mitUnterschrift;
  }

  @Override
  public void print() {
    System.out.print("\nBrief");
    super.print();
    System.out.println("-Unterschrift: " + (this.mitUnterschrift ? "ja" : "nein"));
  }

}
