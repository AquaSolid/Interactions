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
public class NegativeDoubleException extends Exception {

    private double entry;
    public NegativeDoubleException(double entry) {
        this.entry = entry;        
    }

    @Override
    public String toString() {
        return "Please enter correctly";
    }
    
    

    /**
     * Constructs an instance of <code>NegativeAgeNumberExcetion</code> with the
     * specified detail message.
     *
     * @param msg the detail message.
     */
    public NegativeDoubleException(String msg) {
        super(msg);
    }
}
