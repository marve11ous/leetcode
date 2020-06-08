package solution.concurrency.n1195;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import java.util.function.IntConsumer;

class FizzBuzz {
    private final ReentrantLock lock = new ReentrantLock();
    private final Condition fizz = lock.newCondition();
    private final Condition buzz = lock.newCondition();
    private final Condition fizzbuzz = lock.newCondition();
    private int n;

    public FizzBuzz(int n) {
        this.n = n;
    }

    // printFizz.run() outputs "fizz".
    public void fizz(Runnable printFizz) throws InterruptedException {
        for (int i = 1; i <= n; i++) {
            try {
                lock.lock();
                if (i % 3 == 0 && i % 5 != 0) {
                    fizz.await();
                    printFizz.run();
                }
            } finally {
                lock.unlock();
            }
        }
    }

    // printBuzz.run() outputs "buzz".
    public void buzz(Runnable printBuzz) throws InterruptedException {
        for (int i = 1; i <= n; i++) {
            try {
                lock.lock();
                if (i % 3 != 0 && i % 5 == 0) {
                    buzz.await();
                    printBuzz.run();
                }
            } finally {
                lock.unlock();
            }
        }
    }

    // printFizzBuzz.run() outputs "fizzbuzz".
    public void fizzbuzz(Runnable printFizzBuzz) throws InterruptedException {
        for (int i = 1; i <= n; i++) {
            try {
                lock.lock();
                if (i % 3 == 0 && i % 5 == 0) {
                    fizzbuzz.await();
                    printFizzBuzz.run();
                }
            } finally {
                lock.unlock();
            }
        }
    }

    // printNumber.accept(x) outputs "x", where x is an integer.
    public void number(IntConsumer printNumber) throws InterruptedException {
        for (int i = 1; i <= n; i++) {
            try {
                lock.lock();
                if (i % 3 == 0 && i % 5 == 0) {
                    fizzbuzz.signal();
                    continue;
                }
                if (i % 3 == 0) {
                    fizz.signal();
                    continue;
                }
                if (i % 5 == 0) {
                    buzz.signal();
                    continue;
                }
                printNumber.accept(i);
            } finally {
                lock.unlock();
            }
        }
    }
}