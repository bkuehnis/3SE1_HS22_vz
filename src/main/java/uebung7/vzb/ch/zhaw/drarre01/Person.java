package uebung7.vzb.ch.zhaw.drarre01;


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

public void setName(String name) {
	this.name = name;
}

public String getHaarfarbe() {
	return haarfarbe;
}

public void setHaarfarbe(String haarfarbe) {
	this.haarfarbe = haarfarbe;
}

public boolean isKurzeHaare() {
	return kurzeHaare;
}

public void setKurzeHaare(boolean kurzeHaare) {
	this.kurzeHaare = kurzeHaare;
}

public String getAugenfarbe() {
	return augenfarbe;
}

public void setAugenfarbe(String augenfarbe) {
	this.augenfarbe = augenfarbe;
}
public void printPerson() {
	if(kurzeHaare) {
		System.out.println(name+" hat kurze "+haarfarbe+"e Haare und "+augenfarbe+"e Augen.");
		}
	else {
		System.out.println(name+" hat lange "+haarfarbe+"e Haare und "+augenfarbe+"e Augen.");
	}
	}
public boolean stimmtHaarfarbe(String farbe) {
	if(farbe==haarfarbe) {
		return true;
	}else {
		return false;
	}

}
public String schneideHaare() {
	if(kurzeHaare) {
		return name+"s Haare sind bereits kurz.";
	}else {
		return name+"s Haare wurden geschnitten.";
	}
}
public String getMerkmaleAlsCsv() {
	if(kurzeHaare) {
		return "kurze Haare,"+haarfarbe+"e Haare,"+augenfarbe+"e Augen";
	}else {return "lange Haare,"+haarfarbe+"e Haare,"+augenfarbe+"e Augen";}
}
}
