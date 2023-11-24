import java.io.*;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Task2 {

    private static final String readFrom = "src/com/softserve/edu16/hw/Task2/program.txt";
    private static final String writeTo = "src/com/softserve/edu16/hw/Task2/file2.txt";
    public static void main(String[] args) {
        read();
    }
    public static void read() {
        try(BufferedReader reader = new BufferedReader(new FileReader(readFrom));
            BufferedWriter writer = new BufferedWriter(new FileWriter(writeTo))) {
            String str;
            while ((str = reader.readLine()) != null) {

                str = str.replace("public", "private");
                writer.write(str);
                writer.newLine();
            }
        } catch (IOException e) {

        }
    }
}