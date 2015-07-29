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
public class Government extends Organization {

    boolean GovernmentKindness;
    boolean TaxPayment;
    
    public void TaxRegulation (){
        if(TaxPayment == false){
            GovernmentKindness = false;
        }
    }
    
    public void Oppression (int Will, int Salary){
        if (GovernmentKindness == false){
            Will--;
            Salary = Salary - 50;
        }
    }
    
    @Override
    void Norm(boolean Conformism, int Standard, int Satisfaction) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    void Regression(int Power) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
