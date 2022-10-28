import java.util.Scanner;

/**
 * @author Zekai Lin
 * 
 * @version Sep.07 2022class
 */

 public class nameconverter {
    public static void main(String[] args) {
        
        // declare the scanner
        Scanner scnr = new Scanner(System.in);

        // Get User input.
        String userInput = scnr.nextLine();

        // print the final name.
        System.out.println(getFinalName (userInput));
        scnr.close();
    }

    // Process output from input.
    public static String getFinalName (String str) {

        // declare the valuables
        String firstName = "";
        String middleName = "";
        String lastName = "";

        // Proccess the outPut
        firstName = getCapitl(str);

        // Get the midname by remove firstname and lastname
        middleName = str.substring(str.indexOf(" ")+1, str.lastIndexOf(" ")+1);

        // process into right format, if there is midname
        if (!middleName.equals("")) {
            middleName = getCapitl(middleName); 
        };

        // get the last name
        lastName = str.substring(str.lastIndexOf(" ")+1);

        // return the final name
        return lastName + ", " + firstName + middleName;
    }

    // convert firstname or midname to right format.
    public static String getCapitl (String str) {
        return str.toUpperCase().charAt(0) + ".";
    }
}