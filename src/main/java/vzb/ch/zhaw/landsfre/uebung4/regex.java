package vzb.ch.zhaw.landsfre.uebung4;

import ch.zhaw.lib.ZhawWavLib;
import java.util.Scanner;
public class regex {
	public static void main(String[] args) {
		Scanner keyScan = new Scanner(System.in);
		System.out.print("Bitte gib deine E-Mail-Adresse ein: ");
		String email = keyScan.nextLine();
		System.out.println("");
		String valid = "[a-zA-Z0-9]{1,}@[a-zA-Z0-9]{1,}.[a-zA-Z0-9]{2,5}";
		
		while (email.matches(valid)== false) {
			System.out.println(email+" ist keine gültige E-Mail-Adresse.");
			System.out.println("");
			System.out.print("Bitte gib deine E-Mail-Adresse ein: ");
			email = keyScan.nextLine();
			System.out.println("");
		}
		System.out.print("Wir haben eine Nachricht an deine E-Mail-Adresse "+email+" geschickt!");

		
		keyScan.close();
	}

}
