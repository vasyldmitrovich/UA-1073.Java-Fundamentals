import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        String date = "08.24.91";

        if (isValidDate(date)) {
            System.out.println("The date is valid: " + date);
        } else {
            System.out.println("Invalid date format: " + date);
        }
    }

    public static boolean isValidDate(String date) {
        String[] parts = date.split("\\.");

        return parts.length == 3 &&
                Arrays.stream(parts).allMatch(Main::isNumeric) &&
                isValidMonth(Integer.parseInt(parts[0])) &&
                isValidDay(Integer.parseInt(parts[1])) &&
                isValidYear(Integer.parseInt(parts[2]));
    }

    private static boolean isNumeric(String s) {
        return s.chars().allMatch(Character::isDigit);
    }

    private static boolean isValidMonth(int month) {
        return month >= 1 && month <= 12;
    }

    private static boolean isValidDay(int day) {
        return day >= 1 && day <= 31;
    }

    private static boolean isValidYear(int year) {
        return year >= 0 && year <= 99;
    }
}

