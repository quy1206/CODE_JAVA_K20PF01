
public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        Account acc = new Account();
        (new Thread(() -> {
            acc.sub(50000);
        })).start();
        (new Thread(() -> {
            acc.add(100000);
        })).start();
    }
}
