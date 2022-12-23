package uebung13.vzb.ch.zhaw.anderni2;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import javax.swing.*;

public class JokesOfDay {

    public class Witz {
        public String type;
        public String category;
        public String setup;
        public String delivery;
        public String joke;
    }

	public static void main(String[] args) {
        var client = HttpClient.newHttpClient();
        Gson gson = new GsonBuilder().create();

        int count = 0;
        int fünfer = 0;

        while (client != null) {
            var request = HttpRequest.newBuilder()
                    .uri(URI.create("https://v2.jokeapi.dev/joke/Any?safe-mode"))
                    .GET().build();

            try {
                // query and print joke
                var res = client.send(request, HttpResponse.BodyHandlers.ofString());
                System.out.println(res.body());


                Witz witzig = gson.fromJson(res.body(), Witz.class);
                if (fünfer == 5) {
                    fünfer = 0;

                    int eingabe = JOptionPane.showConfirmDialog(null, "Need more jokes?",
                            "Continue?", JOptionPane.YES_NO_OPTION);

                    if (eingabe == 1) {
                        break;
                    }
                }

                count++;
                fünfer++;
                if (witzig.type.equals("twopart")) {
                    JOptionPane.showMessageDialog(null, witzig.setup,
                            witzig.category + " Joke " + "(" + count + ")", JOptionPane.QUESTION_MESSAGE);
                    JOptionPane.showMessageDialog(null, witzig.delivery,
                            witzig.category + " Joke " + "(" + count + ")", JOptionPane.WARNING_MESSAGE);
                } else JOptionPane.showMessageDialog(null, witzig.joke,
                        witzig.category + " Joke " + "(" + count + ")", JOptionPane.QUESTION_MESSAGE);

            } catch (Exception e) {
                System.out.println(e);
            }

        }
    }
}
