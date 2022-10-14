package vzb.ch.zhaw.bauckluc.uebung3;

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
		 
		 double [] pegelstand = new double[zufluss1.length+1];
		 pegelstand[0] = startWert;
		 for (int i=1;i<pegelstand.length;i++) {
			 pegelstand[i]=pegelstand[i-1]+(zufluss1[i-1]+zufluss2[i-1]-abfluss1[i-1])*60;
		 } ZhawCsvLib.writeDoubleArray("ohneStollen.csv", pegelstand);
		 
		 double maxPegelstand=0;
		 for (int j=0; j<pegelstand.length; j++) {
			 if (maxPegelstand<pegelstand[j]) {
				 maxPegelstand=pegelstand[j];
			 }
				 
		 } 
		 System.out.println(maxPegelstand+ " m3");
		 
		 double zeit=0;
		 for (int k=0;k<pegelstand.length;k++) {
			 if (pegelstand[k]>schadensgrenze) {
				 zeit++;
			 }
		 }
		 System.out.println(zeit+" h");
		 
		 double [] pegelstandStollen = new double[zufluss1.length+1];
		 pegelstandStollen[0] = startWert;
		 for (int o=1;o<pegelstandStollen.length;o++) {
			 if (pegelstand[o-1]>55000){
				 pegelstandStollen[o]=pegelstandStollen[o-1]+(zufluss1[o-1]+zufluss2[o-1]-abfluss1[o-1]-4.0)*60;
			 } else {
				 pegelstandStollen[o]=pegelstandStollen[o-1]+(zufluss1[o-1]+zufluss2[o-1]-abfluss1[o-1])*60;
			 }
		 } ZhawCsvLib.writeDoubleArray("mitStollen.csv", pegelstandStollen);
		 
		 double maxPegelstandStollen=0;
		 for (int p=0; p<pegelstandStollen.length; p++) {
			 if (maxPegelstandStollen<pegelstandStollen[p]) {
				 maxPegelstandStollen=pegelstandStollen[p];
			 }
		 } 
		 System.out.println(maxPegelstandStollen+ " m3");
		 int zeitStollen = 0;
		 for (int q=0;q<pegelstandStollen.length;q++) {
			 if(pegelstandStollen[q]>schadensgrenze) {
				 zeitStollen++;
			 }
		 }
		 System.out.println(zeitStollen+" h");
		 }
}
