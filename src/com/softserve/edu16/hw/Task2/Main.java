package com.softserve.edu16.hw.Task2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.Optional;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) throws IOException {
        var lines = Files.lines(Path.of("JavaText.txt"))
                .toArray(String[]::new);
       String [] newText = Arrays.stream(lines)
                .map(el -> el.replaceAll("public", "private"))
                .toArray(String[]::new);
        ;
        Files.writeString(Path.of("NewFileWithJavaCode.txt"), Arrays.asList(newText).toString());
    }
}
