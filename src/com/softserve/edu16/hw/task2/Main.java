package com.softserve.edu16.hw.task2;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Logger;

public class Main {
    private static final Logger LOG = Logger.getLogger(String.valueOf(Main.class));
    private static final String PATH_TO_DIR = System.getProperty("user.dir");
    private static final String PATH_PACKAGE = PATH_TO_DIR + "/src/com/softserve/edu16/hw/task2/";
    private static final String PATH_FILE = "TestFile.java";
    private static final String PATH_WRITE_FILE = "FileWithChanges.java";

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

    public static List<String> groupMessage(String[] lines){
        return Arrays.stream(lines)
                .map(line -> line.replace("TestFile", "FileWithChanges"))
                .map(line -> line.replace("public", "private"))
                .toList();
    }
}
