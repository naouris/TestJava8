/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testjava8;

/**
 *
 * @author Elife-Sil-049
 */
public class ClassA implements InterfaceA, InterfaceB{

    @Override
    public void test() {
        System.out.println("Classe A");
        
    }

    @Override
    public int test3() {
        return InterfaceA.super.test3(); //To change body of generated methods, choose Tools | Templates.
    }

    
    
    
    
    
}
