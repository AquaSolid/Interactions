/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interactions;

import java.util.Random;

/**
 *
 * @author filip
 */
public class Human extends System {
    
    String Sex;
    String Name;
    String Surname;
    int Age;
    int IDnumber;
    double Money;

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
    public void Job (String Name, String Surname, double Money, boolean Ambition, int Will, double Salary){
        if(Ambition == true && Will<=5 && Will>=0){
            Will++;
        }else{
            Will--;
        }
        Money = Money + Salary;
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
}