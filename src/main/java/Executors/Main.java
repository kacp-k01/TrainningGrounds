package Executors;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import static java.util.concurrent.TimeUnit.SECONDS;

public class Main {
    public static void main(String[] args) {

        ExecutorService service = Executors.newFixedThreadPool(10);

        ExecutorService service1 = Executors.newCachedThreadPool();

        ScheduledExecutorService service2 = Executors.newScheduledThreadPool(10);

        service2.schedule(new Task(),2, SECONDS);

        service2.scheduleAtFixedRate(new Task(),2,2, SECONDS);

        service2.scheduleAtFixedRate(new Task(),15,10, SECONDS);

        for (int i = 0; i < 10; i++) {
            service2.execute(new Task());
        }
        System.out.println("Thread name: "+Thread.currentThread().getName());
    }
}

