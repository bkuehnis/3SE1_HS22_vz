package uebung13.vzb.ch.zhaw.toddara1;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import javax.swing.*;

public class JokesOfDay {

    public static void main(String[] args) {
        int count = 1;
        boolean moreJokes = true;

        var client = HttpClient.newHttpClient();
        Gson gson = new GsonBuilder().create();

        while(moreJokes) {
            var request = HttpRequest.newBuilder()
                    .uri(URI.create("https://v2.jokeapi.dev/joke/Any?safe-mode"))
                    .GET().build();
            try {
                // query and print joke
                var res = client.send(request, HttpResponse.BodyHandlers.ofString());
                Joke joke = gson.fromJson(res.body(), Joke.class);

                if (joke.getType().equalsIgnoreCase("twopart")) {
                    JOptionPane.showMessageDialog(null, joke.getSetup(),
                            joke.getCategory() + " Joke (" + count + ")", JOptionPane.QUESTION_MESSAGE);
                    JOptionPane.showMessageDialog(null, joke.getDelivery(),
                            joke.getCategory() + " Joke (" + count + ")", JOptionPane.WARNING_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(null, joke.getJoke(),
                            joke.getCategory() + " Joke (" + count + ")", JOptionPane.INFORMATION_MESSAGE);
                }

                if (count % 5 == 0){
                    int eingabe = JOptionPane.showConfirmDialog(null, "Need more jokes?", "Continue?", JOptionPane.YES_NO_OPTION);
                    moreJokes = (eingabe == 0);
                }

                count++;

            } catch (Exception e) {
                System.out.println(e);
                moreJokes = false;
            }
        }
    }
}