import java.io.*;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;

public class Task1 {
    private static final String readFrom = "src/com/softserve/edu16/hw/Task1/file1.txt";
    private static final String writeTo = "src/com/softserve/edu16/hw/Task1/file2.txt";

    public static void main(String[] args) {
        read();
    }

    public static void read() {
        StringBuilder sb = new StringBuilder();
        String[] words;

        try (BufferedReader br = new BufferedReader(new FileReader(readFrom))) {
            String line;
            while ((line = br.readLine()) != null) {
                sb.append(line).append(" ");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        words = sb.toString().split(" ");
        Arrays.stream(words).forEach(System.out::println);
        write(words.length, Arrays.stream(words).max(String::compareTo).orElse(""), "Maksym 26");
    }

    public static void write(int lines, String longestLine, String nameAndBirth) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(writeTo))) {
            writer.write("Lines: " + lines + "\n");
            writer.write("Longest line: " + longestLine + "\n");
            writer.write("Name and Birth: " + nameAndBirth + "\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
