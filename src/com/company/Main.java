package com.company;

import java.util.ArrayList;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        ArrayList<Integer> arrList = new ArrayList<>();
        new Thread(()->{
        for (int i = 0; i<10; i++){
            arrList.add(new Random().nextInt(10));
        }
        }).start();
        new Thread (()->{
            for (int i = 0; i< arrList.size(); i++) {
                System.out.println(arrList.get(i) + " ");
            }
        }).start();
        new Thread (()->{
            for (int i = 0; i< 10; i++) {
                System.out.println(arrList.get(i) + " ");
            }try {
                System.out.println("t1");
                Thread.sleep(500);
            }catch (InterruptedException e ){
                e.printStackTrace();
            }
        }).start();

        //join
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i<10;i++){
                    System.out.println(arrList.get(i) + " ");
                }try {
                    System.out.println("t1");
                    Thread.sleep(1000);

                }catch (InterruptedException e ){
                    e.printStackTrace();
                }
            }
        });

        t1.start();

        try {
            t1.join();
        }catch (InterruptedException e ){
            e.printStackTrace();
        }
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i<10;i++){
                    System.out.println(arrList.get(i) + " ");
                }try {
                    System.out.println("t2");
                    Thread.sleep(1000);

                }catch (InterruptedException e ){
                    e.printStackTrace();
                }
            }
        });
        t2.start();
        Thread t3 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i<10;i++){
                    System.out.println(arrList.get(i) + " ");
                }try {
                    System.out.println("t3");
                    Thread.sleep(1000);

                }catch (InterruptedException e ){
                    e.printStackTrace();
                }
            }
        });
        t3.start();
    }
}

