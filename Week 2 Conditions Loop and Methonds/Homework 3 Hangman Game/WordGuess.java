import java.io.Console;

/**
 * WordGuess
 * 
 * @version 19/09/2022
 * 
 * @author Zekai Lin
 * 
 * 
 */

public class WordGuess {

    /** The current word to guess. It will be preserved throughout play.
     * 
     * @param theWord the word from the dictionary
     * @return the userWord filled in with the no guess sybol.
     */
    public static String makeUserWord (String theWord) {
        String userWord = "";
        for (int cnt = 0; cnt < theWord.length(); cnt++) {
            userWord+="*";
        }
        // test code
        // System.out.println("Testing:makeUserWord (String theWord):"+userWord+"\t");
        return userWord;
    }
    /** is Inword takes a guess and a word and return true if 
     *  the letter is in the word, and false if it is not.
     * 
     * @param guess
     * @param word
     * @return found
     */
    public static boolean isInWord (char guess, String word)
    {
        boolean found = false;

        for (int i = 0; i < word.length(); i++) {
            if (guess == word.charAt(i)) {
                found = true;
                break;
            }
        }
        // System.out.println("Testing:isInWord (char guess, String word):"+found+"\t");
        return found;
    }
    
    /**
     * Returns a userWord with all occurrences of '*' corresponding to the current guess replaced with that guess. For example,
     * if the word was "fetch" and the user word was "****h" and the user guessed 'e', the return string would be "*e**h".
     *
     * @param guess
     * @param userWord
     * @param theWord
     * @return newUserWord
     */

    public static String updateUserWord(char guess, String userWord, String theWord) {
        String newUserWord = "";
        for (int cnt = 0; cnt < theWord.length(); cnt++) {
            if( guess == theWord.charAt(cnt)) {
                newUserWord += guess;
            } else {
                newUserWord += userWord.charAt(cnt);
            }
        }
        // System.out.println("Testing:updateUserWord(char guess, String userWord, String theWord):"+newUserWord+"\t");
        return newUserWord;
    }

    /**Updates the list of guesses with the current guess. 
     * 
     * @param guesses
     * @param guess
     * @return
     */
    public static String updateGuesses(String guesses, char guess) {
        boolean exist = false;
        for ( int cnt = 0 ; cnt < guesses.length(); cnt ++) {
            if (guess == guesses.charAt(cnt)) {
                exist = true;
                break;
            }
        }
        if (exist == false) {
            guesses+=guess;
        }
        return guesses;

    }

    /**Returns a String that is the userWord with spaces between each letter and each '*' replaced with an '_'. 
     * 
     * @param userWord
     * @return newUserWord
     */

    public static String displayUserWord(String userWord) {
        String newUserWord = "";
        for ( int cnt = 0 ; cnt < userWord.length(); cnt ++) {
            newUserWord += ' ';
            if (userWord.charAt(cnt) == '*' ) {
                newUserWord += "_";
            } else {
                newUserWord += userWord.charAt(cnt);
            }
        }
        // System.out.println("Testing:displayUserWord(String userWord)"+newUserWord+"\t");
        return newUserWord.substring(1);
    }

    /**Returns a String in the form "Strikes: %d\tGuesses: %s", with the list of guesses separated by spaces. 
     * 
     * @param strikes
     * @param guesses
     * @return strikesScirpt
     */

    public static String displayGuesses(int strikes, String guesses) {
        String strikesScirpt = "Strikes: " + guesses.length() + "\tGuesses: ";
        for ( int cnt = 0 ; cnt < guesses.length(); cnt ++) {
            
            strikesScirpt += guesses.charAt(cnt);
            strikesScirpt += ' ';
        }
        if (strikes == 0) {
            strikesScirpt += ' ';
        } 
        return strikesScirpt.substring(0, strikesScirpt.length()-1);
    }

}
