package com.softserve.edu16.hw.task2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class App {

    public static void main(String[] args) {

        String inputFileName = "C:/Users/Asus/Desktop//file3.txt";
        String outputFileName = "C:/Users/Asus/Desktop/file4.txt";

        try (BufferedReader reader = new BufferedReader(new FileReader(inputFileName));
             BufferedWriter writer = new BufferedWriter(new FileWriter(outputFileName))) {

            String line;
            while ((line = reader.readLine()) != null) {
                line = line.replaceAll("\\bpublic\\b", "private");
                writer.write(line + "\n");
            }

            System.out.println("Java file has been modified successfully. Result saved to " + outputFileName);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
