import java.util.Scanner;
public class MonthDays {
    public static void main(String[] args) {
        int[] daysInMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number of month (1-12):");
        int nMonth = scan.nextInt();

        if(nMonth >=1 && nMonth <=12){
            int days = daysInMonth[nMonth - 1];
            System.out.println("In month " + nMonth + "," + days + " days");
        }
        else {
            System.out.println("Incorrect month, try another!");
        }
    }
}
