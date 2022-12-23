package uebung13.vza.ch.zhaw.stettjoe;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

import javax.swing.JOptionPane;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class JokesOfDay {

	public static void main(String[] args) {
		for (int i = 0; i<5; i++) {
			var client = HttpClient.newHttpClient();
	        Gson gson = new GsonBuilder().create();

	        var request = HttpRequest.newBuilder()
	        		.uri(URI.create("https://v2.jokeapi.dev/joke/Any?safe-mode"))
	        		.GET().build();

	        try{
	        	// query and print joke
	            var res = client.send(request, HttpResponse.BodyHandlers.ofString()); 
	            //System.out.println(res.body());
	            Witz witz1 = gson.fromJson(res.body(), Witz.class);
	            //System.out.println(witz1.getType());
	            
	            if (witz1.getType().equals("single")) {
	            	Single single = gson.fromJson(res.body(), Single.class);
	            	//System.out.println(single.getJoke());
	            	JOptionPane.showMessageDialog(null, single.getJoke(), single.getCategory(), JOptionPane.INFORMATION_MESSAGE);
	            } else {
	            	Twopart twopart = gson.fromJson(res.body(), Twopart.class);
	            	//System.out.println(twopart.getSetup());
	            	//System.out.println(twopart.getDelivery());
	            	JOptionPane.showMessageDialog(null, twopart.getSetup(), twopart.getCategory(), JOptionPane.QUESTION_MESSAGE);
	            	JOptionPane.showMessageDialog(null, twopart.getDelivery(), twopart.getCategory(), JOptionPane.WARNING_MESSAGE);
	            }
	            
	            
	          
	        } catch(Exception e){System.out.println(e);}
	        
	        if (i == 4) {
	        	int eingabe = JOptionPane.showConfirmDialog(null, "Need more jokes?", "Continue?", JOptionPane.YES_NO_OPTION);
	        	
	        	if (eingabe == 0) {
	        		i = -1;
	        	}
	        }
		}
	}
}