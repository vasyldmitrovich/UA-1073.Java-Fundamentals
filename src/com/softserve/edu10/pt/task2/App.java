package com.softserve.edu10.pt.task2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class App {
    public static void main(String[] args) throws IOException {
        String text = Files.readString(Path.of("C:/Users/1245/Downloads/pg72033.txt"));
        System.out.println(text.length());
        System.out.println(text.substring(0,500));
        String[] words = text.split("[^a-zA-Z'-]+");
        for (int i = 0; i < 500; i++) {
            System.out.print(words[i] + " ");
        }
        Map<String, Integer> counter = new HashMap<>();
        for (var word : words){
            word : word.toLowerCase();
            if (counter.containsKey(word)){
                counter.put(word, counter.get(word) + 1);
            }else {
                counter.put(word, 1);
            }
        }
        System.out.println(counter.size());
        var it = counter.entrySet().iterator();
        for (int i = 0; i < 50; i++) {
            var entry = it.next();
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
        System.out.println("The " + counter.get("The"));

        var entries = new ArrayList<>(counter.entrySet());
        entries.sort((o1, o2) -> Integer.compare(o2.getValue(), o1.getValue()));
        System.out.println("====================");
        for (int i = 0; i < 10; i++) {
            var entry = entries.get(i);
            System.out.println(entry.getKey() + " : " + entry.getValue());

        }
    }
}
