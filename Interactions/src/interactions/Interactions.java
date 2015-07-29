/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interactions;
import java.text.SimpleDateFormat;
import java.util.Calendar;
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
        
        Calendar cal = Calendar.getInstance();
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
        System.out.println( sdf.format(cal.getTime()) );
        
        InteractionsUI gui = new InteractionsUI();
        // Launch the UI..somehow. Figure it out.
        gui.setVisible(true);
        
        Scanner input = new Scanner (System.in);
        Random RanGen = new Random();
        Human h = new Human();
        Occupation o = new Occupation();
        
        java.lang.System.out.println("Welcome to Interactions.");
        h.gatherInfo();
        System.out.println("You entered the following information: "); 
        h.HumanInfo();
        
        String yn = null;
        System.out.println("Did you make any mistakes? Y - will restart the program; N - will allow you to continue; ");
        yn = input.next();
        if(yn.equals("Y") && yn.equals("y")){
             h.gatherInfo();
        }
        System.out.print("Please choose one of these occupations, to get more info .. \n");
        o.ListJobs();
    }
}
