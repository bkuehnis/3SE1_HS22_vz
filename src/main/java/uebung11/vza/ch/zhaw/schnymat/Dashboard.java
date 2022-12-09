package uebung11.vza.ch.zhaw.schnymat;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileReader;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Dashboard {
    static Hero[] heros;

    public static void main(String[] args) {

        try {
            FileReader reader = new FileReader("superheros.json");
            Gson gson = new GsonBuilder().create();
            heros = gson.fromJson(reader, Hero[].class);
        } catch (Exception e) {
            System.out.println(e);
        }

        System.out.println("Dashboard\n---------");
        System.out.println("Erfasste Superhelden und Superheldinnen: " + heros.length + "\n");
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
            h.forEach(x -> System.out.println(x.getName() + " " + x.getHeight()));
        }

        keyScan.close();
    }

    static void dashboard1(int index) {
        System.out.print("Held des Tages: ");
        System.out.println(heros[index].getName());
    }

    static void dashboard2(String gender) {
        // TODO
        Long herosWithGender = Arrays.stream(heros).filter(hero -> hero.getGender().equals(gender)).count();
        System.out.println(herosWithGender);
    }

    static void dashboard3(String eyeColor) {
        // TODO
        List<String> herosWithEyeColor = Arrays.stream(heros).filter(hero -> hero.getEye().equals(eyeColor)).map(Hero::getName).collect(Collectors.toList());

        for (String name : herosWithEyeColor
        ) {
            System.out.println(name);
        }
    }

    static List<Hero> dashboard4(String firstChars) {
        // TODO
        List<Hero> herosWithChar = Arrays.stream(heros).filter(hero -> hero.getName().startsWith(firstChars)).collect(Collectors.toList());
        System.out.println("TODO");
        return herosWithChar;
    }
}
