package vzb.ch.zhaw.durmibet.uebung3;

import ch.zhaw.lib.ZhawCsvLib;
public class Pegelrechner {

	public static void main(String[] args) {
		 // Daten Einlesen
		 double startWert = 50000;
		 double schadensgrenze = 61500;
		 double [] zufluss1 = ZhawCsvLib.readDoubleArray("zufluss1.csv");
		 double [] zufluss2 = ZhawCsvLib.readDoubleArray("zufluss2.csv");
		 double [] abfluss1 = ZhawCsvLib.readDoubleArray("abfluss1.csv");
		 
		 // Länge der Datensätze ausgeben
		 System.out.println("Werte Zufluss 1: "+zufluss1.length);
		 System.out.println("Werte Zufluss 2: "+zufluss2.length);
		 System.out.println("Werte Abfluss 1: "+abfluss1.length);
		 
		 // TODO
		 
		 
		// Ich habe die Aufgabe mit Monyrak gemacht, da ich keine Ahnung hatte, wie ich da vorangehen soll. //
		 double [] WasserImSee = new double [120];
		 double maxFuellstand = WasserImSee [0];
		 int zeitUeberSchadensgrenze = 0;{
		 WasserImSee[0] = startWert;
		 
		 for (int i=1; i<WasserImSee.length; i++) {
			 WasserImSee[i] = WasserImSee[i-1]+(zufluss1[i-1]+zufluss2[i-1]-abfluss1[i-1])*60;
			 
			 if (WasserImSee[i] > maxFuellstand) {
				 maxFuellstand = WasserImSee[i];
			 }
			 if (WasserImSee[i] > schadensgrenze) {
				 zeitUeberSchadensgrenze++; 
			 }
			 if (WasserImSee[i] >= 55000) {
				 WasserImSee[i] -= 240;
			 }
			 }
		 ZhawCsvLib.writeDoubleArray("ohneStollen.csv", WasserImSee);
		 
		 System.out.println("Maximaler Füllstand: "+maxFuellstand+ "m3");
		 System.out.println("Zeit über Schadensgrenze: " +zeitUeberSchadensgrenze+ " h");
		 }
		 }
	}// Ich habe die Aufgabe mit Monyrak gemacht, da ich keine Ahnung hatte, wie ich da vorangehen soll. //

	 



