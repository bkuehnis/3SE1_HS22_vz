package vzb.ch.zhaw.freiphi2.uebung4;

import ch.zhaw.lib.ZhawWavLib;
import java.util.Scanner;

public class Regex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
		String regexmail = "[a-zA-Z1-9]+@[a-zA-Z1-9]+\\.[a-zA-Z1-9]{2,5}$";
		String m1c = "a@b.com";
		String m2c = "123@gmail.com";
		String m1f = "test";
		String m2f = "name@email";
		String m3f = "9to5@every.d";
		String m4f = "bob@alice.longsuffix";
		System.out.println("pw1 isinvalid: " + m1c.matches(regexmail));
		System.out.println("pw1 isinvalid: " + m2c.matches(regexmail));
		System.out.println("pw1 isinvalid: " + m1f.matches(regexmail));
		System.out.println("pw1 isinvalid: " + m2f.matches(regexmail));
		System.out.println("pw1 isinvalid: " + m3f.matches(regexmail));
		System.out.println("pw1 isinvalid: " + m4f.matches(regexmail));
		System.out.println("Bitte geben Sie eine Email ein:");
		String answer = keyboard.nextLine();

		while (true != (answer.matches(regexmail))) {
			System.out.println("Ihr Passwort ist falsch, bitte wiederholen Sie Ihre Eingabe!");
			answer = keyboard.nextLine();
		}
		System.out.println("Ihr Passwort ist korrekt");

	}

}
