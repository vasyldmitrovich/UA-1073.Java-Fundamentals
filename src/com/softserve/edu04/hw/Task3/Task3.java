/*Input a number representing an HTTP error (such as 400, 401, 402, etc.) and output the name
of the error using an enum called HTTPError.*/
package com.softserve.edu04.hw.Task3;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter HTTP error code:");
        int errorCode = scan.nextInt();
        ErrorCodes errorCodes = ErrorCodes.fromErrorCode(errorCode);
        System.out.println("Error name is: " + errorCodes.getErrorName());
        scan.close();
    }
}
