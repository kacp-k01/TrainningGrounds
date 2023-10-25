package Locks;

import java.util.concurrent.locks.ReentrantLock;

public class Main {
    public static void main(String[] args) {

        Thread t1 = new Thread(Main::accessResource);
        t1.start();
        Thread t2 = new Thread(Main::accessResource);
        t2.start();
        Thread t3 = new Thread(Main::accessResource);
        t3.start();
        Thread t4 = new Thread(Main::accessResource);
        t4.start();
    }

    private static final ReentrantLock lock = new ReentrantLock();

    private static void accessResource() {
        lock.lock();
        lock.lock();

        int number = lock.getHoldCount();

        System.out.println(number);
        System.out.println(Thread.currentThread().getName());
        lock.unlock();
        lock.unlock();
    }


}


