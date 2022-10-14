package vza.ch.zhaw.streiluc.uebung3;

import ch.zhaw.lib.ZhawCsvLib;


public class Pegelrechner {
public static void main(String[] args) {
// Daten Einlesen
double startWert = 50000;
double schadensgrenze = 61500.0;
double [] zufluss1 = ZhawCsvLib.readDoubleArray("zufluss1.csv");
double [] zufluss2 = ZhawCsvLib.readDoubleArray("zufluss2.csv");
double [] abfluss1 = ZhawCsvLib.readDoubleArray("abfluss1.csv");
// Länge der Datensätze ausgeben
System.out.println("Werte Zufluss 1: "+zufluss1.length);
System.out.println("Werte Zufluss 2: "+zufluss2.length);
System.out.println("Werte Abfluss 1: "+abfluss1.length);
// TODO
double [] wasserImSee = new double[120];
wasserImSee[0] = startWert;

double [] wasserMitStollen = new double[120];
wasserMitStollen[0] = 0;
double max2 = 0;

int zeit = 0;
int zeit2= 0;
double max=wasserImSee[0];

//Pegelstand
for(int i=1; i < wasserImSee.length-1; i++) {
	if(max<wasserImSee[i]) {
	max = wasserImSee[0]+(zufluss1[i] + zufluss2[i] - abfluss1[i])*60;
	}
}
ZhawCsvLib.writeDoubleArray("ohneStollen.csv", wasserImSee);


	
	


for(int h=1; h<wasserImSee.length-1; h++) {
	if(wasserImSee[h] < max) {
	zeit++;	//zeit ein wenig zu hoch
	}
			
}
for(int r= 1; r < max; r+=4*60) {
	if(max >55000) {
		max-=r;
		zeit2++;//zeit zu hoch
		
	}
}
for(int i=1; i<wasserImSee.length-1; i++)	{
	if(wasserImSee[i] >= 55000) {
		max2 = wasserImSee[i]-=4*60;
	}//wasserstand zu hoch
}


ZhawCsvLib.writeDoubleArray("mitStollen.csv", wasserMitStollen);

System.out.println("Maximaler Fuellstand im See: "+ max + " m3" );
System.out.println("Zeit über Schadensgrenze: " +zeit +" h" );
System.out.println("Maximaler Füllstand mit Stollen: " +max2 +" m3");
System.out.println("Zeit über Schadensgrenze mit Stollen: " +zeit2 +" h");
}
}