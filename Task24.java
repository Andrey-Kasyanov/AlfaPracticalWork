 package work24;

import java.util.Scanner;
/**
 *  x = abc
 *  =>
 *      x0 = x % 10
 *      x1 = int (x : 10)  % 10
 *      x2 = x : 100
 *  y = x2 + x1 * 10 + x0 * 100
 * =>
 *  x - y
 *
 */

public class Task24 {
    public static void main(String[] args) {
        Scanner in_value = new Scanner(System.in);
        System.out.print("Enter your number (XXX):");
        int i_value = in_value.nextInt();
        int p_value0 = i_value % 10;
        int p_value1 = i_value / 10 % 10;
        int p_value2 = i_value / 100;
        int p_reverse_value = p_value2 + p_value1 * 10 + p_value0 * 100;
        System.out.println("\nYour entered : " + i_value
                + "\nReverse value = " + p_reverse_value
                + "\nDifference between numbers = " + (i_value - p_reverse_value));
/*      System.out.println("\nYour entered :" + i_value
                + "\nHundreds of number: " + p_value / 100
                + "\nTens from number  : " + p_value / 10 % 10
                + "\nUnits from number : " + p_value % 10);
*/
    }
}

