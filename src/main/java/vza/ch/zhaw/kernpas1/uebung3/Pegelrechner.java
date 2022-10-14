package vza.ch.zhaw.kernpas1.uebung3;

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

		// Pegelstand
		double [] wasserImSee = new double[120];
		wasserImSee[0] = startWert;
		for (int i = 0; i < wasserImSee.length-1; i++) {
			wasserImSee[i+1] = wasserImSee[i] + (zufluss1[i]+zufluss2[i]-abfluss1[i])*60;
		}
		// hoechster Stand
		double hoechsterStand = startWert;
		for (int i = 0; i < wasserImSee.length; i++) {
			if (wasserImSee[i] > hoechsterStand) {
				hoechsterStand = wasserImSee[i];
			}
		}
		//Schadensgrenze überschritten
		int zaehler = 0;
		for (int i = 0; i< wasserImSee.length; i++) {
			if (wasserImSee[i] > schadensgrenze) {
				zaehler++;
			}
		}
		//Stollen ablass
		double [] wasserImSeeStollen = new double[120];
		wasserImSeeStollen[0] = startWert;
		for (int i = 0; i < wasserImSeeStollen.length-1; i++) {
			if(wasserImSeeStollen[i] > 55000) {
				wasserImSeeStollen[i+1] = wasserImSeeStollen[i] + (zufluss1[i]+zufluss2[i]-abfluss1[i]-4)*60;
			} else {
				wasserImSeeStollen[i+1] = wasserImSeeStollen[i] + (zufluss1[i]+zufluss2[i]-abfluss1[i])*60;
				}
		}
		// Stollen hoechster Stand
		double hoechsterStandStollen = startWert;
		for (int i = 0; i < wasserImSeeStollen.length; i++) {
			if (wasserImSeeStollen[i] > hoechsterStandStollen) {
				hoechsterStandStollen = wasserImSeeStollen[i];
			}
		}
		// Stollen Schadensgrenze ueberschritten
		int zaehler2 = 0;
		for (int i = 0; i< wasserImSeeStollen.length; i++) {
			if (wasserImSeeStollen[i] > schadensgrenze) {
				zaehler2++;
			}
		}
		System.out.println("\nMaximaler Füllstand: "+hoechsterStand+" m3");
		System.out.println("Zeit über Schadensgrenze: "+zaehler+" h\n");
		System.out.println("Maximaler Füllstand mit Stollen: "+hoechsterStandStollen+" m3");
		System.out.println("Zeit über Schadensgrenze trotz Stollen: "+zaehler2+" h");
		
		ZhawCsvLib.writeDoubleArray("ohneStollen.csv", wasserImSee);
		ZhawCsvLib.writeDoubleArray("mitStollen.csv", wasserImSeeStollen);
	}
}
