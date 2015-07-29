/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interactions;

import interactions.Exceptions.DigitsInNameException;
import interactions.Exceptions.NegativeAgeNumberExcetion;
import interactions.Exceptions.NegativeDoubleException;
import interactions.Exceptions.SignsInNameException;
import static interactions.Human.checkNegativeAge;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class OOther extends Occupation {

    public OOther() {
    }

    public OOther(String Position, double Salary, boolean Melancholy, int Enjoyment) {
        super.Position = "Other";
        super.Salary = 0;
        super.Melancholy = false;
        super.Enjoyment = 1;
    }
    public void OtherJobgatherInfo(){
        Scanner input = new Scanner(System.in);
        
        System.out.println("You have chosen the 'Other'option, please fill in the requirements.");
        System.out.print("Name of the possition of work:");
        String Position = input.next();
        System.out.print("Salary:");
        double Salary = input.nextDouble();
        System.out.print("Is your environment interesting, answer with Y or N:");
        String yn = input.next();
        System.out.print("On a scale from 0-3 how much enjoyment do you get form your work/job?");
        int Enjoyment = input.nextInt();
    }
    
    public void gatherOtherPosition(){       
        Scanner input = new Scanner (System.in);
        boolean T = false;
        do{
            System.out.print("Name of the possition of work:");
            Position = input.next();
                try{
                    checkStringForDigits(Position);
                    checkStringForSigns(Position);
                    T = true;
                } catch(DigitsInNameException | SignsInNameException e){
                    System.out.println(e + "\n");
                }    
        }while (T == false);  
    }
    public void gatherOtherSalary(){
        Scanner input = new Scanner (System.in);
        
        boolean T = false;
        do{
        System.out.print("Salary: ");
        Salary = input.nextDouble();
            try{
            checkNegativeDouble(Salary);
            T = true;
            }catch (NegativeDoubleException e){
                System.out.println(e + "\n");
            }
        
        }while(T == false);
    }
     public static void checkNegativeDouble(double A) throws NegativeDoubleException{
        if(A < 1){
            throw new NegativeDoubleException(A);
        }
    }
    @Override
    public void backfromWork(String Name, String Surname) {
        super.backfromWork(Name, Surname); //To change body of generated methods, choose Tools | Templates.
        System.out.println(Name + " " + Surname + "has earned " + Salary + " today.");
        //Days should be added, later connected to the internet, weekly pay, not daily.
    }

    @Override
    public void gotoWork(String Name, String Surname) {
        super.gotoWork(Name, Surname); //To change body of generated methods, choose Tools | Templates.
    }
    
}
