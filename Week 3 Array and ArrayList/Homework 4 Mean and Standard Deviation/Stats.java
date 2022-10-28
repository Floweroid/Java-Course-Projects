import java.util.ArrayList;

/**
 *  StatDriver
 * 
 *  @author Zekai Lin
 * 
 *  @version 09/24/22
 */


public class Stats {
    
    /**
     * Calculate the mean value saved in arraylist
     * 
     * @param data
     * @return
     */

    public static double mean (ArrayList<Double> data) {
        
        // declare the variable
        double num = 0;
        
        // Get the sum of the data.
        for (double ele : data) {
            num += ele;
        }

        // return the mean value.
        return num/data.size();
    }

    /**
     * Calculate the standard deviation value saved in arraylist
     * 
     * @param data
     * @return
     */
    public static double stdDev (ArrayList<Double> data) {
        
        // declare variables.
        double num;
        double meanVal;

        // Call calMean to get mean value
        num = 0;
        meanVal = mean(data);
        
        // Add the standard diviation
        for (double ele : data) {
            double val = ele-meanVal;
            System.out.println("ele-meanVal:" + val);
            num += Math.pow(val, 2);
        }

        // return the sqare root.
        return Math.sqrt(num/data.size());
    }

}
