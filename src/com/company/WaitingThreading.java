package com.company;

import java.util.ArrayList;
import java.util.Random;

public class WaitingThreading {
    ArrayList<Integer>
            arrayList = new ArrayList();

    public synchronized void add(){
        for (int i = 0; i < 10 ; i++) {
            arrayList.add(new Random().nextInt(10));
        }
        notify();
    }
    public synchronized void get(){
        if(arrayList.size()<10){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        for (int i = 0; i < 10 ; i++) {
            System.out.println(arrayList.get(i) + " ");
        }
    }
}
