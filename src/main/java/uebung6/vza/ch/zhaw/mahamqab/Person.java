package uebung6.vza.ch.zhaw.mahamqab;


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
public void printPerson() {
System.out.println(name+" hat "+kurzeHaare+" "+haarfarbe+" Haare und "+augenfarbe+" Augen.");
}
//boolean

public String getName() {
return name;
}
public String getHaarfarbe() {
return haarfarbe;
}
public boolean getKurzeHaare() {
return kurzeHaare;
}
public String getAugenfarbe() {
return augenfarbe;
}



public boolean stimmtHaarfarbe(String haarfarbeTrue) {
System.out.println(this.name + " hat "+ haarfarbeTrue+ "e" + " Haare: " + haarfarbe.equals(haarfarbeTrue));
return haarfarbe.equals(haarfarbeTrue);
}

{



}
}

