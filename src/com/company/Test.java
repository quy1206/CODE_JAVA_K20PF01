package com.company;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Test {
    public static void main(String[] args) {
        ExecutorService executorService =
                Executors.newFixedThreadPool(5);
        for ( int i = 1; i <= 10; i ++) {
            MyRunnable myRunnable =
                    new MyRunnable
        }
    }
}
