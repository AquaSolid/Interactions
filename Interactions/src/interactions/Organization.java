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
public abstract class Organization {
    boolean Conformism;
    int Power;
    int Standard;
    int Satisfaction;
    
    abstract void Norm ( boolean Conformism, int Standard, int Satisfaction);
    abstract void Regression (int Power);
    
}

