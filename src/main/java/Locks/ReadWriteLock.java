package Locks;

import java.util.concurrent.locks.ReentrantReadWriteLock;

public class ReadWriteLock {
    private static final ReentrantReadWriteLock lock = new ReentrantReadWriteLock();
    private static final ReentrantReadWriteLock.ReadLock readLock = lock.readLock();
    private static final ReentrantReadWriteLock.WriteLock writeLock = lock.writeLock();

    private static void readResources() {
        readLock.lock();
        readLock.unlock();
    }

    private static void writeResources() {
        writeLock.lock();
        writeLock.unlock();
    }

}
