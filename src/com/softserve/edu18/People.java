package com.softserve.edu18;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class People {
    private List<String> people = new ArrayList<>();
    private Map<String, HashSet<Integer>> peopleIndex = new HashMap<>();

    public People(String filename) {
        readPeople(filename);
        buildPeopleIndex();
    }

    private void readPeople(String filename) {
        try (var fis = Files.lines(Path.of(filename))) {
            people = fis.toList();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private void buildPeopleIndex() {
        for (int i = 0; i < people.size(); i++) {
            String[] elements = people.get(i).toLowerCase().split(" ");
            for (String element : elements) {
                if (peopleIndex.containsKey(element)) {
                    peopleIndex.get(element).add(i);
                } else {
                    var set = new HashSet<Integer>();
                    set.add(i);
                    peopleIndex.put(element, set);
                }
            }
        }
    }

    public void print() {
        System.out.println("\n=== List of people ===");
        if (!people.isEmpty()) {
            people.stream()
                    .forEach(System.out::println);
        } else {
            System.out.println("No matching people found.");
        }

    }

    public void printAny(String query) {
        var result = Arrays.stream(query.toLowerCase().strip().split("\\s+"))
                .filter(word -> peopleIndex.containsKey(word))
                .flatMap(word -> peopleIndex.get(word).stream())
                .collect(Collectors.toSet());
        if (!result.isEmpty()) {
            System.out.println("\n" + result.size() + " persons found:");
            for (var el : result) {
                System.out.println(people.get(el));
            }
        } else {
            System.out.println("No matching people found.");
        }
    }

    public void printAll(String query) {
        var result = new HashSet<Integer>();
        var words = query.toLowerCase().strip().split("\\s+");
        var isAllWordsPresent = true;
        for (var word : words) {
            if (!peopleIndex.containsKey(word)) {
                isAllWordsPresent = false;
            }
        }
        if (isAllWordsPresent) {
            result.addAll(peopleIndex.get(words[0]));
            for (int i = 1; i < words.length; i++) {
                result.retainAll(peopleIndex.get(words[i]));
            }
        }
        if (!result.isEmpty()) {
            System.out.println("\n" + result.size() + " persons found:");
            for (var el : result) {
                System.out.println(people.get(el));
            }
        } else {
            System.out.println("No matching people found.");
        }
    }

    public void printNone(String query) {
        var result = IntStream.range(0, people.size())
                .boxed().collect(Collectors.toSet());
        var exclude = Arrays.stream(query.toLowerCase().strip().split("\\s+"))
                .filter(word -> peopleIndex.containsKey(word))
                .flatMap(word -> peopleIndex.get(word).stream())
                .collect(Collectors.toSet());
        result.removeAll(exclude);
        if (!result.isEmpty()) {
            System.out.println("\n" + result.size() + " persons found:");
            for (var el : result) {
                System.out.println(people.get(el));
            }
        } else {
            System.out.println("No matching people found.");
        }
    }
}
