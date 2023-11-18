package com.softserve.edu16.hw.task1;

import com.softserve.global.Global;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Optional;
import java.util.stream.Stream;

public class Task1 {
    private static final String PATH_PACKAGE = Global.getPath("/src/com/softserve/edu16/hw/task1");
    public static void main(String[] args) {
        try (Stream<String> file = Files.lines(Path.of(PATH_PACKAGE + "/file1.txt"))){
            String[] lines = file.toArray(String[]::new);

            Optional<String> longestLine = getLongestLine(lines);

            BufferedWriter newFile = new BufferedWriter(new FileWriter(PATH_PACKAGE + "/file2.txt"));
            newFile.write("Line length: " + lines.length);

            if (longestLine.isPresent()) {
                newFile.newLine();
                newFile.append("Longest line:" + longestLine.get());
            }

            newFile.newLine();
            newFile.append("My name and birthday: Alina, 01.01.0000");
            newFile.close();
        } catch(IOException e) {
            e.printStackTrace();
        }
    }

    public static Optional<String> getLongestLine(String[] lines) {
        return Arrays.stream(lines).max(Comparator.comparing(String::length));
    }
}
