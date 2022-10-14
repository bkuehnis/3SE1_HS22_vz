package vza.ch.zhaw.drmicfil.uebung3;

import ch.zhaw.lib.ZhawCsvLib;
public class Pegelrechner {

		public static void main(String[] args) {
			
			// Daten Einlesen verknüpft mit den jeweiligen Dateien
			
			double startWert = 50000;
			double schadensgrenze = 61500;
			double [] zufluss1 = ZhawCsvLib.readDoubleArray("zufluss1.csv");
			double [] zufluss2 = ZhawCsvLib.readDoubleArray("zufluss2.csv");
			double [] abfluss1 = ZhawCsvLib.readDoubleArray("abfluss1.csv");
			

			//Länge der Datensetze ausgeben
			
			System.out.println("Werte Zufluss 1: "+zufluss1.length);
			System.out.println("Werte Zufluss 2: "+zufluss2.length);
			System.out.println("Werte Abfluss 1: "+abfluss1.length);
			
			//Pegelstand Pneu berechnen in Stunden
			
			double neuerWert = 0;
			double [] wasserImSee = new double [120]; //120 Messwerte 
			wasserImSee[0] = 50000;
			
			for (int i = 0; i<zufluss1.length; i++) {
				neuerWert = startWert + (zufluss1[i]+zufluss2[i]-abfluss1[i])*60; //Rechnung vom PDF
				startWert = neuerWert;
				wasserImSee[i+1] = startWert;
			
				
			}
			
			
			
			System.out.println("Neuer Wert: "+wasserImSee[1]);
			
			
			double max = wasserImSee[0];
			for (int i1=0; i1<wasserImSee.length; i1++) 
				if (wasserImSee[i1]>max) {
					max = wasserImSee[i1];
					
					
			}		
			System.out.println("Maximaler Füllstand: "+max+"m3");
					
			int überSchreitung = 0;
			for (int i1=0; i1<wasserImSee.length; i1++) {
				if (wasserImSee[i1]>schadensgrenze) {
					überSchreitung++;
				}
			}

			System.out.println("Zeit über Schadensgrenze: " +überSchreitung+"h");
			
			ZhawCsvLib.writeDoubleArray("ohneStollen.csv", wasserImSee);
			
			
			
			//Aufgabe g Schleuse offen oder zu //-4 wegen Ablass
			
			
			
			
			
			
			double [] wasserImSeeneu = new double [wasserImSee.length];				
			wasserImSeeneu[0] = 50000.0;
			
			
			
			for (int count = 0; count<119; count++)
				if (wasserImSeeneu[count]>55000.0) {
					wasserImSeeneu[count+1] = wasserImSeeneu[count]+(zufluss1[count]+zufluss2[count]-abfluss1[count]-4)*60; 
					
				} 

			
			
			double maxNeu = wasserImSeeneu[0];
			for (int count1=0; count1<wasserImSeeneu.length; count1++) {
				if (wasserImSeeneu[count1]>maxNeu) {
					maxNeu = wasserImSeeneu[count1];
				}
			}
			
			int überSchreitung2 = 0;
			
			for (int s=0; s<wasserImSeeneu.length; s++) {
				if (wasserImSeeneu[s]>schadensgrenze) {
					überSchreitung2++;
				}
			}
			
			System.out.println("Maximaler Füllstand mit Stollen: "+maxNeu+"m3");
			System.out.println("Zeit über Schadensgrenze: "+überSchreitung2+"h");

			
			
			

		}
}



