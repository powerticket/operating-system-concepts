public class ThreadExample3 {
    public static void main(String args[]) {
        Runnable task = () -> {
            try {
                while (true) {
                    System.out.println("Hello, Thread!");
                    Thread.sleep(500);
                }
            }
            catch (InterruptedException ie) {
                System.out.println("I'm interrupted!");
            }
        };
        Thread thread = new Thread(task);
        thread.start();
        System.out.println("Hello, My Lambda Child!");
  }
}