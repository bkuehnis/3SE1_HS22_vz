package vzb.ch.zhaw.martilu5.uebung2;

import java.util.Scanner;

public class Zufallszahl3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner keyScan = new Scanner(System.in);
		 System.out.println("Bitte vier Zahlen eingeben:");
		 int a1 = keyScan.nextInt();
		 int a2 = keyScan.nextInt();
		 int a3 = keyScan.nextInt();
		 int a4 = keyScan.nextInt();
		 int b = 0;
		 int c = 0;
		 
		 
		 if (a1 > a2) {
			 b = a1;
		 } else if (a1 < a2) {
			 b = a2;
		 }
		 if (a3 > a4) {
			 c = a3;
		 } else if (a3 < a4) {
			 c = a4;
		 } 
		 if (b > c) {
			 System.out.println("Die grösste eingegebene Zahl ist "+b);
		 } else if (c > b) {
			 System.out.println("Die grösste eingegebene Zahl ist "+c);
		 }
		 keyScan.close();
	}

}
