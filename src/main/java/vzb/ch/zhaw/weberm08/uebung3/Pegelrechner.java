package vzb.ch.zhaw.weberm08.uebung3;

import ch.zhaw.lib.ZhawCsvLib;
public class Pegelrechner {
	public static void main(String[] args) {
		// Daten Einlesen
		double startWert = 50000;
		double schadensgrenze = 61500;
		double[] zufluss1 = ZhawCsvLib.readDoubleArray("zufluss1.csv");
		double[] zufluss2 = ZhawCsvLib.readDoubleArray("zufluss2.csv");
		double[] abfluss1 = ZhawCsvLib.readDoubleArray("abfluss1.csv");
		double[] wasserImSeeWithRT = new double[zufluss1.length];
		double[] wasserImSee = new double[zufluss1.length];
		double[][] wasserImSeeArrays = new double [2][wasserImSeeWithRT.length];
		double highestVal = 0;
		double highestValWithRT = 0;
		int timeOverDamageLimit = 0;
		int timeOverDamageLimitWithRT = 0;
		double reliefTunnel = 0;

		// Länge der Datensätze ausgeben
		System.out.println("Werte Zufluss 1: " + zufluss1.length);
		System.out.println("Werte Zufluss 2: " + zufluss2.length);
		System.out.println("Werte Abfluss 1: " + abfluss1.length);
		System.out.println("");
		
		for (int i = 0; zufluss1.length > i; i++) {
			//Verwende den Ausgangswert, beim ersten Arraywert
			if (i == 0) {
				wasserImSee[i] = startWert + (zufluss1[i] + zufluss2[i] - abfluss1[i]) * 60;
				wasserImSeeWithRT[i] = wasserImSee[i];
			} else {
				wasserImSee[i] = wasserImSee[i - 1] + (zufluss1[i] + zufluss2[i] - abfluss1[i]) * 60;
				wasserImSeeWithRT[i] = wasserImSeeWithRT[i - 1] + (zufluss1[i] + zufluss2[i] - abfluss1[i] + reliefTunnel) * 60;
			}
			
			//Berechnung ohne Entlastungsstollen
			if (highestVal < wasserImSee[i]) {
				highestVal = wasserImSee[i];
			}
			
			if (schadensgrenze < wasserImSee[i]) {
				timeOverDamageLimit++;
			}
			
			//Berechnung mit Entlastungsstollen
			if (highestValWithRT < wasserImSeeWithRT[i]) {
				highestValWithRT = wasserImSeeWithRT[i];
			}
			
			if (schadensgrenze < wasserImSeeWithRT[i]) {
				timeOverDamageLimitWithRT++;
			}
			
			if (wasserImSeeWithRT[i] > 55000.0) {
				reliefTunnel = openReliefTunnel();
			} else {
				reliefTunnel = closeReliefTunnel();
			}
		}

		System.out.println("Maximaler Füllstand: " + highestVal + " m3");
		System.out.println("Zeit über Schadensgrenze: " + timeOverDamageLimit + " h");
		System.out.println("");
		System.out.println("Mit Entlastungsstollen:");
		System.out.println("");
		System.out.println("Maximaler Füllstand: " + highestValWithRT + " m3");
		System.out.println("Zeit über Schadensgrenze: " + timeOverDamageLimitWithRT + " h");
		
		wasserImSeeArrays = createTwoDimensionalArray(wasserImSee, wasserImSeeWithRT);
		
		ZhawCsvLib.writeDoubleArray("mitUndOhneStollen.csv", wasserImSeeArrays);
	}
	
	public static double openReliefTunnel() {
		return -4.0;
	}
	
	public static double closeReliefTunnel() {
		return 0;
	}
	
	public static double[][] createTwoDimensionalArray(double[] array1, double[] array2) {
		double[][] twoDimensionalArray = new double[2][array2.length];
		
		//2 Dimensionaler Array, erste Reihe ist bei 0, die zweite Reihe bei 1
		for (int i = 0; i < array1.length; i++) {
			twoDimensionalArray[0][i] = array1[i];
			twoDimensionalArray[1][i] = array2[i];
		}
		
		return twoDimensionalArray;
	}
	
}