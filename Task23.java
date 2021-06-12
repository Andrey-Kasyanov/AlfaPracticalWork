package work23;

import java.util.Scanner;

/**
 *   x=a
 *   y=b
 *
 *   x = x + y  => x = a + b
 *   y = x - y  => y = a + b - b    => y = a
 *   x = x - y  => x = a + b - a    => x = b
 *
 *   => x = b
 *      y = a
 */


public class Task23 {
    public static void main(String[] args) {
        Scanner in_value = new Scanner(System.in);
        System.out.print("Enter Value1: ");
        int p_value1 = in_value.nextInt();
        System.out.print("Enter Value2: ");
        int p_value2 = in_value.nextInt();
        System.out.println("\nYou entered: Value1 = "+ p_value1 + " and Value2 =" + p_value2 );
        p_value1 = p_value1 + p_value2;
        p_value2 = p_value1 - p_value2;
        p_value1 = p_value1 - p_value2;
        System.out.println("After transformation: Value1 =  " + p_value1 + " and Value2 =" + p_value2 ) ;
    }
}
