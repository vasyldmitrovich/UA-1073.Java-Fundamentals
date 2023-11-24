package com.softserve.edu17.pt;

import java.net.URI;
import java.net.http.*;

import static java.net.http.HttpResponse.BodyHandlers.ofString;

public class MainClient2 {
    public static void main(String[] args) {
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest requestHello = HttpRequest.newBuilder()
                .GET()
                .uri(URI.create("http://localhost:8080/hello"))
                .build();
        HttpRequest requestStop = HttpRequest.newBuilder()
                .GET()
                .uri(URI.create("http://localhost:8080/stop"))
                .build();

        try {
            HttpResponse <String> response = client.send(requestStop, ofString());
            System.out.println("RES: " + response.body());
        } catch (Exception e) {
            System.out.println("Error during request execution: " +
                    e.getMessage());
        }
    }
}
