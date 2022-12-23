package uebung13.vza.ch.zhaw.kernpas1;

import java.net.URI;
import javax.swing.*;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class JokesOfDay {

	public static void main(String[] args) {
		var client = HttpClient.newHttpClient();
		Gson gson = new GsonBuilder().create();

		var request = HttpRequest.newBuilder()
				.uri(URI.create("https://v2.jokeapi.dev/joke/Any?safe-mode"))
				.GET().build();

		try{
			int count = 0;
			boolean x = true;
			while (x) {
				var res = client.send(request, HttpResponse.BodyHandlers.ofString());
				Witze witze = gson.fromJson(res.body(), Witze.class);

				if (count == 5) {
					int eingabe = JOptionPane.showConfirmDialog(null, "Need more Jokes?", "Continue?", JOptionPane.YES_NO_OPTION);
					if (eingabe == 1) {
						System.exit(0);
					}
					if (eingabe == 0) {
						count = 0;
					}
				}
				if (witze.type.contains("single")) {
					JOptionPane.showMessageDialog(null,witze.joke,"Programming Joke ("+count+")",JOptionPane.INFORMATION_MESSAGE);
					count++;
				} else {
					JOptionPane.showMessageDialog(null, witze.setup,"Programming Joke ("+count+")",JOptionPane.QUESTION_MESSAGE);
					JOptionPane.showMessageDialog(null, witze.delivery, "Programming Joke ("+count+")",JOptionPane.WARNING_MESSAGE);
					count++;
				}

			}
		} catch(Exception e){System.out.println(e);}
	}
}