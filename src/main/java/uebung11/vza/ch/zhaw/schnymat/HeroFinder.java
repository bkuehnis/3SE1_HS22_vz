package uebung11.vza.ch.zhaw.schnymat;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileReader;
import java.util.Arrays;
import java.util.Scanner;


public class HeroFinder {
    static Hero[] heros;

    public static void main(String[] args) {

        try {
            FileReader reader = new FileReader("superheros.json");
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
        Arrays.stream(heros)
                //Gender
                .filter(hero -> hero.getGender().equalsIgnoreCase(gender))
                // Alignment
                .filter(hero -> hero.getAlignment().equalsIgnoreCase(alignment))
                // Hair Color
                .filter(hero -> hero.getHair().equalsIgnoreCase(hairColor))
                // Eye color
                .filter(hero -> hero.getEye().equalsIgnoreCase(eyeColor))
                // Print
                .forEach(hero -> System.out.println(hero.getPublisher() + ": " + hero.getName()));

    }
}
