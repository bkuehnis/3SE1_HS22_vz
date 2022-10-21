package vzb.ch.zhaw.anderni2.uebung4;

import ch.zhaw.lib.ZhawWavLib;
import java.util.Scanner;

public class regex {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String regexPattern = "^(?=.{1,64}@)[\\p{L}0-9_-]+(\\.[\\p{L}0-9_-]+)*@"
                + "[^-][\\p{L}0-9-]+(\\.[\\p{L}0-9-]+)*(\\.[\\p{L}]{2,})$";

        System.out.println("Bitte gib deine E-Mail-Adresse ein: ");
        String emailAdresse = scanner.next();
        boolean emailAdresseTest = emailAdresse.matches(regexPattern);


        // Test
        if (emailAdresseTest) {
            System.out.println("e-mail value accepted");
        } else {
            System.out.println("e-mail not value accepted, please try again");
            emailAdresse = scanner.next();

        }
    }
}
