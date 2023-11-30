package com.softserve.edu16.hw;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ModifyAccessModifiers {
    public static void main(String[] args) {
        String inputFileName = "file1.txt";
        String outputFileName = "file2.txt";

        String modifiedText = modifyAccessModifiers(inputFileName);

        writeToFile(outputFileName, modifiedText);

        System.out.println("Зміни внесено та збережено у файлі " + outputFileName);
    }

    private static String modifyAccessModifiers(String fileName) {
        StringBuilder modifiedText = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                // Заміна "public" на "private" у оголошенні атрибутів та методів класу
                line = line.replaceAll("\\bpublic\\b", "private");
                modifiedText.append(line).append("\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return modifiedText.toString();
    }

    private static void writeToFile(String fileName, String content) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            writer.write(content);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}