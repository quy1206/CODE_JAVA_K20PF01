import com.company.MyRunnable;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletionService;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Main {
    public static <ExecutorService> void main(String[] args, CompletionService executorService, Executors Executors) throws InterruptedException {
         executorService = Executors.newFixedThreadPool(5);
        List<Future> listFuture = new ArrayList<>();

        List<Future<String>> listFuture = new ArrayList<Future<String>>();
        for (int i = 1; i <= 10; i++) {
            MyRunnable myRunnable = new MyRunnable("Runnable " + i);
            Future future = executorService.submit(myRunnable);
            MyCallable myCallable = new MyCallable("Callable " + i);
            Future<String> future = executorService.submit(myCallable);
            listFuture.add(future);
        }

        for (Future future : listFuture) {
            try {
                System.out.println(future.get());
                System.out.println(future.get() + " kết thúc");
            } catch (ExecutionException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }
}