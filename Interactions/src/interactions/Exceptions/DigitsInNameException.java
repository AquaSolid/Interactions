/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interactions.Exceptions;

/**
 *
 * @author filip
 */
public class DigitsInNameException extends Exception {

    private String entry;
    public DigitsInNameException(String entry) {
        this.entry = entry;        
    }

    @Override
    public String toString() {
        return "Please enter correctly. Do NOT put numbers into your name.";
    }

    /**
     * Constructs an instance of <code>DigitsInNameException</code> with the
     * specified detail message.
     *
     * @param msg the detail message.
     */
}
