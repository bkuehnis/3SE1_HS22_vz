package uebung13.vza.ch.zhaw.doenmhac;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import javax.swing.*;
import java.util.ArrayList;
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
			// query and print joke


			int count = 0;

			while (count==0){

				var res = client.send(request, HttpResponse.BodyHandlers.ofString());
				Joke j1 = gson.fromJson(res.body(), Joke.class);

				if (j1.getType().equals("single")) {
					JOptionPane.showMessageDialog(null, j1.getJoke() ,
							j1.getCategory() + "(" + j1.getId() + ")",JOptionPane.INFORMATION_MESSAGE);
				}else {

					JOptionPane.showMessageDialog(null, j1.getSetup(),
							j1.getCategory() + "(" + j1.getId() + ")", JOptionPane.QUESTION_MESSAGE);
					JOptionPane.showMessageDialog(null, j1.getDelivery(),
							j1.getCategory() + "(" + j1.getId() + ")", JOptionPane.WARNING_MESSAGE);
				}
				int eingabe = JOptionPane.showConfirmDialog(null, "Need more jokes?",
						"Continue?", JOptionPane.YES_NO_OPTION);
				if (eingabe==1) {
					count++;
				}

			}

		} catch(Exception e){System.out.println(e);}
	}
}