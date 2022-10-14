package vza.ch.zhaw.zuercja2.uebung3;

import ch.zhaw.lib.ZhawCsvLib;

public class Pegelrechner {

	public static void main(String[] args) {
		double startWert = 50000;
		 double schadensgrenze = 61500;
		 double [] zufluss1 = ZhawCsvLib.readDoubleArray("zufluss1.csv");
		 double [] zufluss2 = ZhawCsvLib.readDoubleArray("zufluss2.csv");
		 double [] abfluss1 = ZhawCsvLib.readDoubleArray("abfluss1.csv");

		 // Länge der Datensätze ausgeben
		 System.out.println("Werte Zufluss 1: "+zufluss1.length);
		 System.out.println("Werte Zufluss 2: "+zufluss2.length);
		 System.out.println("Werte Abfluss 1: "+abfluss1.length);
		 
		 double [] wasserImSee = new double[120] ;
		 wasserImSee [0] = 50000;
		 
		 
		 for(int i = 0;i<zufluss1.length;i++) {
			 wasserImSee[i+1]=wasserImSee[i]+(zufluss1[i]+zufluss2[i]-abfluss1[i])*60;
		 }
		 ZhawCsvLib.writeDoubleArray("ohneStollen.csv", wasserImSee);	
		 
		 double max = 0.0;
		 
		 for(int a = 0;a<wasserImSee.length;a++) {
			 if(wasserImSee[a]>max) {
				 max=wasserImSee[a];
			 }
		 }
		 System.out.println("Maximaler Füllstand: "+max+"m3");
		 
		 int wasser=0;
		 
		 for(int b=0; b<wasserImSee.length;b++) {
			 if(wasserImSee[b]>schadensgrenze) {
				 wasser++;
			 }
		
		 }
		 System.out.println("Zeit über Schadensgrenze: "+wasser+"h");
		 
		 int zeit=0;
		 int füllstand=55000;
		 double maximum=0;
		 for(int c=0; c<zufluss1.length;c++) {
			 
			 if(wasserImSee[c]>füllstand) {
				 wasserImSee[c+1]=wasserImSee[c]+(zufluss1[c]+zufluss2[c]-abfluss1[c]-4.0)*60;
				 
			 }
			 else if(wasserImSee[c]<füllstand) {
				 wasserImSee[c+1]=wasserImSee[c]+(zufluss1[c]+zufluss2[c]-abfluss1[c])*60;
			 }
		 	 
		 }
		 for(int d=0;d<wasserImSee.length;d++) {
			 if(wasserImSee[d]>maximum) {
				 maximum=wasserImSee[d];
			 }
		 }	
		 System.out.println("Maximaler Füllstand mit Stollen: "+maximum+"m3");
		 int e=0;
		 for(e=0;e<wasserImSee.length;e++) {
			 if(wasserImSee[e]>schadensgrenze) {zeit++;}
		 }
		 System.out.println("Zeit über Schadensgrenze: "+zeit+"h");

	}  

}
