package uebung13.vzb.ch.zhaw.osmanmin;

import java.net.URI;
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
        	
        	//Komme nicht auf eine Lösung, welche kompiliert...
            var res = client.send(request, HttpResponse.BodyHandlers.ofString());
            Joke[] jokes = gson.fromJson(res.body(), Joke[].class);
           
            System.out.println(res.body());
          
        } catch(Exception e){System.out.println(e);}
	}
}