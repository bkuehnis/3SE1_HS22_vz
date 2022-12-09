package uebung11.vzb.ch.zhaw.sprinala;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.google.gson.*;

import static java.util.stream.Collectors.toList;

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
		List<Hero> d2 = Stream.of(heros).filter(x -> x.getGender().equalsIgnoreCase(gender)).collect(Collectors.toList());
		System.out.println(d2.size());
	}
	
	static void dashboard3(String eyeColor) {
		List<Hero> d3 = Stream.of(heros)
				.filter(x -> x.getGender()
						.equals("Female") &&
						x.getEye().equalsIgnoreCase(eyeColor))
				.collect(Collectors.toList());

		d3.stream().forEach(h -> System.out.println(h.getName()));
	}
	
	static List<Hero> dashboard4(String firstChars) {
		List<Hero> d4 = Stream.of(heros)
				.filter(x -> x.getName()
						.startsWith(firstChars))
				.collect(toList());

		d4.stream().sorted(Comparator.comparing(Hero::getHeight)).forEach(x -> System.out.println(x.getName()+" "+x.getHeight()));

		return null;
	}
}
