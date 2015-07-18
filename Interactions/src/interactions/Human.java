/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interactions;

import interactions.Exceptions.DigitsInNameException;
import interactions.Exceptions.NegativeAgeNumberExcetion;
import interactions.Exceptions.SignsInNameException;
import interactions.Exceptions.WrongEntryException;
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
    boolean Conscious;
    int Will;
    
    
    @Override
    void Norm(boolean Conformism, int Standard, int Satisfaction) {
        // Norm activates Regression, then Regression activates Homeostasis,
        // if it works Norm is saved, if it doesn't, then it adapts.
        if(Conformism != true){
            if(Satisfaction > Standard){
//             Homeostasis(int Will, int Power);
            }
        }
    }
    
    public void WillAugmentation (){
        if( Ambition == true){
            Will++;
        }
        if (Satisfaction < 2){
            Will++;
        }
    }
    
    public void AmbitionUnleash(){
        if(Satisfaction > 2){
            Ambition = true;
        }
    }
    
    public void Satisfaction (){
        if(Wealth > 75000){
            Satisfaction++;
        }
        if(Ambition = true){
            Satisfaction++;
        }
    }

    public static boolean getRandomBoolean() {
       return Math.random() < 0.5;
       //I tried another approaches here, still the same result
   }
    
    public void Meditate(){
        Random randomGenerator = new Random();
        int randomInt = randomGenerator.nextInt(10);
        Conscious = getRandomBoolean();
        if (Conscious == true){
            Will++;
        }
        if (randomInt == 1){
            Ambition = true;
            System.out.println("You have found your ambition! ");
        }
    }
    
    public void Homeostasis(int Salary){
        if (Will > Power){
            Regression(Power);
        }
        if(Ambition == true){
            Will++;
            Satisfaction++;
            Salary++;
        }
    }
    
    @Override
    public void Regression (int Power) {
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
    public static void checkGender(int sN) throws WrongEntryException{
        if(sN > 3 || sN < 1){
            throw new WrongEntryException(sN);
        }
    }
    public static void checkNegativeAge(int A) throws NegativeAgeNumberExcetion{
        if(A < 1){
            throw new NegativeAgeNumberExcetion(A);
        }
    }
    public static void checkStringForDigits(String wordD) throws DigitsInNameException{
        int digit = 0;
        for(int i = 0; i<wordD.length(); i++){
            if(Character.isDigit(wordD.charAt(i))){
                digit++;
            }
        }
        if(digit != 0){
            throw new DigitsInNameException(wordD);
        }
    }
    public static void checkStringForSigns(String wordS) throws SignsInNameException{
        boolean NotALetter = false;
        for(int i = 0; i<wordS.length(); i++){
            if(Character.isLetter(wordS.charAt(i))){
                NotALetter = true;
            }else{
                NotALetter = false;
            }
        }
        if(NotALetter == false){
            throw new SignsInNameException(wordS);
        }
    }
    public void gatherGender(){
        Scanner input = new Scanner (System.in);
        
        int s = 0;
        boolean T = true;
        do{     
        System.out.println("Choose your gender: 1. Male  2. Female  3. Other ");
        System.out.print("Gender: ");
        s = input.nextInt();
        try{
            checkGender(s);
            switch (s){
                case 1:  Gender = "Male"; break;
                case 2:  Gender = "Female"; break;
                case 3:  Gender = "Other"; break;
            }
            
            T = false;
        } catch(WrongEntryException e){
            System.out.println(e + "\n");
        }
        }while (T == true);
    }
    public void gatherAge (){
        Scanner input = new Scanner (System.in);
        
        boolean T = false;
        do{
        System.out.print("Age: ");
        Age = input.nextInt();
            try{
            checkNegativeAge(Age);
            T = true;
            }catch (NegativeAgeNumberExcetion e){
                System.out.println(e + "\n");
            }
        
        }while(T == false);
    }
    public void gatherName(){
        Scanner input = new Scanner (System.in);
        boolean T = false;
        do{
            System.out.print("Name: ");
            Name = input.next();
                try{
                    checkStringForDigits(Name);
                    checkStringForSigns(Name);
                    T = true;
                } catch(DigitsInNameException e){
                    System.out.println(e + "\n");
                } catch(SignsInNameException e){
                    System.out.println(e + "\n");
                }    
        }while (T == false);
    }
    public void gatherSurname(){
        Scanner input = new Scanner (System.in);
        boolean T = false;
        do{
            System.out.print("Surname: ");
            Surname = input.next();
                try{
                    checkStringForDigits(Surname);
                    checkStringForSigns(Surname);
                    T = true;
                } catch(DigitsInNameException e){
                    System.out.println(e + "\n");
                } catch(SignsInNameException e){
                    System.out.println(e + "\n");
                }    
        }while (T == false);
    
    }
    public void gatherInfo(){
        
        Scanner input = new Scanner (System.in);
        Random RanGen = new Random();
        
        System.out.println("Please complete the following requirements.");
        
        // Gender Entry with Exceptions
        gatherGender();
        // Age Entry with Exceptions
        gatherAge();
        // Name Entry with Exceptions
        gatherName();
        // Surname Entry with Exceptions
        gatherSurname();
        
        boolean T = true;
        int Randy = 0;
        while(T == true){ 
            Randy = RanGen.nextInt(999999); 
            if(Randy>100000){
                    T = false;
                }
        }
        IDnumber = Randy;
    }
    public void HumanInfo (){
        System.out.print(Gender + " " + Age + " " + Name + " " + Surname + " " + IDnumber + "\n");
    }    
}