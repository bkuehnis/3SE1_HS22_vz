package uebung13.vzb.ch.zhaw.strubili;

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
			int count = 1;
			for (int i = 0; i < 5; i++) {
				// query and print joke
				var res = client.send(request, HttpResponse.BodyHandlers.ofString());
				Savejoke jokes = gson.fromJson(res.body(), Savejoke.class);

				if (jokes.type.equals("single")) {
					JOptionPane.showMessageDialog(null, jokes.joke, "Single (" + count + ")",
							JOptionPane.INFORMATION_MESSAGE);
				} else {
					JOptionPane.showMessageDialog(null, jokes.setup, "Twopart (" + count + ")",
							JOptionPane.QUESTION_MESSAGE);
					JOptionPane.showMessageDialog(null, jokes.delivery, "Twopart (" + count + ")",
							JOptionPane.WARNING_MESSAGE);
				}
				count++;
				if (i == 4) {
					int eingabe = JOptionPane.showConfirmDialog(null, "Need more jokes?", "Continue?",
							JOptionPane.YES_NO_OPTION);
					if (eingabe == 0) {
						i = 0;
					} else {
						System.exit(0);
					}

				}

			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}