public class Monitorlock4 {
    static class Counter {
        public static int count = 0;
        public void increment() {
            synchronized (this) {
                count++;
            }
        }
    }

    static class MyRunnable implements Runnable {
        Counter counter;
        public MyRunnable(Counter counter) {
            this.counter = counter;
        }
        @Override
        public void run() {
            for (int i = 0; i < 100000; i++) {
                counter.increment();
            }
        }
    }

    public static void main(String[] args) throws Exception {
        Counter counter = new Counter();
        Thread[] threads = new Thread[5];
        for (int i = 0; i < threads.length; i++) {
            threads[i] = new Thread(new MyRunnable(counter));
            threads[i].start();
        }
        for (int i = 0; i < threads.length; i++) {
            threads[i].join();
        }
        System.out.println(Counter.count);
    }
}