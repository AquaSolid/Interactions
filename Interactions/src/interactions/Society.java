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
    void Norm(boolean Conformism, int Homeostasis) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    void Regression(int Homeostasis, int Power) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
