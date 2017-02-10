package ru.bernarsoft.innopolis.consumers;


import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

public class Consumer  {

    private AtomicInteger sum = new AtomicInteger(0);
    private AtomicBoolean lockCuba = new AtomicBoolean(false);
    private AtomicBoolean lockKvadra = new AtomicBoolean(false);
    private AtomicBoolean lockProsta = new AtomicBoolean(false);

    public void printMessege(int cube, int kvadrat, int chislo) {
        if (cube != 0) {
            lockAndAdd(lockCuba, cube);
        } else if (kvadrat != 0) {
            lockAndAdd(lockKvadra, kvadrat);
        } else if (chislo != 0) {
            lockAndAdd(lockProsta, chislo);
        }
    }

    public int getSum() {
        return sum.get();
    }

    private void lockAndAdd(AtomicBoolean lock, int value) {
        while (lock.compareAndSet(false, true)) {
            Thread.yield();
        }

        try {
            int currentValue = sum.addAndGet(value);
            System.out.println("Current value: " + currentValue);
        } finally {
            lock.set(false);
        }
    }
}
