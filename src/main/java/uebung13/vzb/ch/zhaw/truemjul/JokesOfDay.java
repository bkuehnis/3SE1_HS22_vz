package uebung13.vzb.ch.zhaw.truemjul;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import javax.swing.*;

public class JokesOfDay {

    public static void main(String[] args) {
        var client = HttpClient.newHttpClient();
        Gson gson = new GsonBuilder().create();

        int iCounter = 0;
        boolean bFinishjoke = false;

        while (!bFinishjoke) {
            iCounter++;
            var request = HttpRequest.newBuilder()
                    .uri(URI.create("https://v2.jokeapi.dev/joke/Any?safe-mode"))
                    .GET().build();

            try {
                // query and print joke
                var res = client.send(request, HttpResponse.BodyHandlers.ofString());
                //System.out.println(res.body());

                Jokes joke = gson.fromJson(res.body(), Jokes.class);

                if (joke.type.equals("single")) {
                    JOptionPane.showMessageDialog(null, joke.joke,
                            "Pun Joke (" + iCounter + ")", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(null, joke.setup,
                            "Pun Joke (" + iCounter + ")", JOptionPane.QUESTION_MESSAGE);

                    JOptionPane.showMessageDialog(null, joke.delivery,
                            "Pun Joke (" + iCounter + ")", JOptionPane.WARNING_MESSAGE);

                }
            } catch (Exception e) {
                System.out.println(e);
            }

            if (iCounter % 5 == 0) {
                int eingabe = JOptionPane.showConfirmDialog(null, "Need more jokes?",
                        "Continue", JOptionPane.YES_NO_OPTION);

                if (eingabe == 1) {
                    bFinishjoke = true;
                }
            }
        }


    }
}

