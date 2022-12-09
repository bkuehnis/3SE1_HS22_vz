package uebung11.vzb.ch.zhaw.bosluc01;

import java.io.FileReader;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;
import java.util.stream.Collectors;
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
		
		System.out.println(Stream.of(heros).filter(h ->
			(isWildcard(gender) || matches(h.getGender(), gender)) &&
			(isWildcard(alignment) || matches(h.getAlignment(), alignment)) &&
			(isWildcard(hairColor) || matches(h.getHair(), hairColor)) &&
			(isWildcard(eyeColor) || matches(h.getEye(), eyeColor))
		).map(h -> (h.getPublisher().isBlank() ? "" : h.getPublisher() + ": ") + h.getName())
		.collect(Collectors.joining("\n")));
	}
	
	private static boolean matches(String field, String query) {
		return field.equalsIgnoreCase(query);
	}
	
	private static boolean isWildcard(String query) {
		return query.equals("?");
	}
}
