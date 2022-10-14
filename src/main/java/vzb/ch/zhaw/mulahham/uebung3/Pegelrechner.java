package vzb.ch.zhaw.mulahham.uebung3;

import ch.zhaw.lib.ZhawCsvLib;
public class Pegelrechner {
	public static void main(String[] args) {
		// Daten Einlesen
		double startWert = 50000;
		double schadensgrenze = 61500;

		double[] zufluss1 = ZhawCsvLib.readDoubleArray("zufluss1.csv");
		double[] zufluss2 = ZhawCsvLib.readDoubleArray("zufluss2.csv");
		double[] abfluss1 = ZhawCsvLib.readDoubleArray("abfluss1.csv");

		double[] ohneStollen = new double[zufluss1.length + 1];
		double[] mitStollen = new double[zufluss1.length + 1];

		double tOhneStollenSchadensgrenze = 0;
		double tMitStollenSchadensgrenze = 0;

		double maxOhneStollenFuellstand = startWert;
		double maxMitStollenFuellstand = startWert;

		double stollenOeffnungsWert = 55000;
		double stollenAbfluss = 4.0;

		ohneStollen[0] = startWert;
		mitStollen[0] = startWert;

		for (int i = 1; i <= zufluss1.length; i++) {
			ohneStollen[i] = ohneStollen[i-1] + (zufluss1[i-1] + zufluss2[i-1] - abfluss1[i-1]) * 60;

			if (ohneStollen[i] > maxOhneStollenFuellstand) {
				maxOhneStollenFuellstand = ohneStollen[i];
			}
			
			if (ohneStollen[i] > schadensgrenze) {
				tOhneStollenSchadensgrenze++;
			}
		}

		for (int i = 1; i <= zufluss1.length; i++) {
			if (mitStollen[i-1] > stollenOeffnungsWert){
				mitStollen[i] = mitStollen[i-1] + (zufluss1[i-1] + zufluss2[i-1] - abfluss1[i-1] - stollenAbfluss) * 60;
			}
			else {
				mitStollen[i] = mitStollen[i-1] + (zufluss1[i-1] + zufluss2[i-1] - abfluss1[i-1]) * 60;
			}

			if (mitStollen[i] > maxMitStollenFuellstand) {
				maxMitStollenFuellstand = mitStollen[i];
			}

			if (mitStollen[i] > schadensgrenze) {
				tMitStollenSchadensgrenze++;
			}
		}

		ZhawCsvLib.writeDoubleArray("ohneStollen.csv", ohneStollen);
		ZhawCsvLib.writeDoubleArray("mitStollen.csv", mitStollen);

		System.out.println("Maximaler Füllstand: " + maxOhneStollenFuellstand + " m3");
		System.out.println("Zeit über Schadensgrenze: " + tOhneStollenSchadensgrenze + " h");
		System.out.println("");
		System.out.println("Maximaler Füllstand mit Stollen: " + maxMitStollenFuellstand + " m3");
		System.out.println("Zeit über Schadensgrenze: " + tMitStollenSchadensgrenze + " h");

	}
}