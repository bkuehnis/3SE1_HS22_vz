//package vzb.ch.zhaw.kanliroj.uebung3;
//
//import ch.zhaw.lib.ZhawCsvLib;
//
//public class Pegelrechner {
//
//	public static void main(String[] args) {
//		
//		// Daten Einlesen
//		double startWert = 50000;
//		double schadensgrenze = 61500;
//		double [] zufluss1 = ZhawCsvLib.readDoubleArray("zufluss1.csv");
//		double [] zufluss2 = ZhawCsvLib.readDoubleArray("zufluss2.csv");
//		double [] abfluss1 = ZhawCsvLib.readDoubleArray("abfluss1.csv");
////		double [] wasserImSee = startWert + (zufluss1 + zufluss2 - abfluss1)*60 ;
//		
//		// Länge der Datensätze ausgeben
//		System.out.println("Werte Zufluss 1: "+zufluss1.length);
//		System.out.println("Werte Zufluss 2: "+zufluss2.length);
//		System.out.println("Werte Abfluss 1: "+abfluss1.length);
//		// System.out.println("Wasser Im See: "+wasserImSee.length);
//		// TODO
//	
//		// liest Index aus gegebenen Zahlen in den Files
//		for (int z1=0; z1 < zufluss1.length; z1++){
//			System.out.println(zufluss1[z1]);
//		}
//		for (int z2=0; z2 < zufluss2.length; z2++){
//			System.out.println(zufluss2[z2]);
//		}
//		for (int a1=0; a1 < abfluss1.length; a1++){
//			System.out.println(abfluss1[a1]);
//		}
//		
//		// Ich verstehe die Aufgabenstellung nicht; ist der Zufluss nicht addierbar?
//		// Wie werden die Files so gelesen, dass nur Index null, danach Index 1 kommt?
//		// Und was ist die ohneStollen.csv?
//		
//		ZhawCsvLib.writeDoubleArray("ohneStollen.csv", wasserImSee);
//}
//
//		double max = zufluss1[0];
//		for (int i=1; i<temp.length; i++) {
//			if (zufluss1[i]>max) {
//				max=zufluss1[i];
//			}
//		}}
//
//		System.out.println("Maximaler Füllstand: " + max +" m^3");
//		
//		}