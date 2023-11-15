package com.softserve.edu16.task1;

import java.io.*;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;

public class App {
    private static final String readFrom = "src/com/softserve/edu16/task1/file1.txt";
    private static final String writeTo = "src/com/softserve/edu16/task1/file2.txt";
    public static void main(String[] args) {
        read();
    }
    public static void read() {
        StringBuilder sb = new StringBuilder();
        String[] array;
        String s;
        try (BufferedReader br = new BufferedReader(new FileReader(readFrom))) {
            while ((s = br.readLine()) != null ) {
                sb.append(s + " ");
            }
        } catch (IOException e) {

        }
        array = sb.toString().split(" ");
       Arrays.stream(array).forEach(System.out::println);
       write(array.length, Arrays.stream(array).max(String::compareTo).get(), new String("Nazar 23"));
    }
    public static void write(int lines, String longestLine, String nameAndBirth) {
        try(BufferedWriter writer = new BufferedWriter(new FileWriter(writeTo))) {
            writer.write("Lines: " + lines + "\n");
            writer.write("Longest line: " + longestLine + "\n");
            writer.write("Name and Birth: " + nameAndBirth + "\n");
        } catch (IOException e) {

        }
    }

}
