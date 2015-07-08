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
public abstract class System {
    boolean Conformism;
    int Power;
    int Homeostasis;
    
    abstract void Norm ( boolean Conformism, int Homeostasis );
    
    abstract void Regression (int Homeostasis, int Power);
    
}

