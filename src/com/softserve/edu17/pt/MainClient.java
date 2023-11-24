package com.softserve.edu17.pt;

import java.net.URI;
import java.net.http.*;

import static java.net.http.HttpResponse.BodyHandlers.ofString;

public class MainClient {
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
            for (int i = 0; i<5; i++) {
                HttpResponse<String> response = client.send(requestHello,
                        ofString());
                int statusCode = response.statusCode();
                System.out.println("Status Code: " + statusCode);
                HttpHeaders headers = response.headers();
                System.out.println("Response Headers: " + headers);
                String responseBody = response.body();
                System.out.println("Response Body: " + responseBody);
                Thread.sleep(1500);
            }

        } catch (Exception e) {
            System.out.println("Error during request execution: " +
                    e.getMessage());
        }
    }
}
