
public class WorkingThread extends Thread {
    //Alt + Insert

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
}
