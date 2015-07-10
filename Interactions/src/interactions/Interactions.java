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
        Random RanGen = new Random();
        Human h = new Human();
                
        java.lang.System.out.println("Welcome to Interactions.");
        System.out.println("Please complete the requirements.");
        System.out.println("Gender: ");
        System.out.println("1. Male  2. Female  3. Other ");
        int s = input.nextInt();
        boolean T = true;
        while (T == true){
            if(s > 3 && s < 1){
                System.out.println("Error, try again");
            }else{
                T = false;
            }
        }
        T=true;
        switch (s){
            case 1:  h.Gender = "Male"; break;
            case 2:  h.Gender = "Female"; break;
            case 3:  h.Gender = "Other"; break;
        }
        System.out.println("Age: ");
        h.Age = input.nextInt();
        System.out.println("Name: ");
        h.Name = input.next();
        System.out.println("Surname: ");
        h.Surname = input.next();
        int Randy = 0;
        while(T==true){ 
            Randy = RanGen.nextInt(999999); 
            if(Randy>100000){
                    T=false;
                }
        }
        h.IDnumber = Randy;
    }
}
