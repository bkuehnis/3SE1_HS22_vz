package uebung11.vza.ch.zhaw.mahamqab;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
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
		// TODO
		int count = 0;
		for (int i=0; i<heros.length; i++) {
			
			if(heros[i].getGender().equals(gender)) { 
			
				count++;
		}
		}
		System.out.println(count);
	}
	
	
	static void dashboard3(String eyeColor) {
for (int i=0; i<heros.length; i++) {
			
			if(heros[i].getEye().equals(eyeColor)) { 
			System.out.println("\n"+heros[i].getName());
			}
		// TODO
			}
	}
	
	static List<Hero> dashboard4(String firstChars) {
		ArrayList<Hero> List = new ArrayList<Hero>();
		
for (int i=0; i<heros.length; i++) {
			
	if (heros[i].getName().startsWith(firstChars))
		List.add(heros[i]);
		
			
}		 



Collections.sort(List, (L1, L2) -> Double.compare(L1.getHeight(), L2.getHeight()));


	
	

	
	
		 return List;
}
}
