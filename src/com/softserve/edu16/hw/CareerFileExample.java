package com.softserve.edu16.hw;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class CareerFileExample {
    public static void main(String[] args) {
        createFile1();
        ArrayList<String> lines = readFromFile("file1.txt");
        writeToFile2(lines);
    }

    private static void createFile1() {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("file1.txt"))) {
            // Текст про кар'єру
            writer.write("Моя кар'єра:\n");
            writer.write("Я - Студент, який навчається на 3 курсі в ТНТУ, ");
            writer.write("та в даний час вивчаю java");
            writer.write("\n");
            writer.write("Мої досягнення за перший рік:\n");
            writer.write("Вивчив ази та йду до створення свого першого проекту на мові java.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static ArrayList<String> readFromFile(String fileName) {
        ArrayList<String> lines = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                lines.add(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return lines;
    }

    private static void writeToFile2(ArrayList<String> lines) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("file2.txt"))) {
            writer.write("Кількість рядків у file1.txt: " + lines.size() + "\n");

            String longestLine = lines.stream().max((s1, s2) -> Integer.compare(s1.length(), s2.length())).orElse("");
            writer.write("Найдовший рядок у file1.txt: " + longestLine + "\n");

            String yourName = "Новіцький Максим";
            String birthDate = "11.05.2004";
            writer.write("Максим 11.05.2004: " + yourName + ", " + birthDate + "\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
