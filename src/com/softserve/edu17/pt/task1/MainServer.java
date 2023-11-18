package com.softserve.edu17.pt.task1;

import com.sun.net.httpserver.HttpServer;

import java.io.IOException;
import java.net.InetSocketAddress;

public class MainServer {
    public static void main(String[] args) throws Exception {
        HttpServer server = HttpServer.create(new InetSocketAddress(8080), 100);
        server.createContext("/hello", exchange -> {
            System.out.println("Request from '" + exchange.getRemoteAddress() + "': " + exchange.getRequestMethod() + " " + exchange.getRequestURI());
            var response = "Hello, HTTP world!".getBytes();
            exchange.sendResponseHeaders(200, response.length);
            try (var x = exchange.getResponseBody()) {
                x.write(response);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        });
        server.createContext("/stop", exchange -> {
            var response = "By!".getBytes();
            exchange.sendResponseHeaders(200, response.length);
            exchange.getResponseBody().write(response);
            System.out.println("Stopping the server. By!");
            server.stop(1);
        });
        server.start();
    }
}
