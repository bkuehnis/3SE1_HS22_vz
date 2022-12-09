package uebung11.vzb.ch.zhaw.freiphi2;

import java.io.FileReader;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;
import java.util.stream.Stream;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class HeroFinder {
	static Hero [] heros;

	public static void main(String[] args) {

		try {
			FileReader reader = new FileReader("superheros.json",StandardCharsets.UTF_8);
			Gson gson = new GsonBuilder().create();
			heros = gson.fromJson(reader, Hero[].class);
		} catch (Exception e) {
			System.out.println(e);
		}
		
		System.out.println("\nHero Finder\n-----------");
		
		// User Input
		Scanner keyScan = new Scanner(System.in);
		System.out.println("Gender (Male, Female)");
		String gender = keyScan.nextLine();
		System.out.println("Alignment (good, bad, neutral)");
		String alignment = keyScan.nextLine();
		System.out.println("Hair color (Black, Blond, No Hair, ...)");
		String hairColor = keyScan.nextLine();
		System.out.println("Eye color (blue, green, red, ...)");
		String eyeColor = keyScan.nextLine();
		keyScan.close();
		
		// TODO
		for (int i = 0; i<heros.length; i++) {
			if (heros[i].getGender().equalsIgnoreCase(gender) && heros[i].getAlignment().equalsIgnoreCase(alignment) && heros[i].getHair().equalsIgnoreCase(hairColor) && heros[i].getEye().equalsIgnoreCase(eyeColor)) {
				System.out.println(heros[i].getPublisher()+" "+heros[i].getName());
			}
		}


	}
}
