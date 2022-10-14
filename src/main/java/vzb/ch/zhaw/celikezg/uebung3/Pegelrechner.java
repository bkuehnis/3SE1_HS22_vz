package vzb.ch.zhaw.celikezg.uebung3;

import ch.zhaw.lib.ZhawCsvLib;
public class Pegelrechner {

	public static void main(String[] args) {
		
		double startWert = 50000;
		double schadensgrenze = 61500;
		double schwellwertSchleuse = 55000;
		double durchlassStollen = 4;
		
		double [] zufluss1 = ZhawCsvLib.readDoubleArray("zufluss1.csv");
		double [] zufluss2 = ZhawCsvLib.readDoubleArray("zufluss2.csv");
		double [] abfluss1 = ZhawCsvLib.readDoubleArray("abfluss1.csv");
		
		
		System.out.println("Werte Zufluss 1: "+zufluss1.length);
		System.out.println("Werte Zufluss 2: "+zufluss2.length);
		System.out.println("Werte Abfluss 1: "+abfluss1.length);
		
		
		double [] wasserImSee = new double[zufluss1.length+1];
		wasserImSee[0] = startWert;
		for (int i=0; i<zufluss1.length; i++) {
			wasserImSee[i+1] += wasserImSee[i] + (zufluss1[i]+zufluss2[i]-abfluss1[i])*60.0;
		}
		ZhawCsvLib.writeDoubleArray("ohneStollen.csv", wasserImSee);
		
		
		double max = wasserImSee[0];
		for (int i=1; i<wasserImSee.length; i++) {
			if (wasserImSee[i]>max) {
				max = wasserImSee[i];
			}
		}
		System.out.println("Maximaler Fuellstand: "+max+" m3");
		
		
		int ueberSchadensgrenze = 0;
		for (int i=1; i<wasserImSee.length; i++) {
			if (wasserImSee[i]>schadensgrenze) {
				ueberSchadensgrenze++;
			}
		}
		System.out.println("Zeit ueber Schadensgrenze: "+ueberSchadensgrenze+" h");
		
		
		double [] wasserImSeeMitStollen = new double[zufluss1.length+1];
		wasserImSeeMitStollen[0] = startWert;
		for (int i=0; i<zufluss1.length; i++) {
			double abflussStollen = 0;
			if (wasserImSeeMitStollen[i] > schwellwertSchleuse) {
				abflussStollen = durchlassStollen;
			}
			wasserImSeeMitStollen[i+1] += wasserImSeeMitStollen[i] + (zufluss1[i]+zufluss2[i]-abfluss1[i]-abflussStollen)*60.0;
		}
		ZhawCsvLib.writeDoubleArray("mitStollen.csv", wasserImSeeMitStollen);
		
		
		double max2 = wasserImSeeMitStollen[0];
		for (int i=1; i<wasserImSeeMitStollen.length; i++) {
			if (wasserImSeeMitStollen[i]>max2) {
				max2 = wasserImSeeMitStollen[i];
			}
		}
		System.out.println("Maximaler Fuellstand mit Stollen: "+max2+" m3");
		
	
		int ueberSchadensgrenze2 = 0;
		for (int i=1; i<wasserImSeeMitStollen.length; i++) {
			if (wasserImSeeMitStollen[i]>schadensgrenze) {
				ueberSchadensgrenze2++;
			}
		}
		System.out.println("Zeit ueber Schadensgrenze: "+ueberSchadensgrenze2+" h");	
	}
}