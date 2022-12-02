package uebung10.vzb.ch.zhaw.bosluc01;


public class Lieferung {

  private int plz;
  private String empfaenger;

  public Lieferung(int plz, String empfaenger) {
    this.plz = plz;
    this.empfaenger = empfaenger;
  }

  public int getPlz() {
    return plz;
  }

  public String getEmpfaenger() {
    return empfaenger;
  }

  public void print() {
    System.out.println("\n-PLZ: " + this.plz + "\n-Empfänger: " + this.empfaenger);
  }

}
