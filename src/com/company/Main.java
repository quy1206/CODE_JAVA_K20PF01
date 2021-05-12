import java.util.ArrayList;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        WorkingThread obj =
                new WorkingThread();
        obj.start();

        // declare
        Working objRuna = new Working();
        //
        Thread obj1 = new Thread(objRuna);
        obj1.start();

        //new Thread
        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10 ; i++) {
                    System.out.println(i + " ");
                    try {
                        Thread.sleep(1000);//Alt + Enter
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }).start();

        //new Thread
        new Thread(()->{
            for (int i = 0; i < 10 ; i++) {
                System.out.println(i + " ");
                try {
                    Thread.sleep(1000);//Alt + Enter
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();


    }
}
