package uebung11.vzb.ch.zhaw.weberm08;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.google.gson.*;

public class Dashboard {
	static Hero [] heros;

	public static void main(String[] args) {

		try {
			FileReader reader = new FileReader("superheros.json",StandardCharsets.UTF_8);
			Gson gson = new GsonBuilder().create();
			heros = gson.fromJson(reader, Hero[].class);
		} catch (Exception e) {
			System.out.println(e);
		}

		System.out.println("Dashboard\n---------");
		System.out.println("Erfasste Superhelden und Superheldinnen: "+heros.length+"\n");
		Scanner keyScan = new Scanner(System.in);
		Random rn = new Random();
		
		dashboard1(rn.nextInt(heros.length));
		
		System.out.print("\nGender (Male, Female): ");
		dashboard2(keyScan.nextLine());
		
		System.out.print("\nSuperheldinnnen mit Augenfarbe (red, blue, green,...): ");
		dashboard3(keyScan.nextLine());
		
		System.out.print("\nAnfangsbuchstabe (A, B, C, ...): ");
		List<Hero> h = dashboard4(keyScan.nextLine());
		if (h != null) {
			h.stream().forEach(x -> System.out.println(x.getName()+" "+x.getHeight()));
		}

		keyScan.close();
	}
	
	static void dashboard1(int index) {
		System.out.print("Held des Tages: ");
		System.out.println(heros[index].getName());
	}
	
	static void dashboard2(String gender) {
		Stream<Hero> heroStream = Arrays.stream(heros);
		heroStream.filter(h -> h.getGender().contains(gender));
		System.out.println(Arrays.stream(heros).filter(h -> h.getGender().contains(gender)).count());
	}
	
	static void dashboard3(String eyeColor) {
		Stream<Hero> heroStream = Arrays.stream(heros);
		heroStream.forEach(h -> {
			if (h.getGender().contains("Female") && h.getEye().contains(eyeColor)) {
				System.out.println(h.getName());
			}
		});
	}
	
	static List<Hero> dashboard4(String firstChars) {
		// TODO
		Stream<Hero> heroStream = Arrays.stream(heros);
		List<Hero> heroList = heroStream
				.filter(h -> h.getName().charAt(0) == firstChars.charAt(0))
				// Methode getHeight() angepasst, sodass ich keinen primitiven Datentyp verwenden muss.
				.sorted((o1, o2) -> o2.getHeight().compareTo(o1.getHeight())).toList();
		
		return heroList;
	}
}
