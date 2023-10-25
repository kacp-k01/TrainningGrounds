package Executors;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class TestCallable {
    public static void main(String[] args) throws ExecutionException, InterruptedException {

        ExecutorService service = Executors.newFixedThreadPool(10);

        for (int i = 0; i < 20; i++) {
            List<Future> allFutures = new ArrayList<>();
            Future<Integer> future = service.submit(new Task1());
            allFutures.add(future);
        }

        for (int i = 0; i < 20; i++) {
            Future<Integer> future = service.submit(new Task1());
            Integer result = future.get(); // blocking
            System.out.println("Result of future # " + i + " = " + result);
        }
        System.out.println("Thread name: " + Thread.currentThread().getName());
    }
}

