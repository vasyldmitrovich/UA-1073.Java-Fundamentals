import java.util.Scanner;

public class Proj4 {
    public static double area;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Input 3 values to calculate the area");
        double s1 = scan.nextDouble();
        double s2 = scan.nextDouble();
        double s3 = scan.nextDouble();
        area = calculateArea(s1, s2, s3);
        System.out.format("\nThe Area of the triangle = %.2f\n", area);
        scan.close(); // Close the Scanner to prevent resource leak
    }

    public static double calculateArea(double s1, double s2, double s3) {
        double s = (s1 + s2 + s3) / 2;
        area = Math.sqrt(s * (s - s1) * (s - s2) * (s - s3));
        return area;
    }
}