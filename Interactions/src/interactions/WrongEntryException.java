/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interactions;

/**
 *
 * @author filip
 */
public class WrongEntryException extends Exception {

    private int entry;
    public WrongEntryException(int entry) {
        this.entry = entry;        
    }

    @Override
    public String toString() {
        return "Please, enter a number which is appropriate to one of the avaliable options. You entered " + entry;
    }
    
    /**
     * Constructs an instance of <code>WrongEntryException</code> with the
     * specified detail message.
     *
     * @param msg the detail message.
     */
    
    
    public WrongEntryException(String msg) {
        super(msg);
    }
}
