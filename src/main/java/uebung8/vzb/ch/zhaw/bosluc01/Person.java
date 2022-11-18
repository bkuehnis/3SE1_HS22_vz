package uebung8.vzb.ch.zhaw.bosluc01;

public class Person {
  private String name;
  private String haarfarbe;
  private boolean kurzeHaare;
  private String augenfarbe;

  public Person(String name, String haarfarbe, boolean kurzeHaare, String augenfarbe) {
    this.name = name;
    this.haarfarbe = haarfarbe;
    this.kurzeHaare = kurzeHaare;
    this.augenfarbe = augenfarbe;
  }

  public String getName() {
    return name;
  }

  public String getHaarfarbe() {
    return haarfarbe;
  }

  public boolean isKurzeHaare() {
    return kurzeHaare;
  }

  public String getAugenfarbe() {
    return augenfarbe;
  }

  private String getHaarlaenge() {
    return kurzeHaare ? "kurz" : "lang";
  }
  
  public void printPerson() {
    System.out.println(
        name + " hat " + getHaarlaenge() + "e " + haarfarbe + "e Haare und " + augenfarbe + "e Augen.");
  }

  public boolean stimmtName(String name) {
    return this.name.equals(name);
  }

  public boolean stimmtHaarfarbe(String haarfarbe) {
    return this.haarfarbe.equals(haarfarbe);
  }

  public boolean stimmtKurzeHaare(boolean kurzeHaare) {
    return this.kurzeHaare == kurzeHaare;
  }

  public boolean stimmtAugenfarbe(String augenfarbe) {
    return this.augenfarbe.equals(augenfarbe);
  }

  // Redundanz vermeiden:
  public void printStimmtHaarfarbe(String haarfarbe) {
    System.out.println(this.getName() + " hat " + haarfarbe + "e Haare: " + this.stimmtHaarfarbe(haarfarbe));
  }

  private String getNamePossessive() {
    return this.getName() + (this.getName().endsWith("x") || this.getName().endsWith("s") ? "'" : "s");
  }

  public String schneideHaare() {
    if (this.kurzeHaare) {
      return this.getNamePossessive() + " Haare sind bereits kurz.";
    } else {
      this.kurzeHaare = true;
      return this.getNamePossessive() + " Haare wurden geschnitten.";
    }
  }
  
  public String[] getMerkmaleAlsArray() {
    return new String[] {
        getHaarlaenge() + "e Haare",
        haarfarbe + "e Haare",
        augenfarbe + "e Augen"
    };
  }
  
  public String getMerkmaleAlsCsv() {
    return String.join(",", getMerkmaleAlsArray());
  }
}