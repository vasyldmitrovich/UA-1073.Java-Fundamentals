import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Task2 {

    public static void main(String[] args) {
        String dateToValidate = "12.31.21";

        if (isValidDate(dateToValidate, "MM.dd.yy")) {
            System.out.println("The date is valid.");
        } else {
            System.out.println("The date is not valid.");
        }
    }

    public static boolean isValidDate(String dateStr, String format) {
        SimpleDateFormat dateFormat = new SimpleDateFormat(format);
        dateFormat.setLenient(false); // This will make the validation strict

        try {
            Date date = dateFormat.parse(dateStr);
            return true;
        } catch (ParseException e) {
            return false;
        }
    }
}
