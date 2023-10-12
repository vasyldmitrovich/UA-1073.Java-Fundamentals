/*Input a number representing an HTTP error (such as 400, 401, 402, etc.) and output the name
of the error using an enum called HTTPError.*/
import java.util.Scanner;
public enum ErrorCodes {
    // Define enum constants with associated error code and error name.
    HTTP_400(400, "Bad Request"),
    HTTP_401(401, "Unauthorized"),
    HTTP_402(402, "Payment Required"),
    HTTP_204(204, "No Content"),
    HTTP_404(404, "Not Found"),
    HTTP_406(406, "Not Acceptable"),
    HTTP_409(409, "Conflict"),

    // Define a special UNKNOWN_ERROR constant
    UNKNOWN_ERROR(-1, "Unknown Error");

    // Declare instance variables to store error code and error name for each enum constant.
    private final int errorCode;
    private final String errorName;

    // Constructor for ErrorCodes
    ErrorCodes(int errorCode, String errorName) {
        this.errorCode = errorCode;
        this.errorName = errorName;
    }

    // Getter
    public int getErrorCode() {
        return errorCode;
    }

    // Getter
    public String getErrorName() {
        return errorName;
    }

    // Static method to convert an error code into the corresponding ErrorCodes enum constant.
    public static ErrorCodes fromErrorCode(int errorCode) {
        for (ErrorCodes error : ErrorCodes.values()) {
            if (error.getErrorCode() == errorCode) {
                return error;
            }
        }
        return UNKNOWN_ERROR; // If no match is found, return the UNKNOWN_ERROR constant.
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter HTTP error code:");
        int errorCode = scan.nextInt();
        ErrorCodes errorCodes = ErrorCodes.fromErrorCode(errorCode);
        System.out.println("Error name is: " + errorCodes.getErrorName());
        scan.close();
    }
}