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
@FunctionalInterface
public interface InterfaceA {
    void test();
    //void test1();
    static void test2(){
        System.out.println("static Interface A");
    }
    
    default int test3(){
        return 2;
    }
    
    
}
