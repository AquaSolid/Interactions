/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interactions;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author filip
 */
public class Human extends Organization {
    
    String Gender;
    String Name;
    String Surname;
    int Age;
    int IDnumber;
    double Wealth;
    int Job;

    boolean Ambition;
    int Will;
    
    @Override
    public void Norm ( boolean Conformism, int Homeostasis ) {
        if (Conformism == false){
            //Activate Homeostasis Method
        }
    }
    
    @Override
    public void Regression (int Homeostasis, int Power) {
        //Increase Homeostasis's number, lower Power's, do within a cycle 
        // You will need to add some kind of trial number
        // Every time someone
    //    for(int i=0; i<trial.length; i++){
            //Somekind of Will or Ambition System is need of implementation 
    //       Homeostasis++;
    //    }
    }
    public void Job (String Name, String Surname, double Wealth, boolean Ambition, int Will, double Salary){
        if(Ambition == true && Will<=5 && Will>=0){
            Will++;
        }else{
            Will--;
        }
        Wealth = Wealth + Salary;
    }
    
    public void Riot (int Age, int IDnumber){
        Random randomGenerator = new Random();
        int randomInt = randomGenerator.nextInt(100);
        if(randomInt > 51){
            //Affect Government
        }else{
            //Suffer Punishment
        }
    }
    
    public void gatherInfo(){
        
        Scanner input = new Scanner (System.in);
        Random RanGen = new Random();
        
        System.out.println("Please complete the requirements.");
        int s = 0;
        boolean T = true;
        while (T == true){        
        System.out.println("Gender: ");
        System.out.println("1. Male  2. Female  3. Other ");
        s = input.nextInt();
            if(s > 3 || s < 1){
                System.out.println("Error, try again");
                break;
            }else{
                T = false;
            } 
            switch (s){
                case 1:  Gender = "Male"; break;
                case 2:  Gender = "Female"; break;
                case 3:  Gender = "Other"; break;
            }
        }
        System.out.println("Age: ");
        Age = input.nextInt();
        System.out.println("Name: ");
        Name = input.next();
        System.out.println("Surname: ");
        Surname = input.next();
        T=true;
        int Randy = 0;
        while(T==true){ 
            Randy = RanGen.nextInt(999999); 
            if(Randy>100000){
                    T=false;
                }
        }
        IDnumber = Randy;
    }
    
    public void HumanInfo (){
        System.out.print(Gender + " " + Age + " " + Name + " " + Surname + " " + IDnumber + "\n");
    }
    
}