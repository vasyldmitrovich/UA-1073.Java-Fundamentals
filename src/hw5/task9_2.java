import java.util.Scanner;
public class SumOf {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] num = new int [10];
        System.out.println("Enter 10 integers :");
        for (int i = 0; i < 10; i++) {
            System.out.println("Integer" + (i + 1) + ": ");
            num[i] = scan.nextInt();
        }
        int sumOfFirstFive = 0;
        int productOfLastFive = 1;

        for (int i = 0; i < 10; i++) {
            if (i < 5) {
                if(num[i] > 0){
                    sumOfFirstFive += num[i];
                }
            }
            else {
                productOfLastFive *= num[i];
            }
            if(sumOfFirstFive > 0){
                System.out.println("Sum of the first five positive numbers: " + sumOfFirstFive);
            }
            else {
                System.out.println("Product of the last five numbers: " + productOfLastFive);
            }
        }
    }
}
