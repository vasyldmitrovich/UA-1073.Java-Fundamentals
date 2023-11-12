package com.softserve.edu16.iostreams.hw;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class hw1 {
    public static void main(String[] args) {
        List<String> lines = readLinesFromFile("mytext.txt");
        countAndWriteSymbols(lines);
        findLongestAndShortestLines(lines);
        findAndWriteLinesWithVar(lines);
    }

    private static List<String> readLinesFromFile(String fileName) {
        List<String> lines = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = br.readLine()) != null) {
                lines.add(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return lines;
    }

    private static void countAndWriteSymbols(List<String> lines) {
        System.out.println("1) Count of symbols in each line:");
        for (String line : lines) {
            int symbolCount = line.length();
            System.out.println("Line: \"" + line + "\" - Symbols: " + symbolCount);
        }
        System.out.println();
    }

    private static void findLongestAndShortestLines(List<String> lines) {
        String longestLine = "";
        String shortestLine = lines.get(0);
        for (String line : lines) {
            if (line.length() > longestLine.length()) {
                longestLine = line;
            }
            if (line.length() < shortestLine.length()) {
                shortestLine = line;
            }
        }
        System.out.println("2) Longest line: \"" + longestLine + "\" - Symbols: " + longestLine.length());
        System.out.println("   Shortest line: \"" + shortestLine + "\" - Symbols: " + shortestLine.length());
        System.out.println();
    }

    private static void findAndWriteLinesWithVar(List<String> lines) {
        System.out.println("3) Lines containing the word \"var\":");
        for (String line : lines) {
            if (line.contains("var")) {
                System.out.println("Line: \"" + line + "\"");
            }
        }
    }
}
