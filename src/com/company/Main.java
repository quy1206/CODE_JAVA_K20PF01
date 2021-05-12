

import com.company.WaitingThreading;

import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        WaitingThreading obj =
                new WaitingThreading();

        new Thread(() -> {
            obj.get();
        }).start();

        new Thread(() -> {
            obj.add();
        }).start();
    }
}
