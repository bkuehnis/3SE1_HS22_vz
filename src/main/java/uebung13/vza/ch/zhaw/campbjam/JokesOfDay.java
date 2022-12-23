package uebung13.vza.ch.zhaw.campbjam;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import javax.swing.JOptionPane;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class JokesOfDay {

	public static void main(String[] args) {
		var client = HttpClient.newHttpClient();
		Gson gson = new GsonBuilder().create();

		var request = HttpRequest.newBuilder().uri(URI.create("https://v2.jokeapi.dev/joke/Any?safe-mode")).GET()
				.build();

		try {
			boolean moreJokes = true;
			int counter = 1;
			while (moreJokes) {
				for (int i = 0; i < 5; i++) {
					var res = client.send(request, HttpResponse.BodyHandlers.ofString());
					System.out.println(res.body());
					Jokes newJokes = gson.fromJson(res.body(), Jokes.class);
					String title = newJokes.category + " Joke (" + counter + ")";
					if (newJokes.type.equals("twopart")) {
						JOptionPane.showMessageDialog(null, newJokes.setup, title, JOptionPane.QUESTION_MESSAGE);
						JOptionPane.showMessageDialog(null, newJokes.delivery, title, JOptionPane.WARNING_MESSAGE);
					} else if (newJokes.type.equals("single")) {
						JOptionPane.showMessageDialog(null, newJokes.joke, title, JOptionPane.INFORMATION_MESSAGE);
					}
					counter++;
				}
				int input = JOptionPane.showConfirmDialog(null, "Need more jokes?", "Continue?",
						JOptionPane.YES_NO_OPTION);
				if (input == 1) {
					moreJokes = false;
				}
			}

		} catch (Exception e) {
			System.out.println(e);
		}
	}
}