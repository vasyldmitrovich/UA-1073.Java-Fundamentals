//task1
import java.util.Scanner;

public class WordTasks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input a sentence of five words
        System.out.println("Enter a sentence of five words:");
        String sentence = scanner.nextLine();

        // Split the sentence into words
        String[] words = sentence.split(" ");

        // Identify the longest word in the sentence
        String longestWord = "";
        for (String word : words) {
            if (word.length() > longestWord.length()) {
                longestWord = word;
            }
        }

        // Determine the number of letters in the longest word
        int longestWordLength = longestWord.length();

        // Display the longest word and its length
        System.out.println("Longest word: " + longestWord);
        System.out.println("Number of letters in the longest word: " + longestWordLength);

        // Display the second word in reverse order
        if (words.length >= 2) {
            String secondWord = words[1];
            String reversedSecondWord = new StringBuilder(secondWord).reverse().toString();
            System.out.println("Second word in reverse: " + reversedSecondWord);
        } else {
            System.out.println("There are not enough words to display the second word in reverse.");
        }
    }
}
