package uebung11.vzb.ch.zhaw.wueesnin;

import java.io.FileReader;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Scanner;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class HeroFinder {
	static Hero[] heros;

	public static void main(String[] args) {

		try {
			FileReader reader = new FileReader("superheros.json", StandardCharsets.UTF_8);
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

		ArrayList<Hero> matchingHeros = new ArrayList<Hero>();
		Hero currentHero = null;

		for (int i = 0; i < heros.length; i++) {
			currentHero = heros[i];
			if (currentHero.getGender().equalsIgnoreCase(gender)
					&& currentHero.getAlignment().equalsIgnoreCase(alignment)
					&& currentHero.getHair().equalsIgnoreCase(hairColor)
					&& currentHero.getEye().equalsIgnoreCase(eyeColor)) {
				matchingHeros.add(currentHero);
			}
		}
		for (Hero hero : matchingHeros) {
			System.out.println(hero.getPublisher() + ": " + hero.getName());
		}
	}
}
