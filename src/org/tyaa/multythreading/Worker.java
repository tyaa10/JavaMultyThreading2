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
public class Worker implements Runnable{

    private IWork mWork;
    private Data mData;
    
    public Worker(IWork _work, Data _data){
    
        mWork = _work;
        mData = _data;
    }
    
    @Override
    public void run() {
        mWork.work(mData);
    }
}
