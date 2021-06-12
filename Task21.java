package work21;

import java.util.Scanner;

public class Task21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of months: ");
//        int p_month = scanner.nextInt();
        float p_month = scanner.nextFloat();
        System.out.println("Number of months: " +  p_month +
                ", Number of seconds: " + (int) (p_month * 7 * 24 * 60 * 60));
    }
}
