package vza.ch.zhaw.seemaala.uebung3;

import ch.zhaw.lib.ZhawCsvLib;

public class Winsee {

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
		 
		 double [] wasserImSee = new double [120];
		 wasserImSee [0]  = startWert;
		 
		 for (int i = 0; i < zufluss1.length; i++) {
			 wasserImSee[i+1]=wasserImSee[i]+(zufluss1[i]+zufluss2[i]-abfluss1[i])*60;
		 }
		 
		 ZhawCsvLib.writeDoubleArray("ohneStollen.csv", wasserImSee);
		 
		 double max=0.0;
		 
		 for(int j = 0; j<wasserImSee.length; j++) {
			 if (wasserImSee[j]>max) {
				 max = wasserImSee[j];
			 }
		 }
		 System.out.println("Maximaler Fuellstand: "+max+" m3");
		 
		int zeit = 0;
		
		 
		 for (int k = 0; k < wasserImSee.length; k++) {
		if ( wasserImSee[k]> schadensgrenze) {
			zeit++;
		}}
		 
			 System.out.println("Zeit ueber der Schadensgrenze: "+zeit+" h");
			 
			 double [] wasserImSee1 = new double [120];
			 wasserImSee1 [0]  = 50000;
			 
			 
			 for (int n = 0; n < zufluss1.length; n++) {
				 if (wasserImSee1[n] > 55000) {
					 wasserImSee1[n+1]=wasserImSee1[n]+(zufluss1[n]+zufluss2[n]-abfluss1[n]-4.0)*60;}
					 else if(wasserImSee1[n] < 55000) {
						 wasserImSee1[n+1]=wasserImSee1[n]+(zufluss1[n]+zufluss2[n]-abfluss1[n])*60;}
			 
			 double max1 = 0.0;
			 for(int g = 0; g<wasserImSee1.length; g++) {
				 if (wasserImSee1[g]>max1) {
					 max1 = wasserImSee1[g];
				 }}
		 
			 System.out.println("Maximaler Fuellstand mit Stollen: "+max1+" m3");
			 int zeit1 = 0;
			 for (int c = 0; c < wasserImSee1.length; c++) {
					if ( wasserImSee1[c]> schadensgrenze) {
						zeit1++;
					}}
			 
			 System.out.println("Zeit ueber der Schadensgrenze: "+zeit1+" h");
	}}}
