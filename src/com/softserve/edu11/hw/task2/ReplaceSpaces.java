//task2
import java.util.Scanner;

public class ReplaceSpaces {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input a sentence with multiple spaces
        System.out.println("Enter a sentence with multiple spaces:");
        String inputSentence = scanner.nextLine();

        // Replace multiple spaces with a single space
        String modifiedSentence = inputSentence.replaceAll("\\s+", " ");

        // Display the modified sentence
        System.out.println("Modified sentence: " + modifiedSentence);
    }
}
