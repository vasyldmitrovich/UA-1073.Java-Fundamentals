package com.softserve.edu16.hw.task02;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class App {
    public static void main(String[] args) {
        try (var fis = Files.lines(Path.of("src/com/softserve/edu16/hw/task02/InputExample.java"))) {
            var lines = fis
                    .map(line -> line.replaceAll("public(?!.*class)", "private")
                            .replaceAll("InputExample", "OutputExample"))
                    .toList();
            Files.write(Path.of("src/com/softserve/edu16/hw/task02/OutputExample.java"), lines);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
