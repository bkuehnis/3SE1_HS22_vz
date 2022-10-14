package vza.ch.zhaw.reichraf.uebung3;

import ch.zhaw.lib.ZhawCsvLib;
import java.util.Iterator;

public class Pegelrechner {

	public static void main(String[] args) {
		// Daten Einlesen
		double startWert = 50000;
		double schadensgrenze = 61500;
		double wasserImSee = startWert;
		
		double [] pneu = new double [119];
		double [] pneu2 = new double [119];
		
		pneu [0] = startWert;
		pneu2 [0] = startWert;
		
		double max = pneu[0];
		double max2 = pneu2 [0];
		
		int grenzwert = 0;
		int grenzwert2 = 0;
		
		int entlastungsstollen = 4;
 		
		double [] zufluss1 = ZhawCsvLib.readDoubleArray("zufluss1.csv");
		double [] zufluss2 = ZhawCsvLib.readDoubleArray("zufluss2.csv");
		double [] abfluss1 = ZhawCsvLib.readDoubleArray("abfluss1.csv");

		// Länge der Datensätze ausgeben
		// Daten einlesen
		System.out.println("Werte Zufluss 1: "+zufluss1.length);
		System.out.println("Werte Zufluss 2: "+zufluss2.length);
		System.out.println("Werte Abfluss 1: "+abfluss1.length);
		
		// TODO
		
		// Wasserstand ohne Stollen
		for (int i=1; i<pneu.length;i++) {
			pneu [i] = pneu[i-1] + (zufluss1 [i-1] + zufluss2 [i-1] - abfluss1[i-1]) * 60;
		}
		// Wasserstand mit Stollen
		for (int i=1; i<pneu2.length;i++) {
			pneu2 [i] = pneu2[i-1] + (zufluss1 [i-1] + zufluss2 [i-1] - abfluss1[i-1]) * 60;
			
			
			if (pneu2 [i-1]> 55000) {
			pneu2[i]-=(entlastungsstollen*60);
				
			}
			
		} 
		
		// Maximale Wasserstandhöhe ohne stollen
		for (int i=1; i<pneu.length; i++) {
		if (pneu[i]>max) {
		max = pneu[i];
		}
		}
		
		System.out.println("Maximaler Füllstand: " +max+ " m3");
		
		
		// Maximale Wasserstandhöhe mit stollen
		for (int i=1; i<pneu2.length; i++) {
			if (pneu2[i]>max2) {
			max2 = pneu2[i];
			}
			}
			
		
		// überschwemmungstunden ohne stollen
		for (int i=1; i<pneu.length; i++) {
			if (pneu[i]>schadensgrenze) {
			grenzwert ++;
			}
			}
		
		System.out.println("Zeit über Schadensgrenze: " + grenzwert + " h");
		
		// überschwemmungstunden mit stollen
		for (int i=1; i<pneu2.length; i++) {
			if (pneu2[i]>schadensgrenze) {
			grenzwert2 ++;
			}
			}
		System.out.println("Maximaler Füllstand: " +max2+ " m3");
		System.out.println("Zeit über Schadensgrenze: " + grenzwert2 + " h");
		
	}
}