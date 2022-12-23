package uebung13.vza.ch.zhaw.seemaala;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

import javax.swing.JOptionPane;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class JokesOfDay {
	
	private static boolean shouldContinue = true;
	private static int counter = 0;

	public static void main(String[] args) {
		while(shouldContinue) {
			if(counter % 5 == 0 && counter != 0) {
				int moreJokes = JOptionPane.showConfirmDialog(null, "Need more jokes?", "Continue?",
						JOptionPane.YES_NO_OPTION);
				if(moreJokes == JOptionPane.NO_OPTION) {
					shouldContinue = false;
					return;
				}
			}
			Joke joke = getJoke();
			counter++;
			if (joke.getType().equals("twopart")) {
				JOptionPane.showMessageDialog(null, joke.getSetup(), joke.getCategory() + " Joke (" + counter + ")",
						JOptionPane.QUESTION_MESSAGE);
					JOptionPane.showMessageDialog(null, joke.getDelivery(), joke.getCategory() + " Joke (" + counter + ")",
							JOptionPane.WARNING_MESSAGE);
			} else {
				JOptionPane.showMessageDialog(null, joke.getJoke(), joke.getCategory() + " Joke (" + counter + ")",
						JOptionPane.INFORMATION_MESSAGE);
			}
		}
	}

	private static Joke getJoke() {
		var client = HttpClient.newHttpClient();
		Gson gson = new GsonBuilder().create();

		var request = HttpRequest.newBuilder().uri(URI.create("https://v2.jokeapi.dev/joke/Any?safe-mode")).GET()
				.build();

		try {
			// query and print joke
			var res = client.send(request, HttpResponse.BodyHandlers.ofString());
			System.out.println(res.body());
			System.out.println();
			return gson.fromJson(res.body(), Joke.class);

		} catch (Exception e) {
			System.out.println(e);
			return null;
		}
	}
}