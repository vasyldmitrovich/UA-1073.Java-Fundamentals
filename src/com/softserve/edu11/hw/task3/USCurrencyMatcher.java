//task3
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class USCurrencyMatcher {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input a text containing instances of US currency format
        System.out.println("Enter text containing US currency format:");
        String inputText = scanner.nextLine();

        // Define the pattern for US currency format
        String currencyPattern = "\\$\\d+\\.\\d{2}";
        Pattern pattern = Pattern.compile(currencyPattern);
        Matcher matcher = pattern.matcher(inputText);

        // Display all occurrences of US currency format
        System.out.println("US currency formats found in the text:");
        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}