package vzb.ch.zhaw.merkjoe1.uebung3;

import ch.zhaw.lib.ZhawCsvLib;
public class Pegelrechner {
	
	public static void main(String[] args) {
		// Daten Einlesen
		double startWert = 50000;
		double schadensgrenze = 61500;
		double prevschaden = 55000;
		double abfluss2 = 4.0;
		double [] zufluss1 = ZhawCsvLib.readDoubleArray("zufluss1.csv");
		double [] zufluss2 = ZhawCsvLib.readDoubleArray("zufluss2.csv");
		double [] abfluss1 = ZhawCsvLib.readDoubleArray("abfluss1.csv");
		

		// Länge der Datensätze ausgeben
		System.out.println("Werte Zufluss 1: "+zufluss1.length);
		System.out.println("Werte Zufluss 2: "+zufluss2.length);
		System.out.println("Werte Abfluss 1: "+abfluss1.length);
		
		// Wasserstand
		double [] wasserImSee = new double[abfluss1.length];
		for(int i = 1; i < zufluss1.length; i++) 
		{
			wasserImSee [0] = startWert+((zufluss1[0]+zufluss2[0]-abfluss1[0])*60);
			wasserImSee [i] = wasserImSee [i-1]+((zufluss1[i]+zufluss2[i]-abfluss1[i])*60);
		}
		ZhawCsvLib.writeDoubleArray("Füllstand_1.csv", wasserImSee);
		
		// Maximaler Wasserstand
		double max = wasserImSee[0];
		
		for (int i = 1; i < wasserImSee.length; i++) 
		{
			if (wasserImSee[i] > max) 
			{
				max = wasserImSee[i];
			}
		}
		System.out.println("Maximaler Fuellstand: "+max+ " m3");
		
		// Zeit über Schadensgrenze
		
		double time = 0;
		
		for (int i = 0; i < wasserImSee.length; i++) 
		{
			if (wasserImSee[i] > schadensgrenze) 
			{
				time++;
			}
		}
		System.out.println("Zeit ueber Schadensgrenze: "+time+" h");
		
		// Wasserstand mit Stollen
		
		double [] stollen = new double [abfluss1.length];
		
		for(int i = 1; i < zufluss1.length; i++) 
		{
			stollen [0] = startWert+((zufluss1[0]+zufluss2[0]-abfluss1[0])*60);
			stollen [i] = stollen[i-1]+((zufluss1[i]+zufluss2[i]-abfluss1[i])*60);
			
			if(stollen[i]>prevschaden)
			{
				stollen [i] = stollen[i-1]+((zufluss1[i]+zufluss2[i]-abfluss1[i]-abfluss2)*60);
			}
		}
		ZhawCsvLib.writeDoubleArray("Füllstand_2.csv", stollen);
		
		// Maximaler Wasserstand mit Stollen
		
				max = stollen[0];
				
				for (int i = 1; i < stollen.length; i++) 
				{
					if (stollen[i] > max) 
					{
						max = stollen[i];
					}
				}
				System.out.println("Maximaler Fuellstand mit Stollen: "+max+ " m3");
				
				// Zeit über Schadensgrenze mit Stollen
				
				time = 0;
				
				for (int i = 0; i < stollen.length; i++) 
				{
					if (stollen[i] > schadensgrenze) 
					{
						time++;
					}
				}
				System.out.println("Zeit ueber Schadensgrenze mit stollen: "+time+" h");
	}
}