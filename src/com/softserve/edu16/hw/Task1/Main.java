package com.softserve.edu16.hw.Task1;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Optional;
import java.util.stream.Stream;

import static java.util.Locale.filter;

public class Main {
    public static void main(String[] args) throws IOException {
        var lines = Files.lines(Path.of("file1.txt"))
                .toArray(String[]::new);
      Optional <String> longest = Arrays.stream(lines)
                .max(Comparator.comparing(String::length));
      Stream<String> name =
       Arrays.stream(lines)
              .filter(w -> w.contains("Valko Vladysava"));
      Stream<String> date =
              Arrays.stream(lines)
                      .filter(el -> el.contains("20.07.1998"));
        String input = "Lines " + lines.length + "\n" + "Longest line " + longest + "\n" + " Name: " + Arrays.toString(name.toArray()) + "\n"
                + "Date of birth: " + Arrays.toString(date.toArray());
        Files.writeString(Path.of("file2.txt"), input);

    }
}
