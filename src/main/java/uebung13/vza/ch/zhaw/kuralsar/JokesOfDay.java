package uebung13.vza.ch.zhaw.kuralsar;

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

		var request = HttpRequest.newBuilder()
				.uri(URI.create("https://v2.jokeapi.dev/joke/Any?safe-mode"))
				.GET().build();

		try{
			boolean moreJokes = true;
			int jokeCounter = 1;
			while (moreJokes) {
				for (int i=0; i<2; i++) {
					var res = client.send(request, HttpResponse.BodyHandlers.ofString()); 
					System.out.println(res.body());
					Joke newJoke = gson.fromJson(res.body(), Joke.class);
					String title = newJoke.category+ " Joke ("+jokeCounter+")";
					if (newJoke.type.equals("single")) {
						JOptionPane.showMessageDialog(null,newJoke.joke,title,JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(null,newJoke.setup,title,JOptionPane.QUESTION_MESSAGE);
						JOptionPane.showMessageDialog(null,newJoke.delivery,title,JOptionPane.WARNING_MESSAGE);
					}
					jokeCounter++;
				}
				int input = JOptionPane.showConfirmDialog(null,"Need more jokes?", "Continue?",JOptionPane.YES_NO_OPTION);
				if (input == 1) {
					moreJokes = false;
				}
			}
		} catch(Exception e){System.out.println(e);}
	}
}