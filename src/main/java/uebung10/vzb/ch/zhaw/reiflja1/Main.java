package uebung10.vzb.ch.zhaw.reiflja1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Liefertour l = new Liefertour();
		int eingabe = 0;
		String empfaenger = "Meier";
		int plz = 0;

		while (eingabe != 5) {
			System.out.println("[1] Paket  [2] Brief  [3] PrintAll  [4] PrintPlz  [5] exit");
			System.out.print("cmd> ");
			eingabe = s.nextInt();
			if (eingabe == 1) {
				Scanner ks = new Scanner (System.in);
				double gewicht;
				System.out.print("Empfaenger: ");
				empfaenger = ks.nextLine();
				System.out.print("PLZ: ");
				plz = s.nextInt();
				System.out.print("Gewicht: ");
				gewicht = s.nextDouble();
				l.addPaket(plz, empfaenger, gewicht);
			} else if (eingabe == 2) {
				Scanner ks = new Scanner (System.in);
				boolean mitUnterschrift = false;
				System.out.print("Empänger: ");
				empfaenger = ks.nextLine();
				System.out.print("PLZ: ");
				plz = s.nextInt();
				System.out.print("Mit Unterschrift Ja (1) Nein (2): ");
				eingabe = s.nextInt();
				if (eingabe == 1) {
					mitUnterschrift = true;
				}
				l.addBrief(plz, empfaenger, mitUnterschrift);
			} else if (eingabe == 3) {
				l.printAll();
			} else if (eingabe == 4) {
				System.out.print("PLZ: ");
				eingabe = s.nextInt();
				l.print(eingabe);
			}
			System.out.println();
		}
		s.close();
	}
}
