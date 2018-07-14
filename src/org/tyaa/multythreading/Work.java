/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.tyaa.multythreading;

/**
 *
 * @author Yurii
 */
public class Work {
    
    //1
    public synchronized static void work2(Data _data){
    
        for (int i = 0; i < 5000000; i++) {
            _data.x = Add(_data.x);
        }
    }
    
    //2
    public void work(Data _data){
    
        for (int i = 0; i < 5000000; i++) {
            synchronized(_data){
                _data.x = Add(_data.x);
            }
        }
    }
    
    private static int Add(int _x){
    
        _x++;
        return _x;
    }
}
