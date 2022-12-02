package uebung10.vzb.ch.zhaw.landsfre;

import java.util.Scanner;

public class UserInterface {
	
	public static void main(String[] args) {
		Scanner keyScan = new Scanner(System.in);
		Liefertour lt = new Liefertour();
		
		String input = "";
		while (!input.equals("5")) {
			System.out.println("\n[1] Paket  [2] Brief  [3] PrintAll  [4] PrintPlz  [5] exit");
			System.out.print("cmd> ");
			input = keyScan.nextLine();
			if (input.equals("1")) {
				System.out.print("Empf‰nger: ");
				String empfaenger = keyScan.nextLine();
				System.out.print("PLZ: ");
				int plz = keyScan.nextInt();
				System.out.print("Gewicht: ");
				double gewicht = keyScan.nextDouble();
				keyScan.nextLine(); // empty buffer
				lt.addPaket(plz, empfaenger, gewicht);
			} else if (input.equals("2")) {
				System.out.print("Empf‰nger: ");
				String empfaenger = keyScan.nextLine();
				System.out.print("PLZ: ");
				int plz = keyScan.nextInt();
				System.out.print("Unterschrift Ja (1) Nein (2): ");
				int mitUnterschrift = keyScan.nextInt();
				keyScan.nextLine(); // empty buffer
				lt.addBrief(plz, empfaenger, mitUnterschrift==1) ;
			} else if (input.equals("3")) {
				lt.printAll();
			} else if (input.equals("4")) {
				System.out.print("PLZ: ");
				int plz = keyScan.nextInt();
				keyScan.nextLine(); // empty buffer
				lt.print(plz);
			} 
		}
		keyScan.close();
	}
}
