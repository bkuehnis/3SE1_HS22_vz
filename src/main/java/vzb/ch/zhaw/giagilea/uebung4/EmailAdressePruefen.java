package vzb.ch.zhaw.giagilea.uebung4;

import ch.zhaw.lib.ZhawWavLib;
import java.util.Scanner;

public class EmailAdressePruefen {

	public static void main(String[] args) {
		Scanner keyScan = new Scanner(System.in);
		String validPw = "\\b[A-z0-9]{1,}@[A-z0-9]{1,}\\.[A-z0-9]{2,5}\\b";
		boolean valid = false;
		
		System.out.print("Bitte gib eine E-Mail-Adresse ein: ");
		String email = keyScan.nextLine();
		
		if (email.matches(validPw)) {
			valid = true;
			System.out.println("Wir haben eine Nachricht an deine E-Mail-Adresse geschikt!");
		}
		
		while (valid == false) {
			System.out.println(email+" ist keine gültige E-Mail-Adresse");
			System.out.print("Bitte gib eine E-Mail-Adresse ein: ");
			email = keyScan.nextLine();
			
			if (email.matches(validPw)) {
				valid = true;
				System.out.println("Wir haben eine Nachricht an deine E-Mail-Adresse geschikt!");
			}
		}
		
	}

}
