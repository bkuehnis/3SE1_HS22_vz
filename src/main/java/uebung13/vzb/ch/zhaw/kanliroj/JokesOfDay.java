package uebung13.vzb.ch.zhaw.kanliroj;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

import javax.swing.JOptionPane;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class JokesOfDay {

	public static void main(String[] args) {
        int numberOfJokesMade = 0;
        HttpClient client = HttpClient.newHttpClient();
        Gson gson = new GsonBuilder().create();

        while (true) {
            // Show 5 jokes in a row
            for (int i = 0; i < 5; i++)
                requestAndShowJoke(++numberOfJokesMade, client, gson);
            // Ask the user if they want more jokes
            int answer = JOptionPane.showConfirmDialog(null, "Need more jokes?", "Continue?", JOptionPane.YES_NO_OPTION);
            if (answer != JOptionPane.YES_OPTION) {
                // The user doesn't want more jokes, exit the loop
                System.out.println("Bye!");
                break;
            }
        }
	}

    private static void requestAndShowJoke(int numberOfJokesMade, HttpClient client, Gson gson) {
        // Send a request to the API
        HttpRequest request = HttpRequest.newBuilder().uri(URI.create("https://v2.jokeapi.dev/joke/Any?safe-mode")).GET().build();
        HttpResponse<String> response;
        try {
            response = client.send(request, HttpResponse.BodyHandlers.ofString());
        } catch (Exception e) {
            somethingWentWrong(e.getMessage());
            return;
        }
        if (response.statusCode() != 200) {
            somethingWentWrong(response.statusCode() + " - " + response.body());
            return;
        } else if (response.body() == null) {
            somethingWentWrong("The response body was null");
            return;
        }
        // Try to parse the response body
        Joke joke;
        try {
            joke = gson.fromJson(response.body(), Joke.class);
        } catch (Exception e) {
            somethingWentWrong(e.getMessage());
            return;
        }
        // Check if the joke is an error
        if (joke.isError()) {
            somethingWentWrong(joke.getPart(1));
            return;
        }
        // Show the joke
        joke.show(numberOfJokesMade);
    }

    private static void somethingWentWrong(String message) {
        // Print the error message to the console
        System.err.println("Something went wrong: " + message);
        // Try to show a dialog
        try {
            JOptionPane.showMessageDialog(null, "Something went wrong when trying to make a joke. Check the console for more information.", "There was an unexpected exception", JOptionPane.ERROR_MESSAGE);
        } catch (UnsupportedOperationException e) {
            // The system is headless (has no video output) and we can't show a dialog
        }
    }

}