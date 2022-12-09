package uebung11.vzb.ch.zhaw.anderni2;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileReader;
import java.nio.charset.StandardCharsets;
import java.util.*;
import java.util.stream.Collectors;
import static java.util.stream.Collectors.*; //ANleitung??


public class Dashboard {
    static Hero[] heros;

    public static void main(String[] args) {

        try {
            FileReader reader = new FileReader("superheros.json", StandardCharsets.UTF_8);
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
            h.stream().forEach(x -> System.out.println(x.getName() + " " + x.getHeight()));
        }

        keyScan.close();
    }

    static void dashboard1(int index) {
        System.out.print("Held des Tages: ");
        System.out.println(heros[index].getName());
    }


    static void dashboard2(String gender) {
        // ToDo a

        // long count = Arrays.stream(heros).filter(x -> x.getGender().equals(gender)).count();
        List<Hero> h2 = Arrays.stream(heros)
                .filter(x -> x.getGender().equals(gender))
                .collect(Collectors.toList());

        int count = 0;
        for (Hero h : h2) {
            count++;

        }
        System.out.println(count);
    }


    static void dashboard3(String eyeColor) {
        // TODO b


                //Arrays.stream(heros).filter(x -> x.getEye().equals(eyeColor)).forEach(x -> System.out.println(x.getName()));
                Arrays.stream(heros)
                        .filter(x -> x.getEye().equals(eyeColor))
                        .filter(x -> x.getGender().equals("Female"))
                        .forEach(x -> System.out.println(x.getName()));





        }


    static List<Hero> dashboard4(String firstChars) {
        // TODO c
        List<Hero> h2 = Arrays.stream(heros).filter(x -> x.getName().startsWith(firstChars))
                                            .sorted(Comparator.comparing(Hero::getHeight))
                                            .collect(toList());
        for (Hero h : h2) {
        }
        return h2;
    }
}
