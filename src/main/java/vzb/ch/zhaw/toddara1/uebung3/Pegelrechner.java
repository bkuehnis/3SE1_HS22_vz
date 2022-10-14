package vzb.ch.zhaw.toddara1.uebung3;

import ch.zhaw.lib.ZhawCsvLib;
import java.util.Arrays;

public class Pegelrechner {

	public static void main(String[] args) {
		// Daten Einlesen
		double startWert = 50000;
		double schadensgrenze = 61500;
		double füllstand;
		double delta;
		double[] zufluss1 = ZhawCsvLib.readDoubleArray("zufluss1.csv");
		double[] zufluss2 = ZhawCsvLib.readDoubleArray("zufluss2.csv");
		double[] abfluss1 = ZhawCsvLib.readDoubleArray("abfluss1.csv");

		// Länge der Datensätze ausgeben
		System.out.println("Werte Zufluss 1: " + zufluss1.length);
		System.out.println("Werte Zufluss 2: " + zufluss2.length);
		System.out.println("Werte Abfluss 1: " + abfluss1.length);

		double count = 0;

		delta = ((zufluss1.length + zufluss2.length - abfluss1.length) * 60);
		füllstand = (startWert + delta); // Füllstand berechnen

		//TODO Kommentar von kuhs: Dies ist zu wenig!
//		double[] ausgabe = ZhawCsvLib.writeDoubleArray("füllstände.csv", füllstand) // Array für berechnete Füllstände erstellen
//
//		for (double i = 0; i < füllstand.length; i++) {
//			System.out.println(füllstand[i]);				//Alle Werte von Array Füllstand ausgeben
//		}
//
//		Arrays.toString(double[i]);
//		System.out.println(Arrays.toString());

		// TODO
	}

}
