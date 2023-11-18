package com.softserve.edu16.hw.task2;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;


public class App {
    public static void main(String[] args) throws IOException {
        Path path = Path.of("src/com/softserve/edu16/hw/task1/App.java");
        String program = Files.readString(path);
        program = program.replace("public", "private");
        Path newPath = Path.of("src/com/softserve/edu16/hw/task2/Repaired.txt");
        Files.write(newPath, program.getBytes(), StandardOpenOption.CREATE);
    }
}
