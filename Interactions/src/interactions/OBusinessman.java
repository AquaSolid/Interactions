/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interactions;

/**
 *
 * @author User
 */
public class OBusinessman extends Occupation {

    public OBusinessman() {
    }

    public OBusinessman(String Position, double Salary, boolean Melancholy, int Enjoyment) {
        super.Position = "Businessman";
        super.Salary = 450;
        super.Melancholy = false;
        super.Enjoyment = 1;
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
