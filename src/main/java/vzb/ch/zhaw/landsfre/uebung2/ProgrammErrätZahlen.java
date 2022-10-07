package vzb.ch.zhaw.landsfre.uebung2;

import java.util.Scanner;

public class ProgrammErrätZahlen {
	public static void main(String[] args) {
	Scanner keyScan = new Scanner(System.in);
	
	System.out.println("Denke dir eine Zahl zwischen 0 und 99 und drücke dann Enter.");
	
	String enter = keyScan.nextLine();
	if (enter != null) {
		System.out.println("Ok. Ich beginne jetzt zu raten.\r\n"+ "Antworte mir mit 1 für richtig, 2 für kleiner und 3 für grösser.\r\n");
	}
	
	int a = 50;
	
	System.out.println("Ist es die "+a+"?");
	
	int eingabe = keyScan.nextInt();
	
	int b = a - a / 2;
	int c = (100 - a)/ 2 + a;
	int obergrenze = 100;
	int untergrenze = 0;
	
	while (eingabe != 1) {
		
		if (eingabe == 2) {
			obergrenze = a;
			a = b;
		}else if (eingabe == 3) {
			untergrenze = a;
			a = c;
			
			
		}
		System.out.println("Ist es die "+a+"?");
		b = (a - untergrenze) / 2 + untergrenze;
		c = (obergrenze - a) / 2 + a;
		
		eingabe = keyScan.nextInt();
	}
	System.out.println("Uff, das war schwierig. Spielen wir nochmal?");
	keyScan.close();
}
}
