package uebung10.vzb.ch.zhaw.bosluc01;


public class Paket extends Lieferung {

  private double gewicht;

  public Paket(int plz, String empfaenger, double gewicht) {
    super(plz, empfaenger);
    this.gewicht = gewicht;
  }

  public double getGewicht() {
    return gewicht;
  }

  @Override
  public void print() {
    System.out.print("\nPaket");
    super.print();
    System.out.println("-Gewicht: " + this.gewicht);
  }

}
