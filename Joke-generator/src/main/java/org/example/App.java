package org.example;

import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Optional;

public class App {
    public static Optional<String> parseJoke(String responseBody){
        try {
            JokeResponse jokeResponse = new Gson().fromJson(responseBody, JokeResponse.class);
            String joke = jokeResponse.getJoke();
            if(joke != null)
                return Optional.of(jokeResponse.getJoke());
        }catch (Exception e) {
            System.out.println("must be out of the joke");
            return Optional.empty();
        }
    return Optional.empty();
    }
    public static void main(String[] args) throws IOException, InterruptedException {
        // create a client
        var client = HttpClient.newHttpClient();

        // create a request
        var request = HttpRequest.newBuilder(
                        URI.create("https://icanhazdadjoke.com/"))
                .header("accept","application/json")
                .build();

        // use client to send the request
        var response = client.send(request, HttpResponse.BodyHandlers.ofString());

        Optional<String> jokeOpt = parseJoke(response.body());

        jokeOpt.ifPresent(System.out::println);

    }
}
