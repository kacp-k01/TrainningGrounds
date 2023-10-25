package Executors;

import java.util.Random;
import java.util.concurrent.Callable;

class Task1 implements Callable<Integer> {

    @Override
    public Integer call() throws Exception {
        Thread.sleep(3000);
        return new Random().nextInt();
    }
}
