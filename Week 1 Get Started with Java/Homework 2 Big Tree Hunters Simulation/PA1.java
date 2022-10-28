import java.util.Scanner;

/**
* Hello and welcome program.
*
* @author Zekai Lin
* @version 03/09/2022
*/

public class PA1 {
    public static void main(String[] args) {

        // declare new scanner.
        Scanner scnr = new Scanner(System.in);

        // declare variables
        String commName; 
        String scitfName;
        int circumference;
        int height;
        int largestCrownSpread;
        int smallestCrownSpread;
        int averageCrownSpread;
        int totalPoints;

        // Ask for input
        System.out.print("Enter the common name:");
        commName = scnr.nextLine();

        System.out.print("Enter the scientific name:");
        scitfName = scnr.nextLine();

        System.out.print("Enter the circumference in inches:");
        circumference = scnr.nextInt();

        System.out.print("Enter the height in feet: ");
        height = scnr.nextInt();

        System.out.print("Enter the largest crown spread in feet: ");
        largestCrownSpread = scnr.nextInt();

        System.out.print("Enter the smallest crown spread in feet: ");
        smallestCrownSpread = scnr.nextInt();

        // Proccess data
        averageCrownSpread = (largestCrownSpread + smallestCrownSpread)/2;
        totalPoints = circumference + height + averageCrownSpread/4;

        // print the Output
        System.out.println("Big Tree Report:\n");
        System.out.println("    Common Name: " + commName);
        System.out.println("Scientific Name: " + scitfName + "\n");
        System.out.println("  Circumference: " + circumference);
        System.out.println("\t Height: " + height);
        System.out.println("  Average Crown: " + averageCrownSpread+ "\n");
        System.out.println("   Total Points: " + totalPoints);

        // close the scanner
        scnr.close();

    }
}
