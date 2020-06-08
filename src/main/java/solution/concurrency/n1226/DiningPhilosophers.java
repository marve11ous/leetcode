package solution.concurrency.n1226;

class DiningPhilosophers {

    private final Integer[] forks = new Integer[]{0, 0, 0, 0, 0};

    public DiningPhilosophers() {

    }

    // call the run() method of any runnable to execute its code
    public void wantsToEat(int philosopher,
                           Runnable pickLeftFork,
                           Runnable pickRightFork,
                           Runnable eat,
                           Runnable putLeftFork,
                           Runnable putRightFork) throws InterruptedException {
        int leftFork = (philosopher + 1) % 5;
        synchronized (forks[leftFork]) {
            pickLeftFork.run();
            synchronized (forks[philosopher]) {
                pickRightFork.run();
                eat.run();
                putRightFork.run();
            }
            putLeftFork.run();
        }
    }
}