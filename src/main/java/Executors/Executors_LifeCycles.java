package Executors;

import java.util.concurrent.*;

import static java.util.concurrent.TimeUnit.SECONDS;

public class Executors_LifeCycles {

    public static void main(String[] args) {

        ExecutorService service = new ThreadPoolExecutor(10, 100,
                30, SECONDS, new ArrayBlockingQueue<>(200));
        try {
            for (int i = 0; i < 10; i++) {
                service.execute(new Task());
            }
            service.shutdown();
            System.out.println(service.isTerminated() + "  " + service.isShutdown());
            service.awaitTermination(10, SECONDS);

        } catch (RejectedExecutionException e) {
            System.err.println("task rejected " + e.getMessage());
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}


