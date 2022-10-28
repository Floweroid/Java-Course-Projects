import java.util.ArrayList;
import java.util.Scanner;

/**
 *  StatDriver
 * 
 *  @author Zekai Lin
 * 
 *  @version 09/24/22
 */

public class StatDriver {
    public static void main(String[] args) {
        
        // declare the variable data
        ArrayList<Double> data = new ArrayList<Double>();
        
        // declare the scaner
        Scanner input = new Scanner(System.in);
        
        // get the element.
        while (input.hasNextDouble()) {
            data.add(input.nextDouble());
        }

        // close the scaner
        input.close();

        // calculate the values according to the
        if (args.length !=0 ) {
            if (args[0].equals("std")) {
                System.out.printf("StdDev: %.2f\n",Stats.stdDev(data));
            }
        }   else  {
            System.out.printf("Mean: %.2f\n",Stats.mean(data));
        } 
        System.out.printf("StdDev: %.2f\n",Stats.stdDev(data));
    }
}
