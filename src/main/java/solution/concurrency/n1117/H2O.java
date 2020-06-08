package solution.concurrency.n1117;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

class H2O {

    public H2O() {
        
    }

    private final ReentrantLock lock = new ReentrantLock();
    private final Condition h = lock.newCondition();
    private final Condition o = lock.newCondition();
    private volatile int hCnt = 0;

    public void hydrogen(Runnable releaseHydrogen) throws InterruptedException {
		try {
		    lock.lock();
		    while (hCnt == 2) {
		        o.await();
            }
            releaseHydrogen.run();
		    hCnt++;
		    h.signalAll();
        } finally {
		    lock.unlock();
        }
    }

    public void oxygen(Runnable releaseOxygen) throws InterruptedException {
        try {
            lock.lock();
            while (hCnt < 2) {
                h.await();
            }
            releaseOxygen.run();
            hCnt = 0;
            o.signalAll();
        } finally {
            lock.unlock();
        }
    }
}