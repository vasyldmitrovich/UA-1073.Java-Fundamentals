package com.softserve.edu17.pt.task1;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpHeaders;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class MainClient {
    public static void main(String[] args) {
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder().uri(URI.create("http://localhost:8080/hello")).GET().build();
        while (true) {
            try {
                HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
                int statusCode = response.statusCode();
                System.out.println("Status Code: " + statusCode);
                HttpHeaders headers = response.headers();
                System.out.println("Response Headers: " + headers);
                String responseBody = response.body();
                System.out.println("Response Body: " + responseBody);
                Thread.sleep(1500);
            } catch (Exception e) {
                System.out.println("Error during request execution: " + e.getMessage());
            }
        }
    }
}
