
import java.util.Date;



/**
 * Book
 * 
 * @author Zekai Lin
 * 
 * @version 24/09/2022
 */

 public class Book {

    // define availability numbers.
    public static int AVAILABLE = 1;
    public static int UNAVAILABLE =2;

    // declare attributes
    private String title;
    private String author;
    private String isbn;
    private int pages;
    private int year;
    private int status;
    private Date due;
    private Patron patron;
    
    /**
     * Book constructor.
     * 
     * @param title
     * @param author
     * @param isbn
     * @param year
     * @param pages
     */

    public Book( String title, String author, String isbn, int year, int pages) {
        
        // initialize the book with given args.
        this.title = title;
        this.author =author;
        this.isbn = isbn;
        this.year = year;
        this.pages=pages; 

        // initialize the book status
        this.status = 1;
        this.patron = null;
        this.due = null;
    }

    /**
     * Book checkin.
     */

    public void checkin () {
        this.status = 1;
        this.patron = null;
        this.due = null;
    }

    /**
     * Book checkout
     * 
     * @param patron
     * @param due
     */

    public void checkout(Patron patron, Date due) {
        this.status = 2;
        this.patron = patron;
        this.due = due;
    }

    
    /**
     * Check if two book have the same isbn
     * 
     * @param other
     * @return
     */

    public boolean equals(Object other) {
        if (other instanceof Book) {
            Book b = (Book) other; // casting the other Object to Book
            //now check if two Book object's isbn are equal
            return this.isbn == b.isbn;
        }   else if (other instanceof String){
            // looks like the passed parameter is not Book, rather a string
            // so now check if this String isbn is equal to the other Books isbn
            return this.isbn == other;
        }   else {
            return false;
        }  
    }
    
    
    /**
     * accessor methods
     * 
     * @return
     */
    
    public String getTitle() {
        return this.title;
    }
    public String getAuthor() {
        return this.author;
    }
    public String getIsbn() {
        return this.isbn;
    }
    public int getPages() {
        return this.pages;
    }
    public int getYear() {
        return this.year;
    }
    public int getStatus() {
        return this.status;
    }
    public Date getDue() {
        return this.due;
    }
    public Patron getPatron() {
        return this.patron;
    }


    /**
     * 
     * @return formated string about the book object.
     */

    public String toString() {
        return String.format("Title: %s, Author: %s, ISBN: %s, Year: %s, Pages: %s.", this.title, this.author, this.isbn, this.year, this.pages);
    }
}