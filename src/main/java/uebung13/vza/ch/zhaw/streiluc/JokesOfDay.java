package uebung13.vza.ch.zhaw.streiluc;

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
        	// query and print joke
            var res = client.send(request, HttpResponse.BodyHandlers.ofString()); 
           SingelJoke[] jokeOfDay = gson.fromJson(res.body(), SingelJoke[].class);
            System.out.println(res.body());
          for (SingelJoke j: jokeOfDay) {
        	  int eingabe = JOptionPane.showConfirmDialog(null,"twoPart or single","Witze" ,JOptionPane.YES_NO_OPTION);
          	
          	if(eingabe == 0) {
          		System.out.println(j.joke);
          	}else {
          		System.out.println(j.joke);
          	}
          	System.out.println("Need more  jokes?");
          }
    
        } catch(Exception e) {};
       
     //ging irgendwie nichts   
       
	}
}
	


	
	