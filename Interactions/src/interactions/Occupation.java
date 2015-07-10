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
public class Occupation{
    String Position;
    double Salary;
    int Melancholy;
    
    public void gotoWork(String Name, String Surname){
        System.out.println(Name + Surname + "is going to work");
    }
    
     public void backfromWork(String Name, String Surname){
        System.out.println(Name + Surname + "is going home");
        System.out.println(Name + Surname + "has earned " + Salary);
    }
     
}
