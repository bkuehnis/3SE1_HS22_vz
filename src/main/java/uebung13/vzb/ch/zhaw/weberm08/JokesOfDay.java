package uebung13.vzb.ch.zhaw.weberm08;

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
        int jokeCounter = 0;

        var request = HttpRequest.newBuilder()
        		.uri(URI.create("https://v2.jokeapi.dev/joke/Any?safe-mode"))
        		.GET().build();

        try{
        	// query and print joke
        	for (int i = 0; i < 5; i ++) {
        		jokeCounter++;
        		var res = client.send(request, HttpResponse.BodyHandlers.ofString()); 
                Joke jokes = gson.fromJson(res.body(), Joke.class);
                
                if (jokes.type.contains("twopart")) {
                	JOptionPane.showMessageDialog(null, jokes.setup, "Pun Joke ("+jokeCounter+")",JOptionPane.QUESTION_MESSAGE);
                	JOptionPane.showMessageDialog(null, jokes.delivery, "Pun Joke ("+jokeCounter+")",JOptionPane.WARNING_MESSAGE);
                } else {
                	JOptionPane.showMessageDialog(null, jokes.delivery, "Pun Joke ("+jokeCounter+")",JOptionPane.INFORMATION_MESSAGE);
                }
                
                if (i == 4) {
                	int eingabe = JOptionPane.showConfirmDialog(null,"Need more jokes?","Continue?",JOptionPane.YES_NO_OPTION);
                	if (eingabe == 0) {
                		i = 0;
                	} else {
                		System.exit(0);
                	}
                }
        	}
            //System.out.println(jokes.delivery);
          
        } catch(Exception e){System.out.println(e);}
	}
}