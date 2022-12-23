package uebung13.vzb.ch.zhaw.jermaloi;

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

            int countJokes = 0;
            boolean anotherRound = true;

            while(anotherRound){

                countJokes++;
                var res = client.send(request, HttpResponse.BodyHandlers.ofString());
                Joke joke = gson.fromJson(res.body(), Joke.class);


                if (joke.getType().equalsIgnoreCase("twopart")) {
                    JOptionPane.showMessageDialog(null, joke.getSetup(),
                            joke.getCategory() + " Joke (" + countJokes + ")", JOptionPane.QUESTION_MESSAGE);
                    JOptionPane.showMessageDialog(null, joke.getDelivery(),
                            joke.getCategory() + " Joke (" + countJokes + ")", JOptionPane.WARNING_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(null, joke.getJoke(),
                            joke.getCategory() + " Joke (" + countJokes + ")", JOptionPane.INFORMATION_MESSAGE);
                }

                if(countJokes%5==0){
                    int answer = JOptionPane.showConfirmDialog(null, "Need more jokes?", "Continue?", JOptionPane.YES_NO_OPTION);
                    anotherRound = (answer == 0);
                }
            }

          
        } catch(Exception e){System.out.println(e);}
	}
}