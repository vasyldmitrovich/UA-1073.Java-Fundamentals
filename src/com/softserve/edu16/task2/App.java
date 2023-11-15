package com.softserve.edu16.task2;

import java.io.*;
import java.nio.file.Path;
import java.nio.file.Paths;

public class App {

    private static final String readFrom = "src/com/softserve/edu16/task2/program.txt";
    private static final String writeTo = "src/com/softserve/edu16/task1/file2.txt";
    public static void main(String[] args) {
        read();
    }

    public static void read() {
        try(BufferedReader reader = new BufferedReader(new FileReader(readFrom));
            BufferedWriter writer = new BufferedWriter(new FileWriter(writeTo))) {
            String s;
            while ((s = reader.readLine()) != null) {

                s = s.replace("public", "private");
                writer.write(s);
                writer.newLine();
            }
        } catch (IOException e) {

        }
    }
}
