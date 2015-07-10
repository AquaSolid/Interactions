/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interactions;
import java.util.Scanner;
import java.util.Random;
/**
 *
 * @author filip
 */
public class Interactions {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner (System.in);
        
        java.lang.System.out.println("Welcome to Interactions.");
        System.out.println("Please complete the requirements.");
        System.out.print("Gender: ");
        Human.Gender = input.next();
        
        
    }
}
