package uebung11.vza.ch.zhaw.vuchl001;

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
		for (Hero x: heros) {
			if (x.getGender().contentEquals(gender) && x.getAlignment().equalsIgnoreCase(alignment) && x.getHair().equalsIgnoreCase(hairColor) && x.getEye().equalsIgnoreCase(eyeColor)) {
				System.out.println("Marvel Comics: " + x.getName());
			}
		}

	}
}
