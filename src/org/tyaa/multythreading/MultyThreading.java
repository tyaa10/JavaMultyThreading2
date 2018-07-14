/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.tyaa.multythreading;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Yurii
 */
public class MultyThreading {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        try {
            Data data = new Data();
            //Worker w1 = new Worker(Work::work, data);
            //Worker w2 = new Worker(Work::work, data);
            
            Worker w1 = new Worker(new Work()::work, data);
            Worker w2 = new Worker(new Work()::work, data);
            
            Thread t1 = new Thread(w1);
            Thread t2 = new Thread(w2);
            
            t1.setDaemon(true);
            t2.setDaemon(true);
            
            t1.start();
            t2.start();
            
            t1.join();
            t2.join();
            
            System.out.println("x = " + data.x);
        } catch (Exception ex) {
            Logger.getLogger(MultyThreading.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
