package uebung6.vzb.ch.zhaw.rechsfil;


public class Person {
	
	private String name;
	private String haarfarbe;
	private boolean kurzeHaare;
	private String augenfarbe;
	private String haarfarbeVorschlag;

//Konstruktor
public Person(String name, String haarfarbe, boolean kurzeHaare, String augenfarbe, String haarfarbeVorschlag) {
	this.name = name;
	this.haarfarbe = haarfarbe;
	this.kurzeHaare = kurzeHaare;
	this.augenfarbe = augenfarbe;
	this.haarfarbeVorschlag = haarfarbeVorschlag;
}
//getter Methode
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
public String getHaarfarbeVorschlag() {
	return haarfarbeVorschlag;
}

public void printPerson(){
	if (kurzeHaare == true) {
		System.out.println(name + " hat " + " kurze " + haarfarbe + "e" + " Haare " + "und " + augenfarbe + "e" + " Augen.");
	}
	else{
		System.out.println(name + " hat" + " lange " + haarfarbe + "e" + " Haare " + "und " + augenfarbe + "e" + " Augen.");
	}
}


public boolean stimmtHaarfarbe() {
	if(haarfarbeVorschlag.equals(haarfarbe)) {
		return true;
	}
	else {
		return false;
	}
}

public String schneideHaare() {
	if(kurzeHaare == false) {
		kurzeHaare = true;
		return "Die Haare wurden geschnitten";
	}
	else {
		return "Die Haare sind bereits kurz";
	}
}



}
