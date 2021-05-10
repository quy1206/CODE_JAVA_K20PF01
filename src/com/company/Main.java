package com.company;

public class Main {

    public static void main(String[] args) {

        new Thread (()->{
        //Thread 1
        for (int i = 0; i < 10; i++) {
            System.out.println("a");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        }).start();

        new Thread(()->{
            //Thread 2
            for (int i = 0; i < 10; i++) {
                System.out.println("b");
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();
        }

    }

