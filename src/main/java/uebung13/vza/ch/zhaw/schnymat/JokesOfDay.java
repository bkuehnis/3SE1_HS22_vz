package uebung13.vza.ch.zhaw.schnymat;

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

        var request = HttpRequest.newBuilder()
        		.uri(URI.create("https://v2.jokeapi.dev/joke/Any?safe-mode"))
        		.GET().build();

        try{
        	// query and print joke
            var res = client.send(request, HttpResponse.BodyHandlers.ofString());
            Joke joke = gson.fromJson(res.body(), Joke.class);
            if (joke.getType().equals("twopart")) {
                JOptionPane.showMessageDialog(null, joke.getSetup(), "Developer Joke", JOptionPane.PLAIN_MESSAGE);
                JOptionPane.showMessageDialog(null, joke.getDelivery(), "Developer Joke", JOptionPane.PLAIN_MESSAGE);

                System.out.println(joke.getSetup());
                System.out.println(joke.getDelivery());
            } else {
                JOptionPane.showMessageDialog(null, joke.getJoke(), "Developer Joke", JOptionPane.PLAIN_MESSAGE);
                System.out.println(joke.getJoke());
            }

        } catch(Exception e){System.out.println(e);}
	}
}
