package uebung11.vza.ch.zhaw.zuercja2;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.google.gson.*;

public class Dashboard {
	static Hero [] heroes;

	public static void main(String[] args) {

		try {
			FileReader reader = new FileReader("superheros.json",StandardCharsets.UTF_8);
			Gson gson = new GsonBuilder().create();
			heroes = gson.fromJson(reader, Hero[].class);
		} catch (Exception e) {
			System.out.println(e);
		}

		System.out.println("Dashboard\n---------");
		System.out.println("Erfasste Superhelden und Superheldinnen: "+heroes.length+"\n");
		Scanner keyScan = new Scanner(System.in);
		Random rn = new Random();
		
		dashboard1(rn.nextInt(heroes.length));
		
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
		System.out.println(heroes[index].getName());
	}
	
	static void dashboard2(String gender) {
		int counter = 0;
		for(Hero h : heroes) {
			if(h.getGender().equalsIgnoreCase(gender)) {
				counter++;
			}
		}
		System.out.println(counter);
	}
	
	static void dashboard3(String eyeColor) {
		for(Hero h : heroes) {
			if(h.getGender().equalsIgnoreCase("Female") && h.getEye().equalsIgnoreCase(eyeColor)) {
				System.out.println(h.getName());
			}
		}
	}
	
	static ArrayList<Hero> dashboard4(String firstChars) {
		ArrayList<Hero> list = new ArrayList<Hero>();
		for(Hero h : heroes) {
			if(h.getName().charAt(0) == firstChars.charAt(0)) {
				list.add(h);
			}
		}
		list.sort(Comparator.comparing(Hero::getHeight));
		return list;
	}
}
