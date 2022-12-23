package uebung13.vza.ch.zhaw.zejnutri;

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
        	// query and print joke
            var res = client.send(request, HttpResponse.BodyHandlers.ofString()); 
            System.out.println(res.body());
          
        } catch(Exception e){System.out.println(e);}
	}
}