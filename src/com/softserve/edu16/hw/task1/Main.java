package com.softserve.edu16.hw.task1;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.*;
import java.util.logging.Logger;

public class Main {
    private static final Logger LOG = Logger.getLogger(String.valueOf(Main.class));
    private static final String PATH_TO_DIRECTORY = System.getProperty("user.dir");
    private static final String PATH_PACKAGE = PATH_TO_DIRECTORY + "/src/com/softserve/edu16/hw/task1/";
    private static final String PATH_FILE = "file1.txt";
    private static final String PATH_WRITE_FILE = "file2.txt";

    public static void main(String[] args) {
        try (var streamLines = Files.lines(Path.of(PATH_PACKAGE + PATH_FILE))) {
            var lines = streamLines.toArray(String[]::new);
            List<String> objects = groupMessage(lines);

            Files.write(Path.of(PATH_PACKAGE + PATH_WRITE_FILE), objects, StandardCharsets.UTF_8, StandardOpenOption.CREATE);

            LOG.info("Information about " + PATH_FILE + " was written to " + PATH_WRITE_FILE + " successfully.");
        } catch (IOException e) {
            LOG.info(e.getMessage());
        }
    }

    private static List<String> groupMessage(String[] lines){
        List<String> objects = new ArrayList<>();

        objects.add(String.format("Number of lines in file1.txt: %d", lines.length));
        objects.add("The longest line in file1.txt: " + getLongestLine(lines));
        objects.add("Your name: " + getFirstName(lines));
        objects.add("Birthday date: " + getBirthday(lines));

        return objects;
    }

    private static String getLongestLine(String[] lines) {
        return Arrays.stream(lines)
                .max(Comparator.comparing(String::length))
                .orElse("Not found");
    }

    private static String getFirstName(String[] lines){
        return findLineByTag(lines, "Name:");
    }

    private static String getBirthday(String[] lines){
        return findLineByTag(lines, "Birthday:");
    }

    private static String findLineByTag(String[] lines, String tagFind) {
        String tagFindLowerCase = tagFind.toLowerCase();

        return Arrays.stream(lines)
                .map(String::toLowerCase)
                .filter(line -> line.contains(tagFindLowerCase))
                .findFirst()
                .map(s -> s.substring(s.indexOf(tagFindLowerCase) + tagFindLowerCase.length() + 1))
                .orElse("Not found");
    }
}
