package work31;

import java.util.Scanner;

public class Task31 {
    public static void main(String[] args) {
        System.out.print("Enter weight in pounds: ");
        Scanner in_value= new Scanner(System.in);
        final float CONVERT_P_TO_M = 453.6F;
        float i_weight_pounds;
        if (in_value.hasNextFloat() && (i_weight_pounds = in_value.nextFloat())>=0  ) {
            int p_weight_metric_kg = (int) (i_weight_pounds * CONVERT_P_TO_M / 1000);
            int p_weight_metric_g = (int) ((i_weight_pounds * CONVERT_P_TO_M) % 1000);
            System.out.println("\nYour entered weight in pounds = " + i_weight_pounds +
                    "\nThis is " + p_weight_metric_kg + " kg" + " and " +p_weight_metric_g + " g");
        }
        else {
            System.out.println("Your entered incorrect weight, pls restart");
        }
    }
}
