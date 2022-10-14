package vzb.ch.zhaw.straueri.uebung3;

import ch.zhaw.lib.ZhawCsvLib;
public class Pegelrechner {
 public static void main(String[] args) {
 // Daten Einlesen
 double startWert = 50000;
 double schadensgrenze = 61500;
 double [] zufluss1 = ZhawCsvLib.readDoubleArray("zufluss1.csv");
 double [] zufluss2 = ZhawCsvLib.readDoubleArray("zufluss2.csv");
 double [] abfluss1 = ZhawCsvLib.readDoubleArray("abfluss1.csv");
 
 double [] WasserImSee = new double [120];
 WasserImSee[0] = startWert;		 
 int runden = 1;

 // Länge der Datensätze ausgeben
 System.out.println("Werte Zufluss 1: "+zufluss1.length);
 System.out.println("Werte Zufluss 2: "+zufluss2.length);
 System.out.println("Werte Abfluss 1: "+abfluss1.length);

 // TODO
 int Zeit = 0;
 double max = WasserImSee[0];
 while ( runden < 120) {
	 WasserImSee[runden] = WasserImSee[runden-1]+(zufluss1[runden-1]+zufluss2[runden-1]-abfluss1[runden-1])*60;
	
	 runden++;
	 ZhawCsvLib.writeDoubleArray("ohneStollen.csv", WasserImSee);
 }
for (int i=0; i<WasserImSee.length; i++) {
	if(WasserImSee[i]>max) {
		max=WasserImSee[i];
	}
	
}
for(int e=0; schadensgrenze<WasserImSee[e] ; e++) {
	Zeit++;
}
System.out.println("Maximaler Füllstand: "+max+" m3");
System.out.println("Zeit über Schadensgrenze: "+Zeit+" h");
}
 
}