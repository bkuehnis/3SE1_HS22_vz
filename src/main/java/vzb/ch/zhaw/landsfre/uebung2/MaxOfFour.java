package vzb.ch.zhaw.landsfre.uebung2;

import java.util.Scanner;

public class MaxOfFour {
 public static void main(String[] args) {
	 
 Scanner keyScan = new Scanner(System.in);
 System.out.println("Bitte vier Zahlen eingeben:");
 
 int a1 = keyScan.nextInt();
 int a2 = keyScan.nextInt();
 int a3 = keyScan.nextInt();
 int a4 = keyScan.nextInt();
 
 if (a1 > a2 && a1 > a3 && a1 > a4) {
	 System.out.println("Die grösste eingegebene Zahl ist "+a1+"."); 
 }else if (a2 > a1 && a2 > a3 && a2 > a4) {
	 System.out.println("Die grösste eingegebene Zahl ist "+a2+".");
 }else if (a3 > a2 && a3 > a1 && a3 > a4) {
	 System.out.println("Die grösste eingegebene Zahl ist "+a3+".");
 }else if (a4 > a2 && a4 > a3 && a4 > a1) {
	 System.out.println("Die grösste eingegebene Zahl ist "+a4+".");
 }
 
 keyScan.close();
 }
}
