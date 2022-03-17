/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testjava8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

/**
 *
 * @author Elife-Sil-049
 */
public class TestJava8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        List<Personne> list = new ArrayList<>();

        list.add(new Personne(4, "test", "Lilia"));
        list.add(new Personne(2, "abdelhmid", "Rihab"));
        list.add(new Personne(1, "Sana", "Ahmed"));
        list.add(new Personne(3, "Salma", "Jacer"));
        
//        for(Personne p:list)
//            System.out.println(p);

//        Collections.sort(list, new Comparator<Personne>() {
//            @Override
//            public int compare(Personne o1, Personne o2) {
//                return o1.getId()-o2.getId();
//            }
//        });
        
        Collections.sort(list, (a,b)->a.getId()-b.getId());
//Pour trier une list avec la méthode sort
        list.sort((a,b)->a.getId()-b.getId());
//        list.forEach(new Consumer<Personne>() {
//            @Override
//            public void accept(Personne t) {
//                        System.out.println(t);
//            }
//        });
        
        
        list.removeIf(new Predicate<Personne>() {
            @Override
            public boolean test(Personne t) {
                
                return t.getId()==3;
                    
            }
        });
                
        list.removeIf(p->p.getId()==3);
        list.forEach(p->System.out.println(p));

    }

}
