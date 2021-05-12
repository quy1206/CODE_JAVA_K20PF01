//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

public class Account {
    private int numberAccount = 0;

    public Account() {
    }

    public synchronized void add(int num) {
        if (this.numberAccount == 0) {
        }

        this.numberAccount += num;
        System.out.println("Đã nộp vào " + num);
        this.notify();
    }

    public synchronized void sub(int num) {
        if (this.numberAccount < 50000) {
            System.out.println("Số dư phải lớn hơn 50000!");

            try {
                this.wait();
            } catch (InterruptedException var3) {
                var3.printStackTrace();
            }
        }

        this.numberAccount -= num;
        System.out.println("Đã rút " + num);
    }
}
