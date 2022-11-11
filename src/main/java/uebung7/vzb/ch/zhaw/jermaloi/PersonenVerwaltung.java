package uebung7.vzb.ch.zhaw.jermaloi;

import java.util.Arrays;

public class PersonenVerwaltung {

	// erfasste personen (maximal 30)
	private Person [] personen = new Person[30];  
	
	// aktuelle Anzahl erfasster Personen
	private int anzahl = 0;

	public int getAnzahl() {
		return anzahl;
	}
	public void addPerson(Person p){
		this.personen[anzahl] = p;
		anzahl++;
	}

	public void printPersonen(){
		for (int i = 0; i < anzahl; i++){
			Person p = personen[i];
			String output = p.getName();
			output += " hat ";
			if(p.isKurzeHaare()){
				output += "kurze ";
			} else {
				output += "lange ";
			}
			output += p.getHaarfarbe();
			output += "e Haare und ";
			output += p.getAugenfarbe();
			output += "e Augen.";
			System.out.println(output);
		}
	}

	public Person getPerson(int index){
		if(index > anzahl){
			return null;
		}
		return personen[index];
	}

	public Person getPerson(String name){
		for(int i = 0; i < anzahl; i++) {
			if (personen[i].getName().equalsIgnoreCase(name)){
				return personen[i];
			}
		}
		return null;
	}

	public int getAnzahlMitMerkmal(String merkmal){
		int anzahlMerkmale = 0;
		for(int i = 0; i < anzahl; i++) {
			if (this.personen[i].getMerkmaleAlsCsv().contains(merkmal)){
				anzahlMerkmale++;
			}
		}
		return anzahlMerkmale;
	}

}
