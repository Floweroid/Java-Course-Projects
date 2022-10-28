/**
 * Patron
 * 
 * @author Zekai Lin
 * 
 * @version 24/09/2022
 */

public class Patron {

    // declare attributes
    private String name;
    private String email;
    private int idNumber;
    private double balance;

    /**
     * Patron constructor
     * 
     * @param name
     * @param email
     * @param idNumber
     * @param balance
     */
    public Patron (String name, String email, int idNumber, double balance) {
        this.name = name;
        this.email = email;
        this.idNumber = idNumber;
        this.balance = balance;
    }

    /**
     * Adjust the patrons account balance
     * 
     * @param amount
     */

    public void adjustBalance(double amount) {
        this.balance+=amount;
    }

    /**
     * Compare if the two patron with the same id.
     * 
     * @param other
     */
    public boolean equals(Object other) {
        if (other instanceof Patron) {
            Patron p = (Patron) other; // casting the other Object to Pastrons
            //now check if two Patron object's idNumber are equal
            return this.idNumber == p.idNumber;
        }   else if (other instanceof String){
            // looks like the passed parameter is not Patron, rather a string
            // so now check if this String idNumber is equal to the other Patrons idNumber
            return String.valueOf(this.idNumber).equals(other);
        }   else if (other instanceof Integer)   {
            return this.idNumber == (Integer) other;
        }   else    {
            return false;
        } 
    }

    /**
     * Print out the information of the Patron in format.
     * 
     */
    public String toString() {
        return String.format(
            "Name: %s, Email: %s, ID: %s, Balance: $%.2f.",
            this.name, 
            this.email, 
            this.idNumber, 
            this.balance
            );
    }
}
