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
public class Society extends Organization {

    int Development;
    int Factories;
    int Employment;
    int Productivity;
    double Economy;
    
    boolean HumanCooperation;
    
    @Override
    void Norm(boolean Conformism, int Standard, int Satisfaction) {
        // Norm activates Regression, then Regression activates Homeostasis,
        // if it works Norm is saved, if it doesn't, then it adapts.
        if(Conformism != true){
            if(Satisfaction > Standard){
              //  Homeostasis(int Will, int Power);
            }
        }
    }

    @Override
    void Regression(int Power) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public void Homeostasis(int Will, boolean Ambition, int Salary){
        if (Will > Power){
         //   Regression();
        }
        if(Ambition == true){
            Will++;
            Satisfaction++;
            Salary++;
        }
    }
    
}
