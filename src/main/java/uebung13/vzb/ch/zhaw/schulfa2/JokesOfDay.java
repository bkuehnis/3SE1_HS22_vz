package uebung13.vzb.ch.zhaw.schulfa2;

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

		int counter = 0;
		int jokeCounter = 1;

		while (counter != 5) {
			var request = HttpRequest.newBuilder().uri(URI.create("https://v2.jokeapi.dev/joke/Any?safe-mode")).GET()
					.build();

			try {
				// query and print joke
				var res = client.send(request, HttpResponse.BodyHandlers.ofString());
				Jokes joke = gson.fromJson(res.body(), Jokes.class);

				if (joke.getType().equals("single")) {

					JOptionPane.showMessageDialog(null, joke.getJoke(),
							joke.getCategory() + " Joke (" + jokeCounter + ")", JOptionPane.INFORMATION_MESSAGE);
				} else {

					JOptionPane.showMessageDialog(null, joke.getSetup(),
							joke.getCategory() + " Joke (" + jokeCounter + ")", JOptionPane.QUESTION_MESSAGE);
					JOptionPane.showMessageDialog(null, joke.getDelivery(),
							joke.getCategory() + " Joke (" + jokeCounter + ")", JOptionPane.WARNING_MESSAGE);
				}

			} catch (Exception e) {
				System.out.println(e);
			}

			jokeCounter++;
			counter++;

			if (counter == 5) {
				int input = JOptionPane.showConfirmDialog(null, "Need more jokes?", "Continue?",
						JOptionPane.YES_NO_OPTION);
				if (input == 0) {
					counter = 0;
				}
			}
		}
	}
}