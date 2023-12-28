import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Task4 {

    public static void main(String[] args) {

        LocalDate birthday = LocalDate.of(2005, 6, 26);

        printBirthdayInfo(birthday);
    }

    public static void printBirthdayInfo(LocalDate birthday) {

        System.out.println("Day of the week for the birthday (" + formatDate(birthday) + "): " +
                birthday.getDayOfWeek());


        LocalDate sixMonthsLater = birthday.plusMonths(6);
        System.out.println("Day of the week 6 months later (" + formatDate(sixMonthsLater) + "): " +
                sixMonthsLater.getDayOfWeek());


        LocalDate twelveMonthsLater = birthday.plusMonths(12);
        System.out.println("Day of the week 12 months later (" + formatDate(twelveMonthsLater) + "): " +
                twelveMonthsLater.getDayOfWeek());
    }

    private static String formatDate(LocalDate date) {
        return date.format(DateTimeFormatter.ofPattern("MMMM d, yyyy"));
    }
}

